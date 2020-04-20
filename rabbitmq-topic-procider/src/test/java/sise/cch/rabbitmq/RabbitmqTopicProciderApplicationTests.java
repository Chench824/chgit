package sise.cch.rabbitmq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sise.cch.rabbitmq.send.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqTopicProciderApplication.class)
class RabbitmqTopicProciderApplicationTests {

	@Autowired
	private Sender sender;

	@Test
	void contextLoads() {
	}

	@Test
	public void send(){
		sender.send("三千世界");
	}

}
