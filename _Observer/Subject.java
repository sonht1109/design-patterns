package _Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  private List<Observer> observers;

  public Subject() {
    observers = new ArrayList<Observer>();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void detach(Observer observer) {
    observers.remove(observer);
  }

  public void notifyChange(String message) {
    for (Observer o : observers) {
      o.update(message);
    }
  }
}
