import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar Function com expressão Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar função para dobrar todos os números no Stream e armazená-los em outra lista
        List <Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
                //.collect(Collectors.toList());
                .toList();

        // Imprimir lista de números dobrados
        //numerosDobrados.forEach(n -> System.out.println(n));
        numerosDobrados.forEach(System.out::println);
        
    }
}
