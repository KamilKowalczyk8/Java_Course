package Streams;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparator<Car> {
    public String name;
    public int topSpeed;
    public int price;
    public int raiting;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.compareTo(o2.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", raiting=" + raiting +
                '}';
    }

    public Car(String name, int topSpeed, int price, int raiting) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.raiting = raiting;
    }
}
