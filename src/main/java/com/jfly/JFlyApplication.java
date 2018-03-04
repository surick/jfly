package com.jfly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.jfly.*.dao")
@SpringBootApplication
public class JFlyApplication {
    public static void main(String[] args) {
        SpringApplication.run(JFlyApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    JFly启动成功      ヾ(◍°∇°◍)ﾉﾞ\n"+
                "\n" +
                "     _ ___ _      \n" +
                "  _ | | __| |_  _ \n" +
                " | || | _|| | || |\n" +
                "  \\__/|_| |_|\\_, |\n" +
                "             |__/ \n"
        );
    }
}
