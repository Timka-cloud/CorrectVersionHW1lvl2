public class RaceTrack implements Obstacle{
    private int length;

    public RaceTrack(int length) {
        this.length = length;
    }


    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getLength() {
        return length;
    }
}
