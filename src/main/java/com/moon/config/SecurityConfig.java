package com.moon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorize -> authorize
                        .requestMatchers("/", "/login", "/signup").permitAll() // 해당 URL을 인증없이 누구나 접근가능하게 허용
                        .anyRequest().authenticated() // 모든 요청에 대해 인증을 요구
                )
                .formLogin(formLogin -> formLogin
                        .loginPage("/login") // 커스텀 로그인 페이지 경로 설정
                        .permitAll() // 로그인 페이지는 인증 없이 접근 가능하도록 설정
                );
        return http.build();
    }
}


