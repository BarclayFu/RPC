package org.example;

/**
 * @author Sizhe
 */

import com.alibaba.fastjson.JSON;

public class JSONEncoder implements Encoder{
    @Override
    public byte[] encode(Object obj){
        return JSON.toJSONBytes(obj);
    }
}
