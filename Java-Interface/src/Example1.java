interface buy{
	public void buyTicket(); 
}

interface ControlTemperate
{public void controlTemp();
	}

class Bus implements buy
{	public void buyTicket() {
		System.out.println("公共汽车：一元钱一张");
		
	} 
	}

class Taxi implements buy,ControlTemperate
{	public void controlTemp() {
      System.out.println("安装了hair空调");
	}

	public void buyTicket() {
		System.out.println("起步价10元，1.5元/公里");
	}
	}

class Cinema implements buy,ControlTemperate{
	public void buyTicket()
	{System.out.println("电影票：门票，十元/张");
		
	}
	@Override
	public void controlTemp() {
	System.out.println("安装了中央空调");
		
	}
}

public class Example1 {
  public static void main(String[] args) {
	Bus bus1=new Bus();
	Taxi taxi1=new Taxi();
	Cinema cinema1=new Cinema();
	bus1.buyTicket();
	taxi1.buyTicket();
	cinema1.buyTicket();
	taxi1.controlTemp();
	cinema1.controlTemp();
}
}
