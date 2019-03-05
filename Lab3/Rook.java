/**
 * Created by eugene on 2019-03-05.
 */
public abstract class Rook extends ChessPiece {
    public int importance=5;

    public int getImportance() {
        return importance;
    }

    @Override
    public void move() {
        System.out.println("I move horizontally or vertically");

    }
}
