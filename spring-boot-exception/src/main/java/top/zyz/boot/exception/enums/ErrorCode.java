package top.zyz.boot.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNAUTHORIZED(401,"登录失效，请重新登录"),
    INTERNAL_SERVER_ERROR(500,"服务器异常，请稍后再试"),
    UNKNOW_ERROR(999,"未知错误");

    private final int code;
    private final String msg;

}
