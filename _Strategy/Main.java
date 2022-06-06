package _Strategy;

/**
 * behavioral
 * tách rời phần xử lý một chức năng cụ thể ra khỏi đối tượng. Sau đó có thể lựa chọn thuật toán đúng đắn nhất để thực thi
 */

public class Main {
  public static void main(String[] args) {
    SortContext sortContext = new SortContext();
    MergeSort mergeSort = new MergeSort();
    BubbleSort bubbleSort = new BubbleSort();

    sortContext.setSort(mergeSort);
    sortContext.sort();

    sortContext.setSort(bubbleSort);
    sortContext.sort();
  }
}