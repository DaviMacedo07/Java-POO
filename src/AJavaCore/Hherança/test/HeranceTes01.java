package AJavaCore.Hherança.test;

import AJavaCore.Hherança.domain.Adress;
import AJavaCore.Hherança.domain.Functionary;
import AJavaCore.Hherança.domain.Pessoa;

public class HeranceTes01 {
    public static void main(String[] args) {
        Adress adress = new Adress();
        Adress adressFunc = new Adress();
        adressFunc.setStreet("Evilásio Miranda");
        adressFunc.setCep("CEP: 75748393");
        adress.setCep("CEP: 60830605");
        adress.setStreet("Egídio de Oliveira");
        Pessoa pessoa = new Pessoa("Davi");
        pessoa.setName("Davi");
        pessoa.setCpf("CPF: 17505142730");
        pessoa.setAdress(adress);
       // Functionary functionary = new Functionary(2400);
      //  functionary.setName("Olavo");
       // functionary.setCpf("CPF: 20786223391");
      //  functionary.setAdress(adressFunc);
        pessoa.print();
        System.out.println("--------");
      //  functionary.print();
        System.out.println("----------");
     //   functionary.print2();




    }
}
