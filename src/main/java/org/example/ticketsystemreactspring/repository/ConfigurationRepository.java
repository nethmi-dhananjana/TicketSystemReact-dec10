package org.example.ticketsystemreactspring.repository;


import org.example.ticketsystemreactspring.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
    Configuration findTopByOrderByIdDesc();

}