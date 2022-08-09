package com.theprocess.carApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theprocess.carApp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
