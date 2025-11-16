package collections;

import java.util.*;

class Player {
 int playerId;
 String name;

 public Player(int playerId, String name) {
     this.playerId = playerId;
     this.name = name;
 }

 @Override
 public int hashCode() {
     return Objects.hash(playerId);
 }

 @Override
 public boolean equals(Object obj) {
     if (!(obj instanceof Player)) return false;
     Player p = (Player) obj;
     return this.playerId == p.playerId;
 }

 @Override
 public String toString() {
     return "Player#" + playerId + " - " + name;
 }
}

class Match {
 Player p1;
 Player p2;

 public Match(Player p1, Player p2) {
     this.p1 = p1;
     this.p2 = p2;
 }

 @Override
 public String toString() {
     return p1.name + " vs " + p2.name;
 }
}

class Result {
 Match match;
 Player winner;

 public Result(Match match, Player winner) {
     this.match = match;
     this.winner = winner;
 }

 @Override
 public String toString() {
     return "Match: " + match + " | Winner: " + winner.name;
 }
}

class Score implements Comparable<Score> {
 Player player;
 int points;

 public Score(Player player, int points) {
     this.player = player;
     this.points = points;
 }

 @Override
 public int compareTo(Score s) {
     return Integer.compare(s.points, this.points); // descending
 }

 @Override
 public String toString() {
     return player.name + " - " + points + " pts";
 }
}

public class GamingTournament {

 public static void main(String[] args) {

     Set<Player> players = new HashSet<>();

     Queue<Match> matchQueue = new LinkedList<>();

     List<Result> results = new ArrayList<>();

     TreeSet<Score> leaderboard = new TreeSet<>();

     Player p1 = new Player(1, "Rohan");
     Player p2 = new Player(2, "Neha");
     Player p3 = new Player(3, "Aarav");
     Player p4 = new Player(4, "Priya");

     register(players, p1);
     register(players, p2);
     register(players, p3);
     register(players, p4);
     register(players, new Player(1, "Duplicate Rohan")); // ignored

     matchQueue.add(new Match(p1, p2));
     matchQueue.add(new Match(p3, p4));
     matchQueue.add(new Match(p1, p3));

     Random random = new Random();
     System.out.println("\nProcessing Matches...\n");

     while (!matchQueue.isEmpty()) {
         Match m = matchQueue.poll();

         Player winner = random.nextBoolean() ? m.p1 : m.p2;

         results.add(new Result(m, winner));

         updateScore(leaderboard, winner);

         System.out.println("Match Played: " + m + " | Winner: " + winner.name);
     }

     System.out.println("\n--- Match Results ---");
     results.forEach(System.out::println);

     System.out.println("\n--- Live Leaderboard (Descending Order) ---");
     leaderboard.forEach(System.out::println);
 }

 public static void register(Set<Player> players, Player p) {
     if (players.add(p)) {
         System.out.println("Player Registered: " + p);
     } else {
         System.out.println("Duplicate Player Rejected: " + p.playerId);
     }
 }

 public static void updateScore(TreeSet<Score> leaderboard, Player p) {
     Score oldScore = null;

     for (Score s : leaderboard) {
         if (s.player.equals(p)) {
             oldScore = s;
             break;
         }
     }

     if (oldScore != null) {
         leaderboard.remove(oldScore);
         leaderboard.add(new Score(p, oldScore.points + 10)); // add 10 pts
     } else {
         leaderboard.add(new Score(p, 10));
     }
 }
}

