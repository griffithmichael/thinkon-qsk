package com.example.thinkon;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public ResponseEntity<String> welcome(){
        String message = "{ \"message\": \"Submission for Michael Griffith \" }";
        return ResponseEntity.ok()
                .header("Content-Type", "application/json")
                .body(message);
    }
}
