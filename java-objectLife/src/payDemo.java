interface Pay
{public Boolean payMonney();}
class ICBCBank implements Pay
{

	@Override
	public Boolean payMonney() {
		// TODO Auto-generated method stub
		System.out.println("���빤��������ҳ��Ǯ");
		System.out.println("����ɹ�");
		return true;
	}}

class CBCBank implements Pay
{

	@Override
	public Boolean payMonney() {
		// TODO Auto-generated method stub
		System.out.println("���뽨��������ҳ��Ǯ");
		System.out.println("����ɹ�");
		return true;
	}}

class BankFactory
{public static Pay ChooseBank(String bankName) throws Exception
  {if ("��������".equals(bankName))
	  return new ICBCBank();
  else if ("��������".equals(bankName))
     return new CBCBank();
  else 
	  throw new Exception("û���������");
  }
	}
public class payDemo {
public static void main(String[] args) {
	System.out.println("�˿�ѡ����Ʒ���¶���");
	Pay p;
	try {
		p = BankFactory.ChooseBank("����");
		p.payMonney();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
}
}
