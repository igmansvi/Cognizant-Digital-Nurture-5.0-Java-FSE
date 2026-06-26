package com.javafse.springbootapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javafse.springbootapp.model.Country;
import com.javafse.springbootapp.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
