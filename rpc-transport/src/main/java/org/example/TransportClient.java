package org.example;

import java.io.InputStream;

/**
 * 1.创建链接
 * 2.发送数据，并且等待响应
 * 3.关闭链接
 *
 * @author Sizhe
 */
public interface TransportClient {
    void connect(Peer peer);
    InputStream write(InputStream data);
    void close();
}
