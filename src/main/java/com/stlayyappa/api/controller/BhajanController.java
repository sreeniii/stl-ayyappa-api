package com.stlayyappa.api.controller;

import com.stlayyappa.api.dto.BhajanDTO;
import com.stlayyappa.api.service.BhajanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bhajans")
public class BhajanController {
    private final BhajanService bhajanService;

    public BhajanController(BhajanService bhajanService) {
        this.bhajanService = bhajanService;
    }

    @GetMapping
    public ResponseEntity<BhajanDTO> getBhajans() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
