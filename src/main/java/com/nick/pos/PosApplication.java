package com.nick.pos;

import com.nick.pos.model.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PosApplication implements CommandLineRunner {

    @Autowired
    PositionService positionService;


    public static void main(String[] args) {
        SpringApplication.run(PosApplication.class, args);


    }


    @Override
    public void run(String... args) throws Exception {
        positionService.tryToWrite();
    }
}
