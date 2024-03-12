package top.zyz.boot.template.boot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ConfigApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功");
        log.info("测试地址：http://localhost:{}/hello", env.getProperty("server.port"));
    }
}
