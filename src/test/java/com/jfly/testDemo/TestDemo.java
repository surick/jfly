package com.jfly.testDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void jTestDemo() {

    }

    @GetMapping("/test/demo")
    String restTest() {
        Integer i = null;
        i++;
        return "hello test";
    }

}
