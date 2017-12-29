package com.stlayyappa.api.service;

import com.stlayyappa.api.dto.BhajanDTO;
import com.stlayyappa.api.entity.Bhajan;
import com.stlayyappa.api.entity.Language;
import com.stlayyappa.api.repository.BhajanRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BhajanService {
    private final BhajanRepository bhajanRepository;

    public BhajanService(BhajanRepository bhajanRepository) {
        this.bhajanRepository = bhajanRepository;
    }

    public List<Bhajan> getBhajanListByLanguage(Language language) {
        return bhajanRepository.findByLanguage(language);
    }
}
