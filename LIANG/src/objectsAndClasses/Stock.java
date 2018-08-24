package objectsAndClasses;

import java.util.Date;

public class Stock {

	public static void main(String[] args) {
		// This program creates a stock object and calculates the % change in price
		
		Stock stk = new Stock("ORCL", "Oracle Corporation");
		
		stk.setPreviousClosingPrice(34.5);
		stk.setCurrentPrice(34.35);
		
		System.out.println(stk.name + " - \"" + stk.symbol + "\n" +
				"Created on: " + stk.date.toString() + "\n" +
				"Previous Stock Price: " + stk.previousClosingPrice + "\n" +
				"Current Stock Price : " + stk.currentPrice + "\n" +
				"% Change: " + String.format("%.3f", stk.getChangePercent()));
	}
	
	private String symbol;
	private String name;
	final private Date date;
	private double previousClosingPrice = 0;
	private double currentPrice = 0;
	
	Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
		date = new Date();
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getChangePercent() {
		if(this.previousClosingPrice == 0 || this.currentPrice == 0)
			return 0.0;
		else
			return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice;
	}

}
