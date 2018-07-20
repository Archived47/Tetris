import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Tetris {

    private char type;
    private List<Block> blocks;

    Tetris() {
        Random random = new Random();
        blocks = new ArrayList<>();

        // There are 7 types
        float chance = 1.0f / 7;
        float rNumber = random.nextFloat();

        // Decide the type
        for (int i = 1; i <= 7; i++) {
            if (rNumber > 1 - chance * i) {
                switch (i) {
                    case 1: type = 'I'; break;
                    case 2: type = 'J'; break;
                    case 3: type = 'L'; break;
                    case 4: type = 'O'; break;
                    case 5: type = 'S'; break;
                    case 6: type = 'T'; break;
                    case 7: type = 'Z'; break;
                }
                break;
            }
        }

        int i = 0;
        int initX = 100;
        // Switch statement to create the actual blocks
        switch (type) {
            case 'I':
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                break;
            case 'J':
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE));
                break;
            case 'L':
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                break;
            case 'O':
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE * i));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE * i));
                break;
            case 'S':
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                break;
            case 'T':
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                break;
            case 'Z':
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, 0));
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE));
                i++;
                blocks.add(new Block(this, initX + Block.SIZE * i, Block.SIZE));
                break;
            default: System.out.println("This tetris piece does not exist."); break;
        }
    }

    void move() {
        //TODO
    }

    void skip() {
        //TODO
    }

    void turnLeft() {
        //TODO
    }

    void turnRight() {
        //TODO
    }

    char getType() {
        return type;
    }

    List<Block> getBlocks() {
        return blocks;
    }
}
