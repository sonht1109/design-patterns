package _Facade;

/**
 * cung cấp giao diện đơn giản cho một hệ thống con để giao tiếp với client để che giấu sự phức tạp của hệ thống
 */

public class Main {
  public static void main(String[] args) {
    ComputerFacade computerFacade = new ComputerFacade();
    computerFacade.start();
  }  
}
