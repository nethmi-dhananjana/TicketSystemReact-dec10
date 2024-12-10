package org.example.ticketsystemreactspring.controller;

import org.example.ticketsystemreactspring.dto.ConfigurationDTO;
import org.example.ticketsystemreactspring.entity.Configuration;
import org.example.ticketsystemreactspring.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/configuration")
@CrossOrigin(origins = "http://localhost:3000")
public class ConfigurationController {

    @Autowired
    private ConfigurationService configurationService;

    private ConfigurationDTO configurationDTO;


    // Endpoint to update configuration
    @PostMapping("/update")
    public ResponseEntity<Configuration> updateConfiguration(@RequestBody ConfigurationDTO configurationDTO) {
        org.example.ticketsystemreactspring.entity.Configuration updatedConfig = configurationService.saveConfiguration(configurationDTO);
        return ResponseEntity.ok(updatedConfig);
    }

    // Endpoint to get current configuration
    @GetMapping("/")
    public ResponseEntity<Configuration> getConfiguration() {
        org.example.ticketsystemreactspring.entity.Configuration config = configurationService.getConfiguration();
        return ResponseEntity.ok(config);
    }

    // Endpoint to start simulation (if required)
    @PostMapping("/start")
    public ResponseEntity<String> startSimulation(@RequestBody ConfigurationDTO configurationDTO) {
        // Handle the start simulation logic
        return ResponseEntity.ok("Simulation started");
    }

    // Endpoint to stop simulation (if required)
    @PostMapping("/stop")
    public ResponseEntity<String> stopSimulation() {
        // Handle the stop simulation logic
        return ResponseEntity.ok("Simulation stopped");
    }
}
