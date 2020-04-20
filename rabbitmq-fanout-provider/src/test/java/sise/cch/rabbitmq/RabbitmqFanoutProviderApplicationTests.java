package sise.cch.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sise.cch.rabbitmq.send.OrderSender;

@SpringBootTest
class RabbitmqFanoutProviderApplicationTests {

	@Autowired
	private OrderSender orderSender;

	@Test
	void contextLoads() {
	}

	@Test
	public void send(){
		orderSender.send("订单完成");
	}

}
