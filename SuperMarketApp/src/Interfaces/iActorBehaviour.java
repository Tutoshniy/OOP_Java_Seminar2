package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean take);
    public void setMakeOrder(boolean make);
    /**
     * Создаём функцию для фиксирования возврата товара
     */
    public boolean isReturnOrder();
    /**
     * Создаём функцию для обозначения
     * @param ret - возврат товара
     */
    public void setReturnOrder(boolean ret);
    Actor getActor();

}
