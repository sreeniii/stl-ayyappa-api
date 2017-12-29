package com.stlayyappa.api.repository;

import com.stlayyappa.api.entity.Bhajan;
import com.stlayyappa.api.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BhajanRepository extends JpaRepository<Bhajan, Long>{
    List<Bhajan> findByLanguage(Language language);
}
