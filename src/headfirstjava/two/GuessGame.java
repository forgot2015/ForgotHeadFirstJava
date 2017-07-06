package headfirstjava.two;

/**
 * Created by forgot on 2017/6/25.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1=0;
        int guessp2=0;
        int guessp3=0;
        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;
        int targetNumber= (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while (true){
            System.out.println("Number to guess is "+targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1=p1.number;
            guessp2=p2.number;
            guessp3=p3.number;
            System.out.println("player one guessed "+guessp1);
            System.out.println("player headfirstjava.two guessed "+guessp2);
            System.out.println("player three guessed "+guessp3);

            if (guessp1==targetNumber){
                p1isRight=true;
            }
            if (guessp2==targetNumber){
                p2isRight=true;
            }
            if (guessp3==targetNumber){
                p3isRight=true;
            }

            if (p1isRight||p2isRight||p3isRight){
                System.out.println("we have a winner!");
                System.out.println("player one got it right? "+p1isRight);
                System.out.println("player headfirstjava.two got it right? "+p2isRight);
                System.out.println("player three got it right? "+p3isRight);
                break;
            }
            else{
                System.out.println("Players will have to try again");
                System.out.println("=================================");
            }
        }
    }

}