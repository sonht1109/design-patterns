package _Proxy;

public class RealVideo implements Video {

  private String filename;

  public RealVideo(String filename) {
    this.filename = filename;
  }

  @Override
  public void play() {
    System.out.println(filename + " is playing");
  }

}
