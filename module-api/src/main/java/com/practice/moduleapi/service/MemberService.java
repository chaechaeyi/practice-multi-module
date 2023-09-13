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
public class MemberService {
    private final MemberRepository memberRepository;

    public String save(){
        memberRepository.save(Member.builder().name(Thread.currentThread().getName()).build());
        return "save";
    }

    public String find(){
        int size = memberRepository.findAll().size();
        return "find size";
    }
}
