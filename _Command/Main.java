package _Command;

/**
 * behavioral
 * chuyển đổi yêu cầu thành một đối tượng độc lập, có thể truyền tham số
 */

public class Main {
  public static void main(String[] args) {

    Light light = new Light();
    Invoker invoker = new Invoker();
    
    TurnOnCommand onCommand = new TurnOnCommand(light);
    TurnOffCommand offCommand = new TurnOffCommand(light);

    invoker.setCommand(onCommand);
    invoker.run();

    invoker.setCommand(offCommand);
    invoker.run();
  }
}
