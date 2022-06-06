package _Flyweight;

public class ConcreteSoldier implements Soldier {

  private final String name;

  public ConcreteSoldier(String name) {
    this.name = name;
  }

  @Override
  public void promote(State state) {
    System.out.println(this.name + " - " + state.getId() + " - " + state.getStar() + " is promoted");
  }
  
}
