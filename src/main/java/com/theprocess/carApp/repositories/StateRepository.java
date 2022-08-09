package com.theprocess.carApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theprocess.carApp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
