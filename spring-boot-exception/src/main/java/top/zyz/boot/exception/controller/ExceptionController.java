package top.zyz.boot.exception.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.zyz.boot.exception.MyService;

@RestController
public class ExceptionController {
    @Resource
    public MyService myService;

    @GetMapping("/user/{id}")
    public void getUser(@PathVariable("id") Integer id){
        if(id == 1){
            myService.unAuthorizedError();
        }else {
            myService.serverError();
        }
    }
}
