package top.zyz.boot.template.boot.config.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTest {

    @Resource
    private Dog dog;

    @Resource
    private  Person person;

    @Test
    void name(){
        System.out.println(dog);
        System.out.println(person);
    }
}