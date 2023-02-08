package com.example.examplespring;

import com.example.examplespring.repository.MemberRepository;
import com.example.examplespring.repository.MemoryMemberRepository;
import com.example.examplespring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
