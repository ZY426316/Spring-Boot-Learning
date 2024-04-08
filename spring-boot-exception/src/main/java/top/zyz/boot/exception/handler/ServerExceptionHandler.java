package top.zyz.boot.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.zyz.boot.exception.exception.ServerException;
import top.zyz.boot.exception.result.Result;

@Slf4j
@RestControllerAdvice
public class ServerExceptionHandler {

    @ExceptionHandler(value = ServerException.class)
    public Result<?> handleServerException(ServerException e){
        return Result.error(e.getCode(),e.getMsg());
    }

    @ExceptionHandler(value = Exception.class)
    public Result<?> handleException(Exception e){
        return Result.error(e.getMessage());
    }
}
