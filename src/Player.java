class Player {

    private Tetris current;

    Player(PlayField playField) {
        playField.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case DOWN: current.skip(); break;
                case LEFT: current.turnLeft(); break;
                case RIGHT: current.turnRight(); break;
            }
        });
    }

    public void setCurrent(Tetris current) {
        this.current = current;
    }
}
