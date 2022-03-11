package com.es.agriculturafamiliar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/dummy")
public class DummyController {
    
    @GetMapping
    public ResponseEntity<?> hullo() {
        return ResponseEntity.ok("hullo");
    }
}
