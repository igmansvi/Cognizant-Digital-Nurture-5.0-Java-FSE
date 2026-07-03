package com.javafse.springbootapp;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private final String secret = "secretjavafsecognizantweek3springbootappsecuritytoken";

    @SuppressWarnings("deprecation")
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .signWith(io.jsonwebtoken.SignatureAlgorithm.HS256, secret)
                .compact();
    }
    
}
