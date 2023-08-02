package com.practice.moduleapi.service;

import com.practice.moduleCommon.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PerchaseService {
    private final CommonService commonService;

    public String find(){
        commonService.commonService();
        return "find one";
    }
}
