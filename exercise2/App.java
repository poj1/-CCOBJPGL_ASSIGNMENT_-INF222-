
import Planets.*;
import Explorer.*;

public class App {
    public static void main(String[] args){

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Planet neptune = new Neptune();
        Planet pluto = new Pluto();
        Planet venus = new Venus();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();


        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RoboExplorer();

        mars.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        pluto.accept(astronaut);
        saturn.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);

        mars.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        mercury.accept(rover);
        neptune.accept(rover);
        pluto.accept(rover);
        saturn.accept(rover);
        uranus.accept(rover);
        venus.accept(rover);

    }
}