package com.gavin.consumer.controller;

import com.gavin.dubbo.service.DubboService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jiwen.cao
 * @Date 2021/9/7
 * @Description
 */
@Slf4j
@RestController
public class DubboController {

    @Reference(version = "${service.version}")
    private DubboService dubboService;

    @GetMapping("/d")
    public String getResiult(String a){
        String rst = dubboService.doSayHello(a);
        log.info("返回结果：{}", rst);
        return rst;
    }
}
