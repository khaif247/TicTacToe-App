import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n /3;
        
        int column = n % 3;
        System.out.println("row" + row);
        System.out.println("Column" + column);
        
    }
}