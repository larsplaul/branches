package calc;

public class Calculator {
  public int add(int n1, int n2){
    return n1 + n2;
  }
  public int subtract(int n1, int n2){
    return n1 - n2;
  }
  
  public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.add(100, 200));
    System.out.println(c.subtract(100, 200));
  }
}
