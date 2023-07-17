package Generics;
class Square <T extends Number>{
    private T wall;

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    public Square(T wall) {
        this.wall = wall;
    }
    public double getSurfaceArea(){
        double wall = this.wall.doubleValue();
        return wall * wall;
    }
}
public class ChallengeSquare {
    public static void main(String[] args) {
        Square<Integer> integerSquare = new Square<>(10);
        System.out.println(integerSquare.getSurfaceArea());
        Square<Float> floatSquare = new Square<>(12.4f);
        System.out.println(floatSquare.getSurfaceArea());
    }
}
