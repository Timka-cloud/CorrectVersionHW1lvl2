public class Robot implements Participant{
    protected String name;
    protected int run;
    protected int jump;

    public Robot (String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    @Override
    public void run(Obstacle[] obstacleRuny) {
        for(Obstacle ob : obstacleRuny)
        if (ob.getLength() > 0 && run >= ob.getLength())
        System.out.println(String.format("The robot %s completed the raceTrack", name));
    }

    @Override
    public void jump(Obstacle[] obstacleJump) {
       for(Obstacle ob : obstacleJump)
           if (ob.getHeight() > 0 && jump >= ob.getHeight())
               System.out.println(String.format("The robot %s completed the wall", name));
    }
}
