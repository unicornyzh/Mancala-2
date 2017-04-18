/**
 * Created by zhiqinhuang on 4/13/17.
 */
class MancalaAI {
    // Possible parameters
    int depth; // search depth
    int pits; // the number of pits


    MancalaAI(int pits){
        super();
        this.depth=5;
        this.pits=pits;
    }

    /**
     * change search depth
     * @param depth
     */
    void changeParameters(int depth){
        this.depth=depth;
    }

    void Searching(BoardState boardState){
        
    }

 
}
