package AJavaCore.Init;

public class ArrayForEach {
    public static void main(String[] args) {
//        int [] numeros = {1,2,3,4,5};
//        int contador = 0;
//        for (int n:numeros) {
//            System.out.println(contador + n);
//            contador++;
//        }

        String [] names = {"Davi" , "Bruno", "Huertas"};
        int numTotalCaracteres = 0;

        for(String n:names) {
            for (char letra:n.toCharArray()) {
                numTotalCaracteres++;
            }
        }

        System.out.println("Total de carcteres: " + numTotalCaracteres);

    }
}
