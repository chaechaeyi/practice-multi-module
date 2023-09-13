package com.practice.moduleCommon.service;

import com.practice.moduleCommon.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommonService {
    public String commonService(){
        return "commonService";
    }
}
