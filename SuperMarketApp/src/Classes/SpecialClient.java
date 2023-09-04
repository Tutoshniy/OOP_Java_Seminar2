package Classes;

public class SpecialClient extends Actor {

    private int idVIP;

    /**
     * Функция-генератор специального клиента
     * 
     * @param name - имя
     * @param id   - индивидуальный номер
     */
    public SpecialClient(String name, int id) {
        super(name);
        this.idVIP = id;
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

    /**
     * Функция возврата id номера vip клиента
     * 
     * @return - индивидуальный номер
     */
    public int getIdVIP() {
        return idVIP;
    }

    /**
     * Функция записи id номера vip клиента
     * 
     * @param idVIP - индивидуальный номер специального клиента
     */
    public void setIdVIP(int idVIP) {
        this.idVIP = idVIP;
    }

    @Override
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

    @Override
    public void setReturnOrder(boolean ret) {
        isReturnOrder = ret;
    }

    // public int getIdVIP() {
    // return idVIP;
    // }

    // public void setIdVIP(int idVIP) {
    // this.idVIP = idVIP;
    // }
}