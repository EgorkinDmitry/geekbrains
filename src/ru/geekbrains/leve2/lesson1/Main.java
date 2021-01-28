package ru.geekbrains.leve2.lesson1;

    public class Main {
        public static void main(String[] args) {
            Participant[] participants = {new Human(), new Robot(), new Cat()};
            Obstacle[] obstacles = {new Wall(), new RunningTrack(), new Wall()};

            for(Participant p : participants){
                for(Obstacle o : obstacles){
                    o.pass(p);
                }
            }
        }
    }

