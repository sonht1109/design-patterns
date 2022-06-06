package _Proxy;

public class Proxy implements Video {

  private RealVideo realVideo;
  private String filename;

  public Proxy(String filename) {
    this.filename = filename;
  }

  @Override
  public void play() {
    if(realVideo == null) {
      realVideo = new RealVideo(filename);
    }
    realVideo.play();
  }
  
}
