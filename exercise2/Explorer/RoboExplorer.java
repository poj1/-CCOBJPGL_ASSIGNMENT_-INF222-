package Explorer;
import Planets.*;

public class RoboExplorer implements Explorer{
    @Override
    public void visit(Mercury mercury){
        System.out.println("Exploring a mercury!");
    }
    @Override
    public void visit(Mars mars){
        System.out.println("Exploring mars");
    }
    @Override
    public void visit(Saturn saturn){
        System.out.println("Exploring a saturn!");
    }

    @Override
    public void visit(Earth earth){
        System.out.println("Exploring a earth!");
    }

    @Override
    public void visit(Jupiter jupiter){
        System.out.println("Exploring a jupiter!");
    }

    @Override
    public void visit(Pluto pluto){
        System.out.println("Exploring a pluto!");
    }

    @Override
    public void visit(Uranus uranus){
        System.out.println("Exploring a uranus!");
    }

    @Override
    public void visit(Venus venus){
        System.out.println("Exploring a venus!");
    }

    @Override
    public void visit(Neptune neptune){
        System.out.println("Exploring a neptune!");
    }
}