package org.example;

import java.io.InputStream;

public class HTTPTransportClient implements TransportClient{

    @Override
    public void connect(Peer peer) {

    }

    @Override
    public InputStream write(InputStream data) {
        return null;
    }

    @Override
    public void close() {

    }
}
