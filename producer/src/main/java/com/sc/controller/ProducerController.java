package com.sc.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "api/")
@AllArgsConstructor
public class ProducerController {

    private final StreamBridge streamBridge;

    @GetMapping(value = "value/{value}")
    public ResponseEntity<String> getValue(@PathVariable String value) {
        log.info("Sending value {} to topic", value);
        streamBridge.send("values-topic", value);
        return ResponseEntity.ok("producer is ok.");
    }

}
