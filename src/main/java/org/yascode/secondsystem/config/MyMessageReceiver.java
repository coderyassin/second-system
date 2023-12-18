package org.yascode.secondsystem.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.yascode.secondsystem.model.Application;

@Component
public class MyMessageReceiver {

    //@RabbitListener(queues = "applications-queue")
    public void receiveFromQueue(Application application) {
        /*byte[] body = message.getBody();
        String receivedMessage = new String(body);

        // Deserialize the received JSON message to your Application entity
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Application application = objectMapper.readValue(receivedMessage, Application.class);
            processApplication(application);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
        processApplication(application);
    }

    private void processApplication(Application application) {
        // Implement your business logic to process the received Application entity
        System.out.println("Received Application: " + application);
        // Add your processing logic here
    }

}
