package lab8.Variant5;

import java.util.Comparator;

public class Ship extends Vehicle{
  private int deadWeight = 0;


  static{
    System.out.println("Class Ship is using");
  }
  public Ship(int maxSpeed, int x, int y, int deadWeight){
    super(maxSpeed, x, y);
    if(deadWeight >= 0){
      this.deadWeight = deadWeight;
    }
    else{
      this.deadWeight = 0;
    }
  }

  public Ship(int maxSpeed, int deadWeight){
    super(maxSpeed);
    if(deadWeight >= 0){
      this.deadWeight = deadWeight;
    }
    else{
      this.deadWeight = 0;
    }
  }

  public Ship(int x, int y, int deadWeight){
    super(x, y);
    if(deadWeight >= 0){
      this.deadWeight = deadWeight;
    }
    else{
      this.deadWeight = 0;
    }
  }

  public static class ShipByWeightComparator implements Comparator<Ship> {
    @Override
    public int compare(Ship s1, Ship s2) {
      return Integer.compare(s1.getDeadWeight(), s2.getDeadWeight());
    }
  }

  public static class ShipBySpeedComparator implements Comparator<Ship> {
    @Override
    public int compare(Ship s1, Ship s2) {
      return Integer.compare(s1.getMaxSpeed(), s2.getMaxSpeed());
    }
  }

  public int getDeadWeight() {
    return deadWeight;
  }

  public void setDeadWeight(int deadWeight) {
    this.deadWeight = deadWeight;
  }

  public void move(int x, int y) {
    super.move(x, y);
    System.out.println("Ship is moving in point(" + this.xCoordinate + ";"+ this.yCoordinate+ ")");
  }

  public void load(int weightCargo){
    if(weightCargo >= 0){
      if(weightCargo <= this.deadWeight){
        System.out.println("The cargo is loaded onto the ship");
      }
      else{
        System.out.println("the ship is going to sink!!!");
      }
    }
    else{
      System.out.println("The cargo has negative weight");
    }
  }

  @Override
  public String toString() {
    return "Ship's deadweight: " + this.deadWeight + "; Ship's max speed: " + this.maxSpeed;
  }

  public boolean equals(Ship ship) {
    return super.equals(ship) && this.deadWeight == ship.deadWeight;
  }
}
