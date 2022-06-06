package _Strategy;

import java.util.ArrayList;
import java.util.List;

public class SortContext {
  private SortStrategy sortStrategy;
  private List<String> list = new ArrayList<String>();

  public SortContext(){}

  public void setSort(SortStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
  }

  public void sort() {
    sortStrategy.sort(list);
  }

  public void add(String item) {
    list.add(item);
  }

}
