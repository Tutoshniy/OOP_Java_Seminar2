import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.StockClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("President", 1);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new StockClient("Alex", "Tea", 2); // добавили нового акционного клиента с именем Alex, id 2 и акцией Tea.

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4); // Добавили акционного клиента в очередь

        magnit.update();
    }
}
