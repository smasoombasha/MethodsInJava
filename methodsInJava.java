public class methodsInJava {
    public static void main(String[] args){
        // boolean gameOver = true;
        // int score = 3000;
        // int levelCompleted = 200;
        // int bonus = 100;

        calculateFinalScore(true, 3000, 200, 100);
        calculateFinalScore2(true, 4000, 250, 2);
        // One more type in Methods
        int FinalScore4 = calculateFinalScore3(true, 5000, 400, 3);
            System.out.println("Your FinalScore is "+FinalScore4);

    }
    // Creating Method with void(returns nothing) keyword
    public static void calculateFinalScore(boolean gameOver, int score, int levelCompleted, int bonus ){

        if(gameOver){
            int finalScore = score +(levelCompleted +bonus);
            System.out.println("Your FinalScore is "+finalScore);
        }

    }
    // Creating a Method without void keyword
    public static int calculateFinalScore2(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score +(levelCompleted*bonus);
            System.out.println("Your FinalScore is "+finalScore);
            finalScore +=150;
            System.out.println("Your FinalScore after Master Credits is "+finalScore);
            return finalScore;
        }else{
            return -1;
        }
    }
    public static int calculateFinalScore3(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score +(levelCompleted*bonus);
            System.out.println("Your FinalScore is "+finalScore);
            return finalScore;
        }
        return -1;

    }
}
