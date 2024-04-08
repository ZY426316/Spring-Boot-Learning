package top.zyz.boot.exception.controller;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.zyz.boot.exception.entity.User;
import top.zyz.boot.exception.result.Result;

@RestController
public class UserController {

    @PostMapping("/user/add")
    public Result<?> addUser(@Valid @RequestBody User user, BindingResult bindingResult) {
        return Result.ok(user);
    }
}
