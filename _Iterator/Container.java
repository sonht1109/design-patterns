package _Iterator;

import java.util.ArrayList;
import java.util.List;

public class Container {
  private List<String> list = new ArrayList<>();

  public Container() {
  }

  public void addItem(String item) {
    list.add(item);
  }

  public Iterator<String> getIterator() {
    return new ConcreteIterator();
  }

  class ConcreteIterator implements Iterator<String> {

    private int currentIndex = 0;

    @Override
    public boolean hasNext() {
      return currentIndex < list.size();
    }

    @Override
    public String next() {
      return list.get(currentIndex++);
    }

  }
}
