package com.nuoding.wechat.common.filters;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HtmlUtil;
import cn.hutool.json.JSONUtil;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author:JHC
 * @Date:2022/3/30 - 16:34
 * @Description:
 */
public class MultiReadHttpRequestWrapper extends HttpServletRequestWrapper {
    private byte[] body;

    public MultiReadHttpRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
        InputStream in = super.getInputStream();
        StringBuffer reqbody = new StringBuffer();
        InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader buffer = new BufferedReader(reader);
        String line = buffer.readLine();
        while (line != null) {
            reqbody.append(line);
            line = buffer.readLine();
        }
        buffer.close();
        reader.close();
        in.close();

        String str = "";
        if (StringUtils.isNotBlank(reqbody)) {
            Map<String, Object> map = JSONUtil.parseObj(reqbody.toString());
            Map<String, Object> resultMap = new HashMap<>(map.size());
            for (String key : map.keySet()) {
                Object val = map.get(key);
                if (map.get(key) instanceof String) {
                    resultMap.put(key, HtmlUtil.filter(val.toString()));
                } else {
                    resultMap.put(key, val);
                }
            }
            str = JSONUtil.toJsonStr(resultMap);
        }

        body = str.getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        if (!StrUtil.hasEmpty(value)) {
            value = HtmlUtil.filter(value);
        }
        return value;
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                if (!StrUtil.hasEmpty(value)) {
                    value = HtmlUtil.filter(value);
                }
                values[i] = value;
            }
        }
        return values;
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        Map<String, String[]> parameters = super.getParameterMap();
        Map<String, String[]> map = new LinkedHashMap<>();
        if (parameters != null) {
            for (String key : parameters.keySet()) {
                String[] values = parameters.get(key);
                for (int i = 0; i < values.length; i++) {
                    String value = values[i];
                    if (!StrUtil.hasEmpty(value)) {
                        value = HtmlUtil.filter(value);
                    }
                    values[i] = value;
                }
                map.put(key, values);
            }
        }
        return map;
    }

    @Override
    public String getHeader(String name) {
        String value = super.getHeader(name);
        if (!StrUtil.hasEmpty(value)) {
            value = HtmlUtil.filter(value);
        }
        return value;
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        final ByteArrayInputStream byteInputStream = new ByteArrayInputStream(this.body);
        return new ServletInputStream() {
            @Override
            public int read() {
                return byteInputStream.read();
            }

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener listener) {
            }
        };
    }
}
