package AJavaCore.Kenum.test;

import AJavaCore.Kenum.dominio.CompradorClient;

public class PedidoClient1 {
    public static void main(String[] args) {
        CompradorClient client1 = new CompradorClient(212);
        System.out.println(client1);

        client1.fowardShopping();
        System.out.println(client1);

        client1.fowardShopping();
        System.out.println(client1);

        client1.fowardShopping();
        System.out.println(client1);

        client1.fowardShopping();
        System.out.println(client1);
    }
}
