package com.aise.mcnugu.repository;

import com.aise.mcnugu.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
