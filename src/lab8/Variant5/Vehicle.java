package lab8.Variant5;

public abstract class Vehicle {
  protected int maxSpeed = 0;
  protected int xCoordinate  = 0;
  protected int yCoordinate = 0;

  static{
    System.out.println("Class Car is using");
  }
  Vehicle(int maxSpeed){
    if(maxSpeed >= 0){
      this.maxSpeed = maxSpeed;
    }
    else{
      this.maxSpeed = 0;
    }
  }

  Vehicle(int x, int y){
    this.xCoordinate = x;
    this.yCoordinate = y;
  }

  Vehicle(int maxSpeed, int x, int y){
    if(maxSpeed >= 0){
      this.maxSpeed = maxSpeed;
    }
    else{
      this.maxSpeed = 0;
    }
    this.xCoordinate = x;
    this.yCoordinate = y;
  }

  public int getMaxSpeed(){
    return this.maxSpeed;
  }

  public int getXCoordinate(){
    return this.xCoordinate;
  }
  public int getYCoordinate(){
    return this.yCoordinate;
  }

  public void setMaxSpeed(int maxSpeed){
    if(maxSpeed >= 0){
      this.maxSpeed = maxSpeed;
    }
    else{
      this.maxSpeed = 0;
    }
  }

  public void move(int x, int y){
    this.xCoordinate = x;
    this.yCoordinate = y;
  }

  public boolean equals(Vehicle vehicle) {
    return this.maxSpeed == vehicle.maxSpeed && this.xCoordinate == vehicle.xCoordinate && this.yCoordinate == vehicle.yCoordinate;
  }
}