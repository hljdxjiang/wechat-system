package com.nuoding.wechat.background.controller.file;

import com.nuoding.wechat.background.model.file.FileUploadDTO;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.base.MapResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/fileUpload")
public class FileUploadController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/uploadFile")
    public MapResponse uploadFile(@RequestBody FileUploadDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("uploadFile begin.fileType:{}", dto.getFileType());
        Map map=new HashMap();
        map.put("path","https://logodownload.org/wp-content/uploads/2020/04/excel-logo-0.png");
        mapResponse.setData(map);
        return mapResponse;
    }
}
