/**
 * Created by eugene on 2019-03-05.
 */
public abstract class ChessPiece {


    public abstract int getImportance();
    public abstract void move();

    @Override
    public String toString() {
        return "ChessPiece ";
    }

}
