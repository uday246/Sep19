package sep20;

class Stock {
	private String symbol;
	private String name;
	private double currentPrice;
	//constructor to initialize the values
	public Stock(String aSymbol, String aName) {
		super();
		symbol = aSymbol;
		name = aName;
	}
	//setters and getters
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String aSymbol) {
		symbol = aSymbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double aCurrentPrice) {
		currentPrice = aCurrentPrice;
	}
}