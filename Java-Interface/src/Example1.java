interface buy{
	public void buyTicket(); 
}

interface ControlTemperate
{public void controlTemp();
	}

class Bus implements buy
{	public void buyTicket() {
		System.out.println("����������һԪǮһ��");
		
	} 
	}

class Taxi implements buy,ControlTemperate
{	public void controlTemp() {
      System.out.println("��װ��hair�յ�");
	}

	public void buyTicket() {
		System.out.println("�𲽼�10Ԫ��1.5Ԫ/����");
	}
	}

class Cinema implements buy,ControlTemperate{
	public void buyTicket()
	{System.out.println("��ӰƱ����Ʊ��ʮԪ/��");
		
	}
	@Override
	public void controlTemp() {
	System.out.println("��װ������յ�");
		
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
