package Explorer;

import Planets.Mars;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Venus;
import Planets.Uranus;
import Planets.Mercury;
import Planets.Earth;
import Planets.Neptune;
import Planets.Pluto;
import Planets.Planet;

public interface Explorer {

    void visit(Mars mars);
    void visit(Saturn saturn);
    void visit(Jupiter jupiter);
    void visit(Venus venus);
    void visit(Uranus uranus);
    void visit(Mercury mercury);
    void visit(Earth earth);
    void visit(Neptune neptune);
    void visit(Pluto pluto);

    default void visit(Planet planet){
        System.out.print("Landed on a planet");
    };
}
