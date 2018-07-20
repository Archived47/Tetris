import java.util.ArrayList;
import java.util.List;

class Level {

    final static Level INSTANCE = new Level();
    private List<Tetris> pieces;

    private Level() {
        pieces = new ArrayList<>();
    }

    List<Tetris> getPieces() {
        return pieces;
    }
}
