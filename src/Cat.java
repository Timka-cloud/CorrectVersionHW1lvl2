public class Cat implements Participant{
    protected String name;
    protected int run;
    protected int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }


    @Override
    public void run(Obstacle[] obstacleRun) {
        for(Obstacle ob : obstacleRun)
            if (ob.getLength() > 0 && run >= ob.getLength())
                System.out.println(String.format("The Cat %s completed the raceTrack", name));
    }

    @Override
    public void jump(Obstacle[] obstacleJump) {
        for(Obstacle ob : obstacleJump)
        if (ob.getHeight() > 0 && jump >= ob.getHeight())
            System.out.println(String.format("The Cat %s completed the wall", name));
    }
}
