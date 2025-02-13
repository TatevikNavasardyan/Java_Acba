package org.example.Tickets;

public class DiscountTicket extends Ticket {
    private double discountRate;

    public DiscountTicket(int tichetId, String movieTitle, double price, double discountRate) {
        super(tichetId, movieTitle, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateFinalPrice() {
        double currentPrice=super.calculateFinalPrice();
        return (1-discountRate)*currentPrice;
    }
}
