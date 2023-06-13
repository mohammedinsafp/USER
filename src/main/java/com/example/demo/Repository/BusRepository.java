package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Bus;
@Repository
public interface BusRepository extends JpaRepository<Bus,Integer> {

	Optional<Bus> findByEngineNumber(String engineNumber);

}
