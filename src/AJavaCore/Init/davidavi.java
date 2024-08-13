package AJavaCore.Init;

import java.util.Scanner;

public class davidavi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade = 19;
        boolean isAturoizadoComprarBebida = idade >= 18;

        if (isAturoizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        } else if (!isAturoizadoComprarBebida) {
            System.out.println("Não autorizado  a comprar bebida alcólica.");
        }
    }
}