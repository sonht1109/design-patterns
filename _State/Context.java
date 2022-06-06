package _State;

public class Context {
  private State state;


  public void setState(State state) {
    this.state = state;
  }

  public void handleRequest() {
    this.state.handleRequest();
  }

}
