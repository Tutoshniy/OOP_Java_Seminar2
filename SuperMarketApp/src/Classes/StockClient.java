package Classes;

/**
 * Создаём класс Акционного клиента, который является наследником класса
 * покупателя (Actors).
 */
public class StockClient extends Actor {

    /**
     * Обозначаем параметры класса:
     * 
     * @param stockName  - название акции
     * @param idStClient - индивидуальный номер клиента
     * @param stockCount - количество участников акции
     */
    private String stockName;
    private Integer idStClient;
    static int stockCount = 0;

    /**
     * Функция присвоения клиенту имени, индивидуального номера, а также обозначение
     * названия акции его акции.
     * 
     * @param name      - имя
     * @param id        - индивидуальный номер
     * @param stockName - название акции
     */
    public StockClient(String name, String stockName, int id) {
        super(name);
        this.idStClient = id;
        this.stockName = stockName;
        stockCount++;
    }

    /**
     * 
     * @return - название акции
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Функция присвоения названия акции
     * 
     * @param stockName - название акции
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * 
     * @return - индивидуальный номер акционного покупателя
     */
    public Integer getIdStClient() {
        return idStClient;
    }

    /**
     * Функция присвоения индивидуального номера акционному клиенту
     * 
     * @param idStClient - индивидуальный номер акционного покупателя
     */
    public void setIdStClient(Integer idStClient) {
        this.idStClient = idStClient;
    }

    /**
     * 
     * @return - количество участников акции
     */
    public static int getStockCount() {
        return stockCount;
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
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
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
