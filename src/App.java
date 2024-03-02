import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Ex1 - O que é esse número?
        int num = -11;

        String imprimir = num + " é ";

        if(num %  2 == 0) {
            
            imprimir += "par e ";
        
        } else {
            imprimir += "ímpar e ";
        }

        if(num >= 0) {
            imprimir += "positivo.";
        } else {
            imprimir += "negativo.";
        }

        System.out.println(imprimir);

        // Ex2 - Fibonacci

        int x = 20;

        List<Integer> sequence = new ArrayList<>();
        
        for(int i = 0; i < x; i++) {
            if(i == 0 || i == 1) {
                sequence.add(i);
            } else {
                sequence.add(sequence.get(i-2) + sequence.get(i-1));
            }
        }

        System.out.println(sequence);
    }
}
