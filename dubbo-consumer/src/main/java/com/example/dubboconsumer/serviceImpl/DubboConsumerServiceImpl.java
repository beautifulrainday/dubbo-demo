package com.example.dubboconsumer.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboconsumer.service.DubboConsumerService;
import com.example.dubboprovider.service.DubboProviderService;
import org.springframework.stereotype.Service;

@Service
public class DubboConsumerServiceImpl implements DubboConsumerService {

    @Reference
    DubboProviderService dubboProviderService;

    @Override
    public String helloDubbo() {
        return dubboProviderService.helloDubbo();
    }
}
