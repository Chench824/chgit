package sise.cch.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sise.cch.rabbitmq.send.Sender;

@RestController
public class SendController {

    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public void send(){
        sender.send("三千世界");
    }
}
