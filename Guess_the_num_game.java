import java.util.Scanner;
import java.util.Random;
class GameG{
    public int computerNumber;
    public int userInput;
    public int noOfGuess =0;
    GameG(){
    Random Random = new Random();
    computerNumber= Random.nextInt(10);
    };
    void toTakeUserInput(){
        Scanner sn = new Scanner(System.in);
        userInput = sn.nextInt();
    }
    public void toCheck(){
        while(true){
            noOfGuess++;
            toTakeUserInput();
            if(userInput==computerNumber){
                System.out.printf("Congratulations! You've unveiled the secret number %d in '%d' attempts.",computerNumber,noOfGuess);
                break;
            }else if(userInput>computerNumber){
                System.out.println("Too high! Enter a small number:");
            }else{
                System.out.println("Too Low! Enter a greater number:");
            }
        }
    }
};
public class Guess_the_num_game {
    public static void main(String[]args){

//        System.out.println("Guess The Number:");
//        int userInput;
//        while(true){
//            userInput = sn.nextInt();
//            if(userInput==computerInput){
//                System.out.println("Correct!");
//                break;
//            }else if(userInput>computerInput){
//                System.out.println("enter small");
//            }else{
//                System.out.println("enter greater");
//            }
//        }
        GameG g = new GameG();
        System.out.println("Guess The Num:(1-10)");
        //g.toTakeUserInput();
        g.toCheck();
    }
}
