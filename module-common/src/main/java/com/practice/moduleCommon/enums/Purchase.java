package com.practice.moduleCommon.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Purchase {
    SUCCESS(0000, "success"),
    NOT_EXIST(0004, "not found");

    private int statusCode;
    private String message;
}
