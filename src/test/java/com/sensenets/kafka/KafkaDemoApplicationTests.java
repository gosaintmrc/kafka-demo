package com.sensenets.kafka;

import com.sensenets.kafka.service.IndicatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaDemoApplicationTests {
    @Autowired
    private IndicatorService indicatorService;
    @Test
    public void contextLoads() {

        indicatorService.sendMessage("topic1","Hello KafKa!");
    }

}
