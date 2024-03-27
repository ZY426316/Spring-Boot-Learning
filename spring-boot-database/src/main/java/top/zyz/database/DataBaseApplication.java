package top.zyz.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zzy
 */
@SpringBootApplication
@MapperScan(basePackages = {"top.zyz.database.mapper"})
public class DataBaseApplication {
    public static void main(String[] args){
        SpringApplication.run(DataBaseApplication.class,args);
    }
}
