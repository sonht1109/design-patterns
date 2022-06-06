package _State;

public class RejectedState implements State {

  @Override
  public void handleRequest() {
    System.out.println("Document is rejected");
  }

}
