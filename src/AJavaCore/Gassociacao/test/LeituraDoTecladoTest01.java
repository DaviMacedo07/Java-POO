package AJavaCore.Gassociacao.test;
import java.util.Scanner;
public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = entrada1.nextLine();
        System.out.println("Digite sua idade: ");
        int age = entrada1.nextInt();
        System.out.println("Por fim , digite o seu sexo: M (masculino) ou F (feminino): ");
        char sex = entrada1.next().charAt(0);
        String sexoDescricao;
        if (sex == 'M') {
            sexoDescricao = "Masculino";
        } else if (sex == 'F') {
            sexoDescricao = "Feminino";
        } else {
            sexoDescricao = "Indefinido";
        }
        System.out.println("--- --- --- -- - - -- ");
        System.out.println("Olá " + name + ", você possui " + age + " anos" + " e é do sexo " + sexoDescricao);
    }
}
