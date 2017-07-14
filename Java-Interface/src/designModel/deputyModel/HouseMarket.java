package designModel.deputyModel;
import java.util.Set;
import java.util.HashSet;

public class HouseMarket{
  private static Set<RenterIFC> renters=new HashSet<RenterIFC>();
  public static void registerRenter(RenterIFC renter){
    renters.add(renter);
  }

  public static RenterIFC findRenter(){
    return (RenterIFC)renters.iterator().next();
  }
}



