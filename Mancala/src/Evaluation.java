/**
 * Created by zhiqinhuang on 4/16/17.
 */
class Evaluation {
    int value;

    Evaluation(){
        this.value=0;
    }

    /**
     * update the evaluation value for a known board state
     * positive value means beneficial to player A
     * @param boardState
     */
    void evaluate(BoardState boardState){
        this.value=boardState.mancalaA-boardState.mancalaB;
    }
}
