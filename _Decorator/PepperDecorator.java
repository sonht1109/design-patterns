package _Decorator;

public class PepperDecorator extends PizzaDecorator {

  public PepperDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public void doPizza() {
    pizza.doPizza();
    addPepper();
  }

  public void addPepper() {
    System.out.println("Pepper is added");
  }
  
}
