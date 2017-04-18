/**
 * Created by zhiqinhuang on 4/9/17.
 */
public class Mancala {
	static GreedyAI playerA=new GreedyAI();
	static GreedyAI playerB=new GreedyAI();
	static Result r=new Result();
    public static void main(String[] args){
        BoardState.PITSNUMBER=1000;//Integer.parseInt(args[0]);
        BoardState boardState=new BoardState();
        Board.printBoard(boardState);
        for(;;)
        {
        if(!boardState.player)	
        {
        r=playerA.Greedy(boardState);
        System.out.println("playerA move position: "+r.pit+" "+r.max);
        }
        else
        {
        r=playerB.Greedy(boardState);
        System.out.println("playerB move position: "+r.pit+" "+r.max);
        }
        if(!boardState.player)
        boardState.updateMove(r.pit,'a' , 0);
        else
        boardState.updateMove(r.pit,'b' , 0);
        if(Refugee.isEnd(boardState))
        {
        	showResult(boardState);
        	break;
        }
       // Board.printBoard(boardState);
        }
    }

    /**
     * print game result on command line
     * @param boardState
     */
    static void showResult(BoardState boardState){
        int[] result=Refugee.judge(boardState);
        System.out.println(result[0]+" "+result[1]);
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
