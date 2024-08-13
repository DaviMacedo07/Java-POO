package AJavaCore.Init;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Diga seu nome: ");
        String name =  input.next();
        System.out.println("Diga seu endereço");
        String adress = input.next();
        System.out.println("Qual o seu salário?");
        float sal = input.nextFloat();
        String dataRec = "30/07/2024";

        System.out.println("Eu " + name + ", morando no endereço " + adress + ", confirmo que recebi o salário de " + sal + ", na data " + dataRec );

    }
}