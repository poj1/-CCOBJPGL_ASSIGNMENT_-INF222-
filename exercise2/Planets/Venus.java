package Planets;
import Explorer.Explorer;

public class Venus implements Planet {
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
