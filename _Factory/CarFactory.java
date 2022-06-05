package _Factory;

public class CarFactory {
  Car car;

  public void viewCar(String carType) {
    if (carType == "Honda") {
      car = new HondaCar();
    } else if (carType == "Lexus") {
      car = new LexusCar();
    }
    car.view();
  }
}
