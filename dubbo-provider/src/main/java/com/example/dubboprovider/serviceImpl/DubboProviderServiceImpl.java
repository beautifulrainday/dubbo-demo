package com.example.dubboprovider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboprovider.service.DubboProviderService;
import org.springframework.stereotype.Component;

@Service
@Component
public class DubboProviderServiceImpl implements DubboProviderService {

    @Override
    public String helloDubbo() {
        return "helloDubbo";
    }
}
