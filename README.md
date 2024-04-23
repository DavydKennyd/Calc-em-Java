# Calculadora Simples em Java
Este é um programa simples em Java que realiza operações básicas de cálculo (soma, subtração, multiplicação e divisão) com dois números fornecidos pelo usuário.

## Funcionalidades
- Solicita ao usuário que escolha dois números e um operador.
- Realiza a operação escolhida e exibe o resultado.
##  Uso
- Compile o arquivo Calculadora.java:
javac Calculadora.java
- Execute o programa:
java Calculadora

- Siga as instruções no console para inserir os números e o operador.
- O programa exibirá o resultado da operação.
## Exemplo de Uso
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o primeiro numero: ");
        double numero = scanner.nextDouble();
        System.out.println("Escolha o segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Escolha um operador simples +(soma),-(subtração), /(divisão) e *(multiplicação): ");
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
## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar sugestões de melhorias ou adicionar novas funcionalidades.

## Criador do Projeto
Este projeto foi criado por Davyd Kennyd.

## Licença
Este projeto está licenciado sob a MIT License.
