package com.service;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements MessageService {
    @Override
    public String getMessage() {
        return "こんにちは、春爛漫。夏燦燦";
    }
}