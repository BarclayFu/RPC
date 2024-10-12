package org.example;

/**
 * 反序列化
 *
 * @author Sizhe
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
