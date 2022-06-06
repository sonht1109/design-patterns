package _State;

public class NewState implements State
 {

  @Override
  public void handleRequest() {
    System.out.println("New document");
  }
  
}
