package _Facade;

public class CPU {
  public void freeze() {
    System.out.println("CPU freeze");
  }

  public void jump(long address) {
    System.out.println("CPU jump to " + address);
  }

  public void execute() {
    System.out.println("CPU executes");
  }
}
