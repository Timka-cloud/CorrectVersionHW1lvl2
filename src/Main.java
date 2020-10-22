public class Main {

    public static void main(String[] args) {
        Obstacle[] obstacles = {
            new RaceTrack(100),
            new Wall(2)
        };
       

        Participant[] participants = {
            new Human("Alex", 150,3),
            new Robot("ZX-47", 110,1),
            new Cat("Rex",20,1)
        };

        for (Participant p : participants){
            p.run(obstacles);
            p.jump(obstacles);


        }


    }
}
