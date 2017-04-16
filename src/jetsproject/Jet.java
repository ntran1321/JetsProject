package jetsproject;

public class Jet {
	private String model;
	private double speed;
	private double range;
	private double price;
	
	public Jet(){
		
	}
	
	public Jet (String model, double speed, double range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet model= ");
		builder.append(model);
		builder.append(", speed= ");
		builder.append(speed);
		builder.append(" mach");
		builder.append(", range= ");
		builder.append(range);
		builder.append(" miles");
		builder.append(", price= ");
		builder.append(price);
		builder.append(" million");
		builder.append("");
		return builder.toString();
	}
	
	
	
	
}
