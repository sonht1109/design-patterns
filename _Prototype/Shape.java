package _Prototype;

public class Shape implements Cloneable {
  public void draw() {
    System.out.println("Shape type: " + type);
  }

  private String type;

  public void setType(String type) {
    this.type = type;
  }

  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }
}
