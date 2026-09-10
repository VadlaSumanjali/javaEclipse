package functionalInterfaces;
import java.util.function.*;
class SensorDate{
	double temperature;
	double humidity;
	public SensorDate(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	} 
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
}
public class Exampl4 {
	public static void main(String[] args) {
		Function<SensorDate,Double> f=new Function<SensorDate, Double>() {
			
			@Override
			public Double apply(SensorDate t) {
				return t.getTemperature();
			}
		};
		
		Function<Double, Boolean> b=new Function<Double, Boolean>() {
			
			@Override
			public Boolean apply(Double t) {
				return t>25.0;
			}
		};
		
		SensorDate s=new SensorDate(120, 111);
		System.out.println(f.apply(s));
		System.out.println(b.apply(s.getTemperature()));

	}

}
