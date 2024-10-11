package org.example;

import lombok.Data;

/*
* 表示RPC的一个请求
* */
@Data
public class Request {
    private  ServiceDescriptor serviceDescriptor;
    private Object[] parameters;
}
