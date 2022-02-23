import java.util.Scanner;
import java.lang.Math;

class EinsteinEquation {
  public static void main(String[] args) {
   double SpeedOfLight = 2.998 * (Math.pow(10, 8));
   Scanner myObj = new Scanner(System.in);
   System.out.println("How heavy is the mass (in kilograms)?");
   String UserMass = myObj.nextLine();
   double UserMassInt = Double.parseDouble (UserMass);
   double JoulesCalc = UserMassInt * Math.pow(SpeedOfLight, 2);
   System.out.println("This is how many joules of  energy are made: " + JoulesCalc);
 }
}
