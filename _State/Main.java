package _State;

/**
 * behavioral
 * cho phép một object có thể biến đổi hành vi của nó khi có những sự thay đổi trạng thái nội bộ.
 * tách biệt trạng thái mà ko làm ảnh hưởng tới trạng thái khác
 */

public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    context.setState(new NewState());
    context.handleRequest();

    context.setState(new RejectedState());
    context.handleRequest();
  }
}
