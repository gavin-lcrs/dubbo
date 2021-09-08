package com.gavin.provider.service;

import com.gavin.dubbo.service.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author jiwen.cao
 * @Date 2021/9/7
 * @Description
 */
@Service(version = "${service.version}")
public class DubboServiceImpl implements DubboService {

    @Override
    public String doSayHello(String s) {
        return String.format("do %s helle", s);
    }
}
