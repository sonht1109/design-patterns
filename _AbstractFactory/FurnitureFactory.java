package _AbstractFactory;

public class FurnitureFactory {
  private FurnitureFactory() {
  }

  public static AbstractFactory getFactory(String type) {
    switch (type) {
      case "Wooden":
        return new WoodenFactory();
      case "Plastic":
        return new PlasticFactory();
      default:
        return null;
    }
  }

}
