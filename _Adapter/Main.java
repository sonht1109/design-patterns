package _Adapter;

/**
 * structural
 * hoạt động như một cầu nối các giao diện không tương thích, chuyển đổi interface của một class thành interface mà client yêu cầu
 */

public class Main {
  public static void main(String[] args) {
    VietnameseAdapter vietnameseAdapter = new VietnameseAdapter(new EnglishAdaptee());
    vietnameseAdapter.send("Một");
  }
}
