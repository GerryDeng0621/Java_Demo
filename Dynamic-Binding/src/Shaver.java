

public class Shaver {
 public Power power;
 public Shaver(Power power)
 { this.power=power;
 }
	
 public void shave()
 {power.providPower();
	 System.out.println("ÃÍ–Î");
 }

}
