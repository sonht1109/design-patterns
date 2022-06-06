package _AbstractFactory;

/**
 * creational
 * dùng để tạo ra một super-factory để tạo ra các factory khác
 */

public class Main {
  public static void main(String[] args) {
    AbstractFactory woodenFactory = FurnitureFactory.getFactory("Wooden");
    
    Chair chair = woodenFactory.createChair();
    chair.create();

    Table table = woodenFactory.createTable();
    table.create();
  }
}
