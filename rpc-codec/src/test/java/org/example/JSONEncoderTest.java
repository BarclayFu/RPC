package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("Barclay");
        bean.setAge(18);

        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}