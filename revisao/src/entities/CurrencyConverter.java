package entities;

public class CurrencyConverter {
	public static double dollar;
	public static double quantity;
	
	public static double converter() {
		return ((dollar*0.06*quantity)+(dollar*quantity));
	}
	
}
