package sise.cch.rabbitmq.receiver;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @RabbitListener bindings:绑定队列
 *      @QueueBinding
 *          value:绑定队列的名称
 *          exchange:配置交换器
 *          key:路由器名称
 *
 *          @Queue value:绑定队列名称
 *                  autoDelete:是否是一个可删除的临时队列
 *
 *          @Exchange
 *              value:交换器名称
 *              type:交换器的具体的类型:
 *                  1.direct（点对点）
 *                  2.topic（主题订阅）
 *                  3.fanout（广播）
 */
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.info}",autoDelete = "false"),
                exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.DIRECT),
                key = "${mq.config.queue.info.routing.key}"
        )
)
public class InfoReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("info........recevier:"+msg);
    }
}
