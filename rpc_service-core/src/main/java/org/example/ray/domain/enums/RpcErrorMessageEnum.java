package org.example.ray.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @author zhoulei
 * @create 2023/5/16
 * @description:
 */
@AllArgsConstructor
@Getter
public enum RpcErrorMessageEnum {
    CLIENT_CONNECT_SERVER_FAILURE(503,"客户端连接服务端失败"),
    SERVICE_INVOCATION_FAILURE(504,"服务调用失败"),
    SERVICE_CAN_NOT_BE_FOUND(505,"没有找到指定的服务"),
    SERVICE_NOT_IMPLEMENT_ANY_INTERFACE(506,"注册的服务没有实现任何接口"),
    REQUEST_NOT_MATCH_RESPONSE(507,"返回结果错误！请求和返回的相应不匹配");

    private final Integer code;

    private final String message;

}
