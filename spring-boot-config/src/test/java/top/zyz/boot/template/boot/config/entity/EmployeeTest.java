package top.zyz.boot.template.boot.config.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    public void testEmployee() throws Exception {
        System.out.println(employee.toString());
    }
}