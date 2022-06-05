package _Prototype;

/**
 * creational
 * quy định loại của các đối tượng cần tạo bằng cách dùng một đối tượng mẫu, tạo
 * mới nhờ vào sao chép đối tượng mẫu này mà không làm cho code phụ thuộc vào
 * các lớp của chúng
 * được dùng khi việc tạo một object tốn nhiều chi phí và thời gian trong khi
 * bạn đã có một object tương tự tồn tại
 * cung cấp cơ chế để copy từ object ban đầu sang object mới và thay đổi giá trị
 * một số thuộc tính nếu cần
 */

public class Main {
  public static void main(String[] args) {
    Shape shape1 = new Shape();
    shape1.setType("Circle");
    shape1.draw();

    Shape shape2 = (Shape) shape1.clone();
    shape2.setType("Rect");
    shape2.draw();
  }
}
