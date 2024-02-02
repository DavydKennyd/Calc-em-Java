import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha o primeiro numero: ");
        double numero = scanner.nextDouble();
        System.out.println("Escolha o segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Escolha um operador simples +(soma),-(subtração), /(divisão) e *(multiplição): ");
        char txt = scanner.next().charAt(0);

        double resultado = 0;

        switch (txt) {
            case '+':
                resultado = numero + numero2;
                break;
            case '-':
                resultado = numero - numero2;
                break;
            case '*':
                resultado = numero * numero2;
            case '/':
                if (numero2 !=0){
                    resultado = numero / numero2;
                } else {
                    System.out.println("ERRO: divisão por zero não é permitida.");
                    System.exit(0);
                }
                break;

            default:
                System.out.println("Operação inválida");
        }
        System.out.print("Resultado: " + resultado);

        scanner.close();
    }
}
