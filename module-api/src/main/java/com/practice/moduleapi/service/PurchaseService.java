package com.practice.moduleapi.service;

import com.practice.moduleCommon.domain.Member;
import com.practice.moduleCommon.enums.Purchase;
import com.practice.moduleCommon.repositories.MemberRepository;
import com.practice.moduleCommon.service.CommonService;
import com.practice.moduleapi.exception.CustomException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseService {
    private final CommonService commonService;

    public String find(){
        commonService.commonService();
        return "find one";
    }

    public String exception(){
        if(true){
            throw new CustomException(Purchase.NOT_EXIST);
        }
        return "exception";
    }
}
