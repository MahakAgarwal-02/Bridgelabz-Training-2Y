package Wrapper_Class;

class GameScoreboard {

    public static void main(String[] args) {
        Integer[] scores = { 50, null, 80, 100, null, 60 };

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayedCount++;
            } else {
                totalScore += score;
            }
        }

        System.out.println("Number of players who haven’t played: " + notPlayedCount);
        System.out.println("Total score of active players: " + totalScore);
    }
}
