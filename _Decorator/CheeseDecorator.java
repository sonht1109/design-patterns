package _Decorator;

public class CheeseDecorator extends PizzaDecorator {

  public CheeseDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public void doPizza() {
    pizza.doPizza();
    addCheese();
  }

  public void addCheese() {
    System.out.println("Cheese is added");
  }
  
}
