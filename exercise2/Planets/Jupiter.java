package Planets;
import Explorer.Explorer;

public class Jupiter implements Planet {
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
