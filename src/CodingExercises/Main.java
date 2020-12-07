package CodingExercises;

public class Main {
    public static void main(String[] args) {
   int newScore =  calculateScore("Lou", 500);
        System.out.println("new score is " + newScore);
        calculateScore(75);

    }

    public static int calculateScore(String playername, int score){
        System.out.println("Player " + playername + " scores" + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("someone" + score + "points");
        return score * 1000;

    }

    public static int calculateScore(){
        System.out.println("No player or score");
        return 0;
    }


}
