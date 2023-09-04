package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс передвижения по магазину
 */
public interface iMarketBehaviour {

    /**
     * Функция для обозначения вхождения в магазин
     * @param actor - покупателя
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Функция для обозначения выхода из магазина
     * @param actors - покупатель
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Функция обновления места в очереди
     */
    void update();
}