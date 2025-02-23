import java.util.*;

public class _694 {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> dire = new LinkedList<>();
        Queue<Integer> radiant = new LinkedList<>();

        for (int s = 0; s < senate.length(); s++ ) {
            if (senate.charAt(s) == 'D') {
                dire.offer(s);
            } else {
                radiant.offer(s);
            }
        }

        while (!dire.isEmpty() && !radiant.isEmpty()) {
            int radiantCandidate = radiant.poll();
            int direCandidate = dire.poll();

            if (radiantCandidate < direCandidate) {
                radiant.offer(radiantCandidate + senate.length());
            } else {
                dire.offer(direCandidate + senate.length());
            }
        }
        return dire.isEmpty() ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        String senate = "RDRDR";
        System.out.println(predictPartyVictory(senate));

    }

}
