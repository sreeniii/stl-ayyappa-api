package com.stlayyappa.api.service;

import com.stlayyappa.api.repository.BhajanRepository;
import org.springframework.stereotype.Component;

@Component
public class BhajanService {
    private final BhajanRepository bhajanRepository;

    public BhajanService(BhajanRepository bhajanRepository) {
        this.bhajanRepository = bhajanRepository;
    }
}
