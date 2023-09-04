package Classes;

import Interfaces.iActorBehaviour;

/**
 * Реализация основного класса покупателя
 */
public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public boolean isReturnOrder;

    /**
     * Функция-конструктор покупателя
     * 
     * @param name - имя
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Функция названия покупателя
     * 
     * @param Name - имя
     */
    abstract void setName(String Name);

    /**
     * Функция передачи имения покупателя
     * 
     * @return - возвращает имя покупателя
     */
    abstract String getName();
}
