package _Observer;

/**
 * behavioral
 * định nghĩa sự phụ thuộc 1-n giữa các đối tượng
 * để khi có một đối tượng thay đổi thì các thành phần phụ thuộc sẽ nhận được
 * thông báo và cập nhật tự động
 */

public class Main {
  public static void main(String[] args) {
    Subject s = new Subject();
    Observer o1 = new Observer() {
      @Override
      public void update(String message) {
        System.out.println("Observer 1 update: " + message);
      }
    };

    Observer o2 = new Observer() {
      @Override
      public void update(String message) {
        System.out.println("Observer 2 update : " + message);
      }
    };

    s.attach(o1);
    s.attach(o2);

    s.notifyChange("Attach o1, o2");

    s.detach(o1);
    s.notifyChange("Detach o1");
  }
}
