package _Proxy;

/**
 * structural
 * cung cấp một class đại diện cho việc truy xuất các đối tượng
 */

public class Main {
  public static void main(String[] args) {
    Proxy proxy = new Proxy("video.mp4");
    proxy.play();
  }
}
