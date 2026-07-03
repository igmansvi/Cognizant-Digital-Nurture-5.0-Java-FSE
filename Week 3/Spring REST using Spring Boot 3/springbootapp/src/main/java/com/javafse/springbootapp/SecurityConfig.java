package com.javafse.springbootapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /*
        -- Security Filter Chain Configuration
        Disables CSRF, requires auth for /authenticate, and permits all others
    */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth ->
                auth
                    .requestMatchers("/authenticate").authenticated()
                    .anyRequest().permitAll()
            )
            .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    /*
        -- In-Memory User Details Manager
        Creates a default user with username 'user' and password 'pwd'
    */
    @Bean
    public UserDetailsService users() {
        UserDetails user = User
                .withUsername("user")
                .password("{noop}pwd")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
