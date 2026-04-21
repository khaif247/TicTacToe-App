import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n /3;
        
        int column = n % 3;
        if ((0 <= row  && row < 3) && (0<= column && column < 3)){
            System.out.println("valid input");
        }
        else{
            System.out.println("Invalid input");
        }

        
    }
}