package Planets;
import Explorer.Explorer;

public  class Pluto implements Planet{
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
