package lab8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import lab8.Variant5.Car;
import lab8.Variant5.Ship;
import lab8.Variant8.*;

public class Main {

  static class ShipByWeightComparator implements Comparator<Ship> {
    @Override
    public int compare(Ship s1, Ship s2) {
      return Integer.compare(s1.getDeadWeight(), s2.getDeadWeight());
    }
  }

  static class DocumentLengthComparator implements Comparator<Document> {
    @Override
    public int compare(Document d1, Document d2) {
      return Integer.compare(d1.read().length(), d2.read().length());
    }
  }

  static class TextDocumentSymbolComparator implements Comparator<TextDocument> {
    @Override
    public int compare(TextDocument t1, TextDocument t2) {
      return Integer.compare(t1.getAmountSymbols(), t2.getAmountSymbols());
    }
  }

  public static void main(String[] args) {
    Car car1 = new Car(350, "Lamborghini", "red");
    Car car2 = new Car(250, "Ferrari", "blue");
    Car[] cars = {car1, car2};

    Arrays.sort(cars, new Car.CarSpeedComparator());
    System.out.println("Sorted cars by speed:");
    for (Car car : cars) {
      System.out.println(car);
    }


    TreeSet<Car> carSet = new TreeSet<>(new Comparator<Car>() {
      @Override
      public int compare(Car c1, Car c2) {
        return c1.getColor().compareTo(c2.getColor());
      }
    });

    carSet.add(car1);
    carSet.add(car2);
    System.out.println("Cars in TreeSet sorted by color:");
    for (Car car : carSet) {
      System.out.println(car);
    }

    Ship ship1 = new Ship(200, 3000);
    Ship ship2 = new Ship(150, 2000);
    Ship[] ships = {ship1, ship2};

    Arrays.sort(ships, new ShipByWeightComparator());
    System.out.println("Sorted ships by weight:");
    for (Ship ship : ships) {
      System.out.println(ship);
    }


    TreeSet<Ship> shipSet = new TreeSet<>(new Comparator<Ship>() {
      @Override
      public int compare(Ship s1, Ship s2) {
        return Integer.compare(s1.getMaxSpeed(), s2.getMaxSpeed());
      }
    });
    shipSet.add(ship1);
    shipSet.add(ship2);
    System.out.println("Ships in TreeSet sorted by max speed:");
    for (Ship ship : shipSet) {
      System.out.println(ship);
    }

    Document document1 = new TextDocument("document1");
    Document document2 = new TextDocument("document2 is larger than document1");

    Document[] documents = {document1, document2};
    Arrays.sort(documents, new DocumentLengthComparator());

    System.out.println("Sorted documents by length:");
    for (Document doc : documents) {
      System.out.println(doc);
    }


    TreeSet<TextDocument> textDocuments = new TreeSet<>(new TextDocumentSymbolComparator());
    textDocuments.add(new TextDocument("Hello"));
    textDocuments.add(new TextDocument("Welcome to the Java world"));
    textDocuments.add(new TextDocument("Short"));
    System.out.println("TextDocuments in TreeSet sorted by symbol count:");
    for (TextDocument doc : textDocuments) {
      System.out.println(doc);
    }
  }
}
