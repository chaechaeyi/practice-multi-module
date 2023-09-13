package com.practice.moduleCommon.repositories;

import com.practice.moduleCommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
