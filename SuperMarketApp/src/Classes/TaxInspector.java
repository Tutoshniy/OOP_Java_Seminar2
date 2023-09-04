package Classes;

import Interfaces.iActorBehaviour;

/**
 * Реализация класса Инспектора
 */
public class TaxInspector implements iActorBehaviour {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;

    /**
     * Функция-генератор инспектора
     */
    public TaxInspector() {
        this.name = "Tax Audit";
    }

    /**
     * Функция просмотра имени инспектора
     * @return - имя инспектора
     */
    public String getName() {
        return name;
    }


    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }


    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }


    @Override
    public void setTakeOrder(boolean take) {
        isTakeOrder = take;
    }


    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }


    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
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
