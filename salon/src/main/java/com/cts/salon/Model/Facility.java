package com.cts.salon.Model;

public class Facility {
	

    private int id;
	private String type;
	private int price;
	private String img;
	private String des;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Facility() {
		
	}
	
	
	
	public Facility(int id, String type, int price, String img, String des) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
		this.img = img;
		this.des = des;
	}
	@Override
	public String toString() {
		return "Facility [id=" + id + ", type=" + type + ", price=" + price + ", img=" + img + ", des=" + des + "]";
	}
	
	
	
	


}
