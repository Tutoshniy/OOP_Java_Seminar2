package Interfaces;

import Classes.Actor;

/**
 * Интерфейся для работы с клиентом
 */
public interface iActorBehaviour {
    /**
     * Функция обозначения получения клиентом заказа
     */
    public boolean isTakeOrder();

    /**
     * Функция обозначения запроса на получение клиентом товара
     */
    public boolean isMakeOrder();

    /**
     * Функция записи получения клиентом заказа
     * 
     * @param take - статус получения
     */
    public void setTakeOrder(boolean take);

    /**
     * Функция записи запроса на получение клиентом товара
     * 
     * @param make - статус запроса
     */
    public void setMakeOrder(boolean make);

    /**
     * Функция фиксирования возврата товара
     */
    public boolean isReturnOrder();

    /**
     * Функция для записи состояния возврата товара
     * 
     * @param ret - возврат товара
     */
    public void setReturnOrder(boolean ret);

    /**
     * Функция возврата информации о клиенте
     * 
     * @return - информация клиента
     */
    Actor getActor();

}
