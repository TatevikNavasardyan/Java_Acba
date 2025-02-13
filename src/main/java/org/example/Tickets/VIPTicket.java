package org.example.Tickets;

public class VIPTicket extends Ticket{
    double vipFee;
    public VIPTicket(int tichetId, String movieTitle, double price, double vipFee){
        super(tichetId, movieTitle, price);
        this.vipFee=vipFee;
    }
    public double calculateFinalPrice(){
        return super.calculateFinalPrice()+vipFee;
    }
}
