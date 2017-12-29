package com.stlayyappa.api.controller;

import com.stlayyappa.api.entity.Bhajan;
import com.stlayyappa.api.entity.Language;
import com.stlayyappa.api.service.BhajanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bhajans")
public class BhajanController {
    private final BhajanService bhajanService;

    public BhajanController(BhajanService bhajanService) {
        this.bhajanService = bhajanService;
    }

    @GetMapping("/{language}")
    public ResponseEntity<List<Bhajan>> getBhajans(@PathVariable Language language) {
        List<Bhajan> bhajans = bhajanService.getBhajanListByLanguage(language);
        return new ResponseEntity<>(bhajans, HttpStatus.OK);
    }
}
