package com.practice.moduleapi.exception;

import com.practice.moduleCommon.enums.Purchase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomException extends RuntimeException{
    private int returnStateCode;
    private String returnMessage;

    public CustomException(Purchase purchase){
        super(purchase.getMessage());
        setReturnStateCode(purchase.getStatusCode());
        setReturnMessage(purchase.getMessage());
    }
}
