package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
* 表示 网络传输的一个端点
 * @author Sizhe
* */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
