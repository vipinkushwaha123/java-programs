package practical;

import java.util.Scanner;

    public class OctalToBinary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter an octal number: ");
            String octalString = scanner.nextLine();

            int decimal = Integer.parseInt(octalString, 8);
    
    
            String binaryString = Integer.toBinaryString(decimal);
    
            System.out.println("Binary equivalent: " + binaryString);
            
            scanner.close();
        }
    }
    
    

