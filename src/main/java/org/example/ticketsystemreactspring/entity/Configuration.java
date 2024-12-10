package org.example.ticketsystemreactspring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
    public class Configuration {

    @jakarta.persistence.Id
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

