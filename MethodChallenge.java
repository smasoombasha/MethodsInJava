public class MethodChallenge {
    public static void main(String[] args){
        //Parameters
        //String playerName = "Masoom";
        //int highScore = 1900;
        // String message = "managed to get into position"
        // String position = "on the high score table."
        int playerHighScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Masoom",playerHighScore, " managed to get into position ", " on the high score table.");
    }

     public static void displayHighScorePosition(String playerName, int highScore, String message, String positon){
        String displayHighScore = playerName +message+ highScore+positon;
                System.out.println(displayHighScore);
    }
    public static int calculateHighScorePosition(int score){
      if(score >1000){
          return 1;
      }else if(score >500 && score <1000){
          return 2;
      }else if(score >100 && score <500){
          return 3;
      }else{
          return 4;
      }
    }
}