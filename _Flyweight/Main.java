package _Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * structural
 * cho phép tái sử dụng lại các đối tượng đã tồn tại bằng cách lưu trữ chúng
 * hoặc tạo mới nếu chưa có
 */

public class Main {
  private static List<Soldier> soldiers = new ArrayList<>();

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    createSoldier(5, "Solder 1", 5);
    createSoldier(3, "Solder 2", 4);
    createSoldier(2, "Solder 3", 3);
    long endTime = System.currentTimeMillis();

    System.out.println("Total soldiers: " + soldiers.size());
    System.out.println("Total soldier types: " + SoldierFactory.getTotal());
    System.out.println("Total time: " + (endTime - startTime));

  }

  private static void createSoldier(int number, String name, int star) {
    for (int i = 0; i < number; i++) {
      _Flyweight.State state = new _Flyweight.State(soldiers.size() + i + "", star);
      Soldier soldier = SoldierFactory.createSoldier(name);
      soldier.promote(state);
      soldiers.add(soldier);
    }
  }
}
