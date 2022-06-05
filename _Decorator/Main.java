package _Decorator;

/**
 * structural
 * cho phép người dùng thêm chức năng mới vào đối tượng hiện tại mà không muốn ảnh hưởng đến các đối tượng khác
 */

public class Main {
  public static void main(String[] args) {
    ChikenPizza pizza = new ChikenPizza();

    CheeseDecorator cheeseDecorator = new CheeseDecorator(pizza);
    cheeseDecorator.doPizza();

    PepperDecorator pepperDecorator = new PepperDecorator(pizza);
    pepperDecorator.doPizza();
  }
}