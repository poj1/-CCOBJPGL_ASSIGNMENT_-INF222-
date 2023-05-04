package Planets;
import Explorer.Explorer;

public class Neptune implements Planet {
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
