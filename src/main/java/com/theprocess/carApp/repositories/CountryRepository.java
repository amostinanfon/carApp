package com.theprocess.carApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theprocess.carApp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
