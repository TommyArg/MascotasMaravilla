package com.kt.MascotasMaravilla.config;

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
        return http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // 1. Permite entrar a todo sin login
                )
                .csrf(csrf -> csrf.disable())     // 2. ¡IMPORTANTE! Permite enviar POST desde Postman
                .headers(headers -> headers.frameOptions(frame -> frame.disable())) // (Opcional) Para ver la consola H2 si la usas
                .build();
    }
}