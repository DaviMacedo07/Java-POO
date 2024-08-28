package AJavaCore.Kenum.test;

import AJavaCore.Kenum.dominio.Client;
import AJavaCore.Kenum.dominio.TipeClient;
import AJavaCore.Kenum.dominio.TipePayment;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Markson", TipeClient.PESSOA_FISICA, Client.TipePayment.DEBITO);
        Client client2 = new Client("Brandon", TipeClient.PESSOA_JURIDICA, Client.TipePayment.CREDITO);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(TipePayment.DEBITO.decontCalc(200));
        System.out.println(TipePayment.CREDITO.decontCalc(200));

    }
}
