package com.practice.moduleapi.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.practice.moduleCommon.enums.Purchase;
import lombok.*;

@Setter
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class ResponseFormat<T> {
    private int returnCode;
    private String returnMessage;
    private T info;

    public ResponseFormat(Purchase purchase){
        setReturnCode(purchase.getStatusCode());

    }

    public ResponseFormat(T info){
        setReturnCode(Purchase.SUCCESS.getStatusCode());
        setReturnMessage(Purchase.SUCCESS.getMessage());
        setInfo(info);
    }

    public ResponseFormat(Purchase purchase, T info){
        setReturnCode(purchase.getStatusCode());
        setReturnMessage(purchase.getMessage());
        setInfo(info);
    }

}
