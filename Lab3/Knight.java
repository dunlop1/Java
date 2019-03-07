public class Knight extends ChessPiece {

    private static int importance = 2;

    public Knight() {
        super(importance);
    }

    @Override
    public String toString() {
        return "Knight {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("I move like an L");
    }

}