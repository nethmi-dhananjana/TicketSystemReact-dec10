package org.example.ticketsystemreactspring.dto;


import org.springframework.stereotype.Component;

@Component
public class ConfigurationDTO {

    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrivalRate;
    private int maxTicketCapacity;

    // Getters and Setters
    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    public void setTicketReleaseRate(int ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }

    public int getCustomerRetrivalRate() {
        return customerRetrivalRate;
    }

    public void setCustomerRetrivalRate(int customerRetrivalRate) {
        this.customerRetrivalRate = customerRetrivalRate;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }
}



