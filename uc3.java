import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter input from 0 to 9");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 > t || t >9){
            System.out.println("wrong input plz enter 0 to 9");
            t = sc.nextInt();
            
        }
    }
}