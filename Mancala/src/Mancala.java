/**
 * Created by zhiqinhuang on 4/9/17.
 */
public class Mancala {
	static GreedyAI player1=new GreedyAI();
	static Result r=new Result();
    public static void main(String[] args){
        BoardState.PITSNUMBER=6;//Integer.parseInt(args[0]);
        BoardState boardState=new BoardState();
        Board.printBoard(boardState);
        r=player1.Greedy(boardState);
        System.out.println("playerA move position: "+r.pit);
        if(!boardState.player)
        boardState.updateMove(r.pit,'a' , 0);
        else
        boardState.updateMove(r.pit,'b' , 0);
        Board.printBoard(boardState);
    }

    /**
     * print game result on command line
     * @param boardState
     */
    void showResult(BoardState boardState){
        int[] result=Refugee.judge(boardState);
        System.out.println(result);
        if (result[0]>result[1]){
            System.out.println("player A won");
        }
        if (result[0]<result[1]){
            System.out.println("player B won");
        }
        if (result[0]==result[1]){
            System.out.println("draw");
        }
    }
}
