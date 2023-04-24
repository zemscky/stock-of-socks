package com.example.stockofsocks.controller;


import com.example.stockofsocks.constant.StockOperation;
import com.example.stockofsocks.dto.SocksDto;
import com.example.stockofsocks.service.SocksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/socks")
public class SocksController {

    private final SocksService socksService;

    @PostMapping("/income")
    public ResponseEntity<SocksDto> postSocksIncome(@RequestBody SocksDto sock) {
        return ResponseEntity.ok(socksService.postIncome(sock));
    }

    @PostMapping("/outcome")
    public ResponseEntity<SocksDto> postSocksOutcome(@RequestBody SocksDto sock) {
        return ResponseEntity.ok(socksService.postOutcome(sock));
    }

    @GetMapping
    public ResponseEntity<Collection<SocksDto>> getSocks(@RequestParam String color,
                                                         @RequestParam StockOperation operation,
                                                         @RequestParam int cottonPart) {
        return ResponseEntity.ok(socksService.getSocks(color, operation, cottonPart));
    }
}

