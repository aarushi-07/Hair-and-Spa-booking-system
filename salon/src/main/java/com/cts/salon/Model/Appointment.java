package com.cts.salon.Model;
import java.util.Date;

public class Appointment {
	private int price;
	private Date appointment;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getAppointment() {
		return appointment;
	}
	public void setAppointment(Date appointment) {
		this.appointment = appointment;
	}
	
	public Appointment()
	{
	}
	public Appointment(int price, Date appointment) {
		super();
		this.price = price;
		this.appointment = appointment;
	}
	@Override
	public String toString() {
		return "Appointment [price=" + price + ", appointment=" + appointment + "]";
	}
	
	
	

}
