package com.felipemeirelesdev.workshop.config;

import com.felipemeirelesdev.workshop.entities.User;
import com.felipemeirelesdev.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria", "maria@gmail.com", "99999999", "12345678");
        User user2 = new User(null, "Alex", "alex@gmail.com", "88888888", "12345678");

        userRepository.saveAll(Arrays.asList(user1,user2));
    }
}
