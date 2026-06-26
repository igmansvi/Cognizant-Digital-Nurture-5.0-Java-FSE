package com.javafse.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javafse.springbootapp.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {}
