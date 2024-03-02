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
        
    }
}
