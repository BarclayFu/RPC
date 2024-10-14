package org.example;

/**
 * 1.启动、监听端口
 * 2.接受请求
 * 3.关闭监听
 *
 * @author Sizhe
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);
    void start();
    void stop();
}
