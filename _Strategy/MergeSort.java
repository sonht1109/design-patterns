package _Strategy;

import java.util.List;

public class MergeSort implements SortStrategy {

  @Override
  public <T> void sort(List<T> list) {
    System.out.println("Merge sort");    
  }
  
}
