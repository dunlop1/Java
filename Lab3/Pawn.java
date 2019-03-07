import java.util.Objects;

public class Pawn extends ChessPiece {

    private static int importance = 1;

    private boolean hasBeenPromoted;
    private ChessPiece newPiece;


    public Pawn() {
        super(importance);
        this.hasBeenPromoted = false;
    }

    @Override
    public String toString() {
        return "Pawn {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("I move forward by 1");
    }


    public void promote(ChessPiece newPiece) {
        if (hasBeenPromoted) {
            System.out.println("Already been promoted.");
        }
        if (newPiece.getValue() == 1000 || newPiece.getValue() == 1){
            System.out.println("Invalid promotion. You cannot promote a King or a Pawn.");
            return;
        }
        this.newPiece = newPiece;
        this.hasBeenPromoted = true;
        setValue(newPiece.getValue());
        System.out.println("Has been promoted to " + newPiece);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pawn pawn = (Pawn) o;
        return hasBeenPromoted == pawn.hasBeenPromoted &&
                Objects.equals(newPiece, pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasBeenPromoted, newPiece);
    }
}