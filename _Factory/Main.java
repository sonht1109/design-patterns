package _Factory;

/**
 * creational
 * giải quyết vấn đề tạo một đối tượng mà không cần thiết chỉ ra một cách chính xác lớp nào sẽ được tạo.
 * giải quyết bằng cách định nghĩa một phương thức cho việc tạo đối tượng, còn các lớp con thừa kế sẽ chỉ rõ đối tượng nào sẽ được tạo
 */

public class Main {
  public static void main(String[] args) {
    CarFactory factory = new CarFactory();
    factory.viewCar("Honda");
  }
}
