package _Flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {
  private static final Map<String, ConcreteSoldier> soldiers = new HashMap<>();

  private SoldierFactory() {}

  public static synchronized Soldier createSoldier(String name) {
    ConcreteSoldier soldier = soldiers.get(name);
    if(soldier == null) {
      waitingForCreatingASoldier();
      soldier = new ConcreteSoldier(name);
      soldiers.put(name, soldier);
    }
    return soldier;
  }

  public static synchronized int getTotal() {
    return soldiers.size();
  }

  private static void waitingForCreatingASoldier() {
    try {
      Thread.sleep(2000);
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
