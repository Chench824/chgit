package sise.cch.rabbitmq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sise.cch.rabbitmq.send.InfoSend;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqDirectProviderApplication.class)
class RabbitmqDirectProviderApplicationTests {

	@Autowired
	private InfoSend infoSend;

	@Test
	void contextLoads() {
	}

	@Test
	public void send(){
		infoSend.send("你好");
	}

}
