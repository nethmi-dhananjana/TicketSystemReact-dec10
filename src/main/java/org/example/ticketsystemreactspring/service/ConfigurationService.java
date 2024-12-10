package org.example.ticketsystemreactspring.service;


import org.example.ticketsystemreactspring.dto.ConfigurationDTO;
import org.example.ticketsystemreactspring.entity.Configuration;
import org.example.ticketsystemreactspring.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

    @Autowired
    private ConfigurationRepository configurationRepository;

    // Save configuration to DB
    public Configuration saveConfiguration(ConfigurationDTO configurationDTO) {
        Configuration configuration = new Configuration();
        configuration.setTotalTickets(configurationDTO.getTotalTickets());
        configuration.setTicketReleaseRate(configurationDTO.getTicketReleaseRate());
        configuration.setCustomerRetrivalRate(configurationDTO.getCustomerRetrivalRate());
        configuration.setMaxTicketCapacity(configurationDTO.getMaxTicketCapacity());
        return configurationRepository.save(configuration);
    }

    // Get configuration from DB
    public Configuration getConfiguration() {
        return configurationRepository.findTopByOrderByIdDesc();
    }
}
