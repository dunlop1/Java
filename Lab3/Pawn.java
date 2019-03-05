/**
 * Created by eugene on 2019-03-05.
 */
public abstract class Pawn extends ChessPiece {
    public int importance=1;



    public int getImportance() {
        return importance;
    }

    @Override
    public void move() {
        System.out.println("I move forward 1");

    }
}
