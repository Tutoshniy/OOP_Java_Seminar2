package Classes;

public class OrdinaryClient extends Actor {
    public OrdinaryClient(String name){
        super(name);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String Name) {
        super.name = name;
        
    }

    @Override
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

    @Override
    public void setReturnOrder(boolean ret) {
        isReturnOrder = ret;
    }
}
