package org.yascode.secondsystem.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.yascode.secondsystem.model.Application;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "applications-queue")
    public void recievedMessage(Application application) {
        System.out.println("Recieved Message From RabbitMQ: " + application);
    }

}
