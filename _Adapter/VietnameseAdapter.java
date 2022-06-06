package _Adapter;

public class VietnameseAdapter implements Target {

  private EnglishAdaptee adaptee;

  public VietnameseAdapter(EnglishAdaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void send(String word) {
    if (word == "Một") {
      word = "One";
    }
    adaptee.receive(word);
  }
}
