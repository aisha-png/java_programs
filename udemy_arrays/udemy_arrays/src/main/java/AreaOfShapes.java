import java.util.Scanner;

public class AreaOfShapes {

//    using a scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        double area = (22*r*r)/7;
        System.out.println("The area of your circle is : " + area);
    }
}
