package Planets;
import Explorer.Explorer;
public  class Saturn implements Planet{
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
