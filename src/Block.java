import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

class Block extends Rectangle {

    static final int SIZE = 30;

    private Paint color;

    Block(Tetris tetris, int x, int y) {
        super(SIZE, SIZE);

        switch (tetris.getType()) {
            case 'I': color = Color.CYAN; break;
            case 'J': color = Color.BLUE; break;
            case 'L': color = Color.ORANGE; break;
            case 'O': color = Color.YELLOW; break;
            case 'S': color = Color.GREEN; break;
            case 'T': color = Color.PURPLE; break;
            case 'Z': color = Color.RED; break;
            default: System.out.println("This tetris piece does not exist."); break;
        }

        setFill(color);
    }

    /**
     * If a block touches another block below it, return true;
     * @return boolean
     */
    boolean touches() {
        for (Tetris tetris : Level.INSTANCE.getPieces()) {
            for (Block block : tetris.getBlocks()) {
                if (this.getY() + Block.SIZE == block.getY()) {
                    return true;
                }
            }
        }
        return false;
    }

}
