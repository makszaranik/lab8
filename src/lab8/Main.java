package lab8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lab8.Variant5.Car;
import lab8.Variant5.Ship;
import lab8.Variant5.Ship.ShipByWeightComparator;
import lab8.Variant8.*;
import lab8.Variant8.TextDocument.TextDocumentSymbolComparator;

public class Main {


  public static void main(String[] args) {
    Car car1 = new Car(350, "Lamborghini", "red");
    Car car2 = new Car(250, "Ferrari", "blue");
    Car[] cars = {car1, car2};

    Arrays.sort(cars, Car::compareBySpeed);
    System.out.println("Sorted cars by speed:");
    for (Car car : cars) {
      System.out.println(car);
    }

    TreeSet<Car> carSet = new TreeSet<>(car1::compareByColor);
    carSet.add(car1);
    carSet.add(car2);
    System.out.println("Cars in TreeSet sorted by color:");
    for (Car car : carSet) {
      System.out.println(car);
    }

    Ship ship1 = new Ship(200, 3000);
    Ship ship2 = new Ship(150, 2000);
    Ship[] ships = {ship1, ship2};

    Arrays.sort(ships, new ShipByWeightComparator()::compare);
    System.out.println("Sorted ships by weight:");
    for (Ship ship : ships) {
      System.out.println(ship);
    }


    String[] texts = {"Hello", "Welcome to the Java world", "Short"};
    List<TextDocument> textDocuments = Stream.of(texts)
        .map(TextDocument::new)
        .collect(Collectors.toList());
    System.out.println("TextDocuments created by constructor reference:");
    for (TextDocument doc : textDocuments) {
      System.out.println(doc);
    }
  }

}
