package designModel;
interface task{
	void meeting();
}

class Boss implements task{
	public void meeting()
	{
		System.out.println("�ϰ�ȥ����");
	};
}

class BossDeputy implements task{
	private Boss boss;
	void registerBoss(Boss boss)
	{this.boss=boss;
	}
	public void meeting()
	{  System.out.println("���ϰ����Ʊ�����ùݣ����ϰ�");
	   this.boss.meeting();
	   System.out.println("������ȥ���ϰ塣");
		
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
