package _Strategy;

import java.util.List;

public class BubbleSort implements SortStrategy {

  @Override
  public <T> void sort(List<T> list) {
    System.out.println("Bubble sort");    
  }
  
}
