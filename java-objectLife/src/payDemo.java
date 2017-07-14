interface Pay
{public Boolean payMonney();}
class ICBCBank implements Pay
{

	@Override
	public Boolean payMonney() {
		// TODO Auto-generated method stub
		System.out.println("进入工商银行网页付钱");
		System.out.println("付款成功");
		return true;
	}}

class CBCBank implements Pay
{

	@Override
	public Boolean payMonney() {
		// TODO Auto-generated method stub
		System.out.println("进入建设银行网页付钱");
		System.out.println("付款成功");
		return true;
	}}

class BankFactory
{public static Pay ChooseBank(String bankName) throws Exception
  {if ("工商银行".equals(bankName))
	  return new ICBCBank();
  else if ("建设银行".equals(bankName))
     return new CBCBank();
  else 
	  throw new Exception("没有这个银行");
  }
	}
public class payDemo {
public static void main(String[] args) {
	System.out.println("顾客选择商品，下订单");
	Pay p;
	try {
		p = BankFactory.ChooseBank("银行");
		p.payMonney();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
}
}
