package top.zyz.boot.exception;

import org.springframework.stereotype.Service;
import top.zyz.boot.exception.enums.ErrorCode;
import top.zyz.boot.exception.exception.ServerException;

@Service
public class MyService {
    public void unAuthorizedError(){
        throw new ServerException(ErrorCode.UNAUTHORIZED);
    }

    public void serverError(){
        throw new ServerException(ErrorCode.INTERNAL_SERVER_ERROR);
    }

}
