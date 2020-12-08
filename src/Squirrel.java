import java.io*;

public class Squirrel(String[] args) {

  // instance variables
  int age;
  double weight;
  String color;
  double frontTeethLength;
  int SNumber;

  public Squirrel (int lifeSpan, double mass, String furColor, double frontTeeth, int SquirrelNumber) {
    this.age = lifeSpan;
    this.weight = mass;
    this.color = furColor;
    this.frontTeethLength = frontTeeth;
    this.SNumber = SquirrelNumber;
  }

  public void makeNoise(String strNoise) {
    System.out.println(this.SNumber + "makes this noise: " + strNoise);
  }

  public void jumpHigh(double dblJumpHeight) {
    System.out.println(this.SNumber + "jumps this high: " + dblJumpHeight);
  }

  public void stompFeet(double strStompFeet) {
    System.out.println("To communicate squirrels " + strStompFeet + ".");
  }

}