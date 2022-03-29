import java.util.Scanner;

public class Aula_de_If {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade: ");

        int idade = entrada.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade!");
        }
        entrada.close();
    }
}

/* 

Testes a se fazer:

entrada e saídas
 |  10  |                   |
 |  18  | É maior de idade! |
 |  20  | É maior de idade! |

*/
