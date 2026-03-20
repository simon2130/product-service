//simon
package com.ctbe.simon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<Map<String,String>> health(){
        return ResponseEntity.ok(Map.of(
                "service","product-service",
                "version","1.0.0",
                "status","UP",
                "timestamp", Instant.now().toString()
        ));
    }
}