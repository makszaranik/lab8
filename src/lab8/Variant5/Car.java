package lab8.Variant5;

import java.util.Comparator;

public class Car extends Vehicle{
  private String mark;
  private String color;

  public Car(int maxSpeed, String mark, String color){
    super(maxSpeed);
    this.mark = mark;
    this.color = color;
  }

  public Car(int maxSpeed, int x, int y, String mark, String color){
    super(maxSpeed, x, y);
    this.mark = mark;
    this.color = color;
  }

  public Car(int x, int y, String mark, String color){
    super(x, y);
    this.mark = mark;
    this.color = color;
  }

  public static class ByMarkComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
      return c1.getMark().compareTo(c2.getMark());
    }
  }

  public String getMark() {
    return mark;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }
  @Override
  public int getMaxSpeed() {
    return super.getMaxSpeed();
  }
  @Override
  public int getXCoordinate() {
    return super.getXCoordinate();
  }
  @Override
  public int getYCoordinate() {
    return super.getYCoordinate();
  }

  @Override
  public void setMaxSpeed(int maxSpeed) {
    super.setMaxSpeed(maxSpeed);
  }

  public void move(int x, int y) {
    super.move(x, y);
    System.out.println("Car is moving in point(" + this.getXCoordinate() + ";"+ this.getYCoordinate()+ ")");
  }

  @Override
  public String toString() {
    return "Car's color: " + this.color + "; Car's mark: " + this.mark + "; Car's max speed: " + this.maxSpeed;
  }

  public boolean equals(Car car) {
    return  super.equals(car) && this.color.equals(car.color) && this.mark.equals(car.mark);
  }

  public static class CarSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
      return Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed());
    }
  }
}