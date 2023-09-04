package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public boolean isReturnOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract void setName(String Name);
    abstract String getName();
}
