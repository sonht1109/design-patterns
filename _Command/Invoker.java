package _Command;

public class Invoker {
  private Command command;

  public Invoker() {
    
  }

  public Invoker(Command command) {
    this.command = command;
  }


  public Command getCommand() {
    return this.command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void run() {
    this.command.execute();
  }
}
