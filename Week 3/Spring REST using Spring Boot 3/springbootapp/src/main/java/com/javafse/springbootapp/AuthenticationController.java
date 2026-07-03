package com.javafse.springbootapp;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    private final JwtUtil jwtUtil;

    /*
        -- Constructor for dependency injection of JwtUtil
    */
    AuthenticationController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    
    /*
        Mapping GET request to /authenticate
        Decodes Basic Auth credentials and returns a JWT token
    */
    @GetMapping("/authenticate")
    public Map<String,String> authenticate(HttpServletRequest request){
        String authHeader = request.getHeader("Authorization");
        String base64 = authHeader.substring(6);
        byte[] decoded = Base64.getDecoder().decode(base64);
        String credentials = new String(decoded);
        String username = credentials.split(":")[0];
        String token = jwtUtil.generateToken(username);
        Map<String,String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
