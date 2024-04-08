package top.zyz.boot.exception.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import top.zyz.boot.exception.annotation.IDCard;
import top.zyz.boot.exception.annotation.Phone;

@Data
public class User {


    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;

    @Max(value = 100,message = "年龄不能超过100岁")
    @Min(value = 10,message = "年龄不能小于10岁")
    private int age;

    @Phone(message = "你的手机号码不对!!!")
    private String phone;

    @IDCard(message = "你的身份证号码不对!!!")
    private String idCard;
}
