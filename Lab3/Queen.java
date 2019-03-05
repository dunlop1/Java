/**
 * Created by eugene on 2019-03-05.
 */
public abstract class Queen extends ChessPiece {
    public int importance=9;


    public int getImportance() {
        return importance;
    }

    @Override
    public void move() {
        System.out.println("I move like a bishop or a rook");

    }
}
