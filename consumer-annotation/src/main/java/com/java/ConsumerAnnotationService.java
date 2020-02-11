package com.java;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("annotatedConsumer")
public class ConsumerAnnotationService {

    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String doSayHello(String name) {
        return providerServiceAnnotation.SayHelloAnnotation(name);
    }

}
