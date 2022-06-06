package _AbstractFactory;

public class WoodenTable implements Table {

  @Override
  public void create() {
    System.out.println("Create wooden table");
  }

}
