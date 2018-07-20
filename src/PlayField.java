import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

class PlayField extends Pane implements Runnable {

    private final int WIDTH = Block.SIZE;
    private final int HEIGHT = 800;

    private Thread thread;
    boolean running;

    private double FPS = 1;
    private double averageFPS;

    private Player player;
    private Level level;

    private long currentTime;

    PlayField() {
        setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        setPrefSize(WIDTH, HEIGHT);
        setFocused(true);
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }

    }

    @Override
    public void run() {
        running = true;

        long startTime;
        long UTime;
        long waitTime;
        long totalTime = 0;
        long targetTime = (long) (1000 / FPS);

        int frameCount = 0;
        int maxFrames = 30;

        // LOOP
        while (running) {
            startTime = System.nanoTime();

            gameUpdate();

            UTime = (System.nanoTime() - startTime) / 1000000;
            waitTime = targetTime - UTime;
            try {
                if (waitTime >= 0) {
                    Thread.sleep(waitTime);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            totalTime += System.nanoTime() - startTime;
            frameCount++;
            if (frameCount == maxFrames) {
                averageFPS = 1000.0 / (totalTime / frameCount) / 1000000;
                frameCount = 0;
                totalTime = 0;
            }
        }


    }

    private void gameUpdate() {

    }
}
