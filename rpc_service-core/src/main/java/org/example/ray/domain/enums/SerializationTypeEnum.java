package org.example.ray.domain.enums;

import lombok.Getter;

/**
 * @author zhoulei
 * @create 2023/5/16
 * @description:
 */
public enum SerializationTypeEnum {

    KYRO((byte) 0x01, "kyro"),
    PROTOSTUFF((byte) 0x02, "protostuff"),
    HESSIAN((byte) 0X03, "hessian");

    @Getter
    private final byte code;

    private final String name;

    SerializationTypeEnum(byte code, String name) {
        this.code = code;

        this.name = name;
    }

    public static String getName(byte code) {
        for (SerializationTypeEnum c : SerializationTypeEnum.values()) {
            if (c.getCode() == code) {
                return c.name;
            }
        }
        return null;
    }

}
