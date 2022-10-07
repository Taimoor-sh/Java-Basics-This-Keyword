import java.util.Scanner;
/**
 * program
 */
public class program {
int roll ; String name ; int k;
  public static void main(String[] args) {
  program obj = new program(2, "Taimoor");
  obj.display();
  }
  program(int i , String j ){
    this.roll = i;
    this.name = j;
  }
  public void display() {
    System.out.println("Here is the detail :" + roll + " " + name);
  }
}