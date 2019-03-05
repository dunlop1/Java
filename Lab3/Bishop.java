/**
 * Created by eugene on 2019-03-05.
 */
public abstract class Bishop extends ChessPiece {
    public int importance=3;


    public int getImportance() {
        return importance;
    }

    @Override
    public void move() {
        System.out.println("I move diagonally");

    }
}
