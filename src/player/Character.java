package player;

public abstract class Character {

    //Minigames
        //Versus
            public static final String Tanks = "Tanks";
            public static final String Wrestling = "Wrestling";
            public static final String PaintBall = "Paint Ball";
            public static final String BaseCapture = "Base Capture";
            public static final String Snake = "Snake";
        //Racing
            public static final String ChickenRun = "Chicken Run";
            public static final String DriftRace = "Drift Race";
            public static final String F1Race = "F1 Race";
            public static final String RallyRace = "Rally Race";
            public static final String SlotCarRace = "Slot Car Racing";
            public static final String SkateboardRace = "Skateboard Race";
            public static final String RocketRace = "Rocket Race";
            public static final String ObstacleCourse = "Obstacle Course";
            public static final String PipeFlight = "Pipe Flight";
        //Goalkeeping
            public static final String PingPong = "Ping Pong";
            public static final String Soccer = "Soccer";
            public static final String Pinball = "Pinball";
            public static final String ShotVolley= "Paint Shot Volley";
        //Rotation
            public static final String Golf = "Golf";
            public static final String Memory = "Memory";
        //Endurance
            public static final String BirdFeed = "Bird Feed Shooter";
            public static final String Ninja = "Ninja Competition";
            public static final String MatchingSigns = "Matching Signs";
            public static final String AlienEvasion = "Alien Attacks";
            public static final String Stacker = "Stacker";
            public static final String Reflex = "Reflex";
    //Character Template Strings
        //Versus
            protected static final String TanksT = "textures/Tank.png";
            protected static final String WrestlingT = "textures/Wrestling.png";
            protected static final String PaintBallT = "textures/PaintBall.png";
            protected static final String BaseCaptureT = "textures/BaseCapture.png";
            protected static final String SnakeT = "textures/Snake.png";
        //Racing
            protected static final String ChickenRunT = "textures/ChickenRun.png";
            protected static final String DriftRaceT = "textures/DriftRace.png";
            protected static final String F1RaceT = "textures/F1Race.png";
            protected static final String RallyRaceT = "textures/RallyRace.png";
            protected static final String SlotCarRaceT = "textures/SlotCarRace.png";
            protected static final String SkateboardRaceT = "textures/SkateboardRace.png";
            protected static final String RocketRaceT = "textures/RocketRace.png";
            protected static final String ObstacleCourseT = "textures/ObstacleCourse.png";
            protected static final String PipeFlightT = "textures/PipeFlight.png";
        //Goalkeeping
            protected static final String PingPongT = "textures/PingPong.png";
            protected static final String SoccerT = "textures/Soccer.png";
            protected static final String PinballT = "textures/Pinball.png";
            protected static final String ShotVolleyT= "textures/ShotVolley.png";
        //Rotation
            protected static final String GolfT = "textures/Golf.png";
            protected static final String MemoryT = "textures/Memory.png";
        //Endurance
            protected static final String BirdFeedT = "textures/BirdFeed.png";
            protected static final String NinjaT = "textures/Ninja.png";
            protected static final String MatchingSignsT = "textures/MatchingSigns.png";
            protected static final String AlienEvasionT = "textures/AlienEvasion.png";
            protected static final String StackerT = "textures/Stacker.png";
            protected static final String ReflexT = "textures/Reflex.png";
    protected String minigame;
    protected String charTemplate;
    protected int X;
    protected int Y;

    public Character(String minigame, String charTemplate){
        this.minigame = minigame;
        this.charTemplate = charTemplate;
    }

    abstract public void loop();
}
