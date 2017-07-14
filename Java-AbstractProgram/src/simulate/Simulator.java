package simulate;

public class Simulator {
  public void playSound(Animal animal)
  {System.out.println("现在播放"+animal.getAnimalName()+"的声音 ：");
    animal.cry();
	  
  }
}
