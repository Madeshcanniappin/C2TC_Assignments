package com.Madesh.Assignments.four;

public class TicketBooking {
 
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//methods
	
	public void makePayment(Double amount)  //cash payment
	{
		System.out.printf("The amount %.1f paid using \n",amount);
		
	}
	
	
	public void makePayment(String walletNumber,Double amount) //wallet payment
	{
		System.out.printf("The amount %.1f paid uisng the wallet number %s \n",amount, walletNumber);
	}
	
	
	public void makePayment(String name,String creditCard, String ccv,Double amount) //card Payment
	{
	  	System.out.printf("The amount %.1f paid using credit card by %s \n",amount,name);
	}
}
