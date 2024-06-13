import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // Criar lista de númeoros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);


        // Exemplo 1:
        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                //System.out.println(numero);
                System.out.print(numero + " \n");
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);
        System.out.println("Fim do Exemplo 1");

        // Exemplo 2:
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
        });
        System.out.println("Fim do Exemplo 2");

        // Exemplo 3:
        numeros.forEach(n -> {
            if( n % 2 == 0){
                System.out.println(n);
            }
        });

        System.out.println("Fim do exemplo 3");

    }
}
