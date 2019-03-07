public class Rook extends ChessPiece {

    private static int importance = 5;

    public Rook() {
        super(importance);
    }

    @Override
    public String toString() {
        return "Rook {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("I move by horizontally or vertically");
    }


}