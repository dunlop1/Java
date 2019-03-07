public class Bishop extends ChessPiece {

    private static int importance = 3;

    public Bishop() {
        super(importance);
    }

    @Override
    public String toString() {
        return "Bishop {value = " + getValue() + " }";
    }

    @Override
    public void move() {
        System.out.println("Bishop moves diagonally");
    }

}