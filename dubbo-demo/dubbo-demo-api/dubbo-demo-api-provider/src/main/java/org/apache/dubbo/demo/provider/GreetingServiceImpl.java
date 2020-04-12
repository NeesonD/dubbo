package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.GreetingService;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author daile
 * @version 1.0
 * @date 2020/4/12 22:40
 */
public class GreetingServiceImpl implements GreetingService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);


    @Override
    public String hello() {
        logger.info("Hello "  + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello "  + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
