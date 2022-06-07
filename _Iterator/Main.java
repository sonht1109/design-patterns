package _Iterator;

/**
 * behavorial
 * cung cấp cách thức truy cập tuần tự tới các phần tử của một đối tượng mà không cần phải hiểu rõ về nó
 */

public class Main {
  public static void main(String[] args) {
    Container container = new Container();
    container.addItem("Item 1");
    container.addItem("Item 2");
    container.addItem("Item 3");

    Iterator<String> iterator = container.getIterator();
    while(iterator.hasNext()) { 
      System.out.println(iterator.next());
    }
  }
}
