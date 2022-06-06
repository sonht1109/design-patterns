package _AbstractFactory;

public class WoodenFactory extends AbstractFactory {

  @Override
  public Chair createChair() {
    return new WoodenChair();
  }

  @Override
  public Table createTable() {
    return new WoodenTable();
  }
  
}
