package _AbstractFactory;

public class WoodenChair implements Chair {

  @Override
  public void create() {
    System.out.println("Create wooden chair");
  }
  
}
