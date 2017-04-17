
class Evaluation {
    int value;

    Evaluation(){
        this.value=0;
    }

    void evaluate(BoardState boardState){
        this.value=boardState.mancalaA-boardState.mancalaB;
    }
}