public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
