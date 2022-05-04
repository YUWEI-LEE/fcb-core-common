package tw.com.fcb.dolala.core;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import tw.com.fcb.dolala.core.mq.Receiver;

@SpringBootApplication
@EnableFeignClients
public class FcbCoreCommonApplication {

//    public static final String topic = "fcb-dolala-news";
//    public static final String queue = "fcb-dolala";

    public static void main(String[] args) {
        SpringApplication.run(FcbCoreCommonApplication.class, args);
    }

//    @Bean
//    Queue queue() {
//        return new Queue(queue, false);
//    }
//
//    @Bean
//    TopicExchange exchange() {
//        return new TopicExchange(topic);
//    }
//
//    @Bean
//    Binding binding(Queue queue, TopicExchange exchange) {
//        return BindingBuilder.bind(queue).to(exchange).with("fcb.dolala.#");
//    }
//
//    @Bean
//    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
//                                             MessageListenerAdapter listenerAdapter) {
//
//        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.setQueueNames(queue);
//        container.setMessageListener(listenerAdapter);
//
//        return container;
//    }
//
//    @Bean
//    MessageListenerAdapter listenerAdapter(Receiver receiver) {
//        return new MessageListenerAdapter(receiver, "receiveMessage");
//    }
}
