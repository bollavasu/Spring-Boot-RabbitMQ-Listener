package com.javainuse;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.javainuse.Employee;

@Component
public class VasuListener {

    @RabbitListener(queues = "VasuQueue1")
    public void receive(Employee employee) {
        System.out.println("Received form Queue : " + employee);
    }
}