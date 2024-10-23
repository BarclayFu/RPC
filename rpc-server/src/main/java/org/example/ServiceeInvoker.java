package org.example;

import org.example.utils.ReflectionUtils;

/**
 * 调用具体服务
 *
 * @author Sizhe
 */
public class ServiceeInvoker {
    public Object invoke(ServiceInstance service, Request request){
        return ReflectionUtils.invoke(
                service.getTarget(),
                service.getMethod(),
                request.getParameters()
        );
    }
}
