package org.yascode.secondsystem.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessagingConfig {

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

}
