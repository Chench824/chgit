package sise.cch.rabbitmq.recevice;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.red}"),
                exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.FANOUT)
        )
)
public class RedRecevice {

    @RabbitHandler
    public void poccess(String msg){
        System.out.println("red...........recevice"+msg);
    }
}
