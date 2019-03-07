public class Queen extends ChessPiece {

    private static int importance = 9;

    public Queen() {
        super(importance);
    }

    @Override
    public String toString() {
        return "Queen {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("I move like a bishop or a rook");
    }


}