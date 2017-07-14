package designModel;
interface task{
	void meeting();
}

class Boss implements task{
	public void meeting()
	{
		System.out.println("老板去开会");
	};
}

class BossDeputy implements task{
	private Boss boss;
	void registerBoss(Boss boss)
	{this.boss=boss;
	}
	public void meeting()
	{  System.out.println("给老板买机票，定旅馆，送老板");
	   this.boss.meeting();
	   System.out.println("到机场去接老板。");
		
	}
}
public class deputyDemo {
public static void main(String[] args) {
	Boss bossLi=new Boss();
	BossDeputy bossDeputyWang=new BossDeputy();
	bossDeputyWang.registerBoss(bossLi);
	bossDeputyWang.meeting();
	
}
}
