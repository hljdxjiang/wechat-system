package com.nuoding.wechat.api.controller;


import com.nuoding.wechat.api.service.base.BaseProcessService;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.MapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/wechat/api")
public class MainController {
    @Autowired
    private BaseProcessService baseProcessService;

    @PostMapping("/process")
    public MapResponse process(@RequestBody MapRequest request) throws IOException {
        return baseProcessService.processTask(request);
    }

    @GetMapping("/healthcheck")
    public String HealthCheck() {
        return "OK";
    }
}
