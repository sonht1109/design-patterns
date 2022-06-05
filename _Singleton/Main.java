package _Singleton;

/**
 * Hạn chế việc khởi tạo một lớp, đảm bảo mỗi lớp chỉ có 1 instance đang tồn tại
 * Lớp singleton phải cung cấp 1 điểm truy cập toàn cục để lấy instance của lớp
 * => dùng cho Shared resource, Logger, Configuration, Caching, Thread pool, ...
 */
public class Main {
  public static void main(String[]args) {
    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton == singleton2);
  }
}