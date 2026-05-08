import java.util.Scanner;
public class firstProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.println("Enter The number");
        int n = sc.nextInt();
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Hey Good morning Mohit bhaiya kaise hai aap dekhiye maine aapke liye kya print karwaya hu");   
                break;
        
            default: System.out.println("Aapko accha laga ki nahi");
                break;
        }
        for (int i = 1; i<=n; i++) {
            for( int j =1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println("Mohit Bhaiya");
            int b = 2 * ( n -i);
            for(int j =1; j <=b; j ++){
                if (j == b || j<=i || i==n) {
                    System.out.print(" ");
                    
                }
                for(int k = 1; k<=i; k++){

                    System.out.print("*");
                }
            }

            
            
        }

        sc.close(); 


    }

}

