
import java.util.Map;
import java.util.Arrays;

public class PricesDisplay implements Observer, DisplayElement
{
    private Subject priceData;
    private String name;
    private Map<String,Double> priceMap;
	private Map<String, Double> sStocks;
	private String a;
	private String b;
	private String d;
	private String c;
    public PricesDisplay(String string, PriceData priceData)
    {
        this.priceData = priceData;
        this.name = string;
        priceData.registerObserver(this);
    }
    @Override
    public void display()
    {
		if (this.name == ("00001")) {
			System.out.printf("Portfolio #%s, ASD = %.2f, ADM = %.2f, AAC = %.2f, AFAS = %.2f %n", name, priceMap.get(a), priceMap.get(b), priceMap.get(c), priceMap.get(d));

		}
		else {
			System.out.printf("Portfolio #%s, BSD = %.2f, BDM = %.2f, BAC = %.2f, BFAS = %.2f %n \n", name, priceMap.get(a), priceMap.get(b), priceMap.get(c), priceMap.get(d));

		}
    }
    @Override
    public void update(Map priceMap) {
        this.priceMap = priceMap;
        display();
    }

	public void setStocks(String[] stonks) {
		
		a = stonks[0];
		b = stonks[1];
		c = stonks[2];
		d = stonks[3];
		}		
		
		
	}
    
    

