package Interfaces;

/**
 * Интерфейся для определения запросов в магазине
 */
public interface iQueueBehaviour {
    /**
     * Функция добавления в очередь
     * @param actor - покупатель
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Функция выхода из очереди
     */
    void releaseFromQueue();

    /**
     * Функция запроса товара
     */
    void takeOrder();

    /**
     * Функция получения товара
     */
    void giveOrder();
}
