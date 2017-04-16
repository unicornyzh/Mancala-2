public class GreedyAI {
    //  BoardState Gstate;
    BoardState next;
    boolean player;
    int pit = -1;
    int n;//n pits
    int max = 0;

    public GreedyAI() {

    }

    public Result Greedy(BoardState s) {
        player = s.player;
        Result r = new Result();
        int i;
        if (!player)   //player A
        {
            for (i = 1; i <= s.PITSNUMBER; i++) {
                //	 System.out.println(i);
                next = s.nextMoveState(i, 'a', 0);
                if (next.player == s.player) {
                    System.out.println("****");
                    r = Greedy(next);
                    r.pit = i;
                } else {
                    r.max = next.mancalaA;
                    r.pit = i;
                }
                if (r.max >= max) {
                    max = r.max;
                    pit = r.pit;
                }
                System.out.println(r.max + " " + r.pit);
            }
        }
        if (player)  //player B
        {
            for (i = 1; i <= s.PITSNUMBER; i++) {
                next = s.nextMoveState(i, 'b', 0);
                if (next.player == s.player) {
                    r = Greedy(next);
                    r.pit = i;
                } else {
                    r.max = next.mancalaA;
                    r.pit = i;
                }
                if (r.max >= max) {
                    max = r.max;
                    pit = r.pit;
                }
                System.out.println("xdd");
            }
        }
        r.pit = pit;
        r.max = max;
        return r;
    }
}