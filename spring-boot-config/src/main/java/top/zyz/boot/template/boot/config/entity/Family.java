package top.zyz.boot.template.boot.config.entity;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import top.zyz.boot.template.boot.config.factory.MixPropertySourceFactory;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")   //表示配置的整体前缀
@PropertySource(value = {"classpath:family.properties"}, factory = MixPropertySourceFactory.class)
public class Family {
    private String familyName;

    private String father;

    private String mother;

    private String child;
    private Integer age;
}
