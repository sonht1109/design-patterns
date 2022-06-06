package _Template;

/**
 * behavioral
 * tạo lên một bộ khung cho một vấn đề đang cần giải quyết (có thể cùng các bước
 * thực hiện nhưng các bước thực hiện có thể khác nhau)
 */

public class Main {
  public static void main(String[] args) {
    WoodenHouse woodenHouse = new WoodenHouse();
    woodenHouse.buildHouse();

    System.out.println("===================");

    CementHouse cementHouse = new CementHouse();
    cementHouse.buildHouse();
  }
}
