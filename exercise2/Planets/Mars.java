package Planets;

import Explorer.Explorer;

public class Mars implements Planet{
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}