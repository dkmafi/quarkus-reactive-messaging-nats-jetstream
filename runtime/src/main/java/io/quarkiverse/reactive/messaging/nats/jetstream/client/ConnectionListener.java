package io.quarkiverse.reactive.messaging.nats.jetstream.client;

public interface ConnectionListener {

    void onEvent(ConnectionEvent event, String message);

}
