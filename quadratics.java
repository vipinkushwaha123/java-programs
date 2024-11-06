package practical;

import java.util.Scanner;
public class quadratics{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
    
            System.out.print("Enter coefficient a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter coefficient b: ");
            double b = scanner.nextDouble();
            
            System.out.print("Enter coefficient c: ");
            double c = scanner.nextDouble();
    
            double discriminant = b * b - 4 * a * c;
    
            
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Roots are real and different.");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Roots are real and the same.");
                System.out.println("Root: " + root);
            } else {
                System.out.println("Roots are complex.");
            }
    
            scanner.close();
        }
    }
    
    
