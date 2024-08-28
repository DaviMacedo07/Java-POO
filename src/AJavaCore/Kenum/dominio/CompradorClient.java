package AJavaCore.Kenum.dominio;

public class CompradorClient {
    private int id;
    private ProcessOfTheLogistc processOfTheLogistc;

    public CompradorClient(int id) {
        this.id = id;
        this.processOfTheLogistc = ProcessOfTheLogistc.NEW;
    }

    @Override
    public String toString() {
        return "CompradorClient{" +
                "id=" + id +
                ", processOfTheLogistc=" + processOfTheLogistc +
                '}';
    }

    public void fowardShopping() {
        switch (processOfTheLogistc) {
            case NEW:
                processOfTheLogistc = ProcessOfTheLogistc.PROCESSING;
                System.out.println("The order now is being processed!");
                break;
            case PROCESSING:
                processOfTheLogistc = ProcessOfTheLogistc.SENT;
                System.out.println("The order now is being sent!");
                break;
            case SENT:
                processOfTheLogistc = ProcessOfTheLogistc.DELIVERED;
                System.out.println("The order now is delivered!");
                break;
            case DELIVERED:
                System.out.println("The order is delivered , thanks!");
                break;
            case ABORTED:
                System.out.println("The order was canceled. Bye!");
        }


    }
}
