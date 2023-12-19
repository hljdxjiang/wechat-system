package com.nuoding.wechat.api.controller;


import com.nuoding.wechat.api.service.base.BaseProcessService;
import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/wechat/api")
public class MainController {
    public MainController(BaseProcessService baseProcessService) {
        this.baseProcessService = baseProcessService;
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final BaseProcessService baseProcessService;

    @PostMapping("/process")
    public MapResponse process(@RequestBody MapRequest request) throws IOException {
        logger.info("process begin.request;{}", JsonUtil.obj2Json(request));
        MapResponse mapResponse = baseProcessService.processTask(request);
        logger.info("process end.response;{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    @GetMapping("/healthcheck")
    public String HealthCheck() {
        return "OK";
    }
}
