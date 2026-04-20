import java.util.Random;
class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int toss = random.nextInt(2);
        if (toss == 1){
            System.out.println("player1 won the toss");
        }
        else{
            System.out.println("player2 won the toss");
        }
        if (random.nextBoolean()){
            System.out.println("player1 will have O\n player2 will have X");
        }
        else{
            System.out.println("player1 will have X \n player2 will have O");
        }
        
    }
}