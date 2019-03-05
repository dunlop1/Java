/**
 * Created by eugene on 2019-03-05.
 */
public abstract class Knight extends ChessPiece {
    public int importance=2;


    public int getImportance() {
        return importance;
    }

    @Override
    public void move() {
        System.out.println("like an L");

    }
}
