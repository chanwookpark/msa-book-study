package msabook.ch02.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "TestQ")
    public void processMessage(String message) {
        System.out.println("Listening message : " + message);
    }
}
