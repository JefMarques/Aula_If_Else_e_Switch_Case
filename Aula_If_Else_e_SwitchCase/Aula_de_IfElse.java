import java.util.Scanner;

public class Aula_de_IfElse {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade: ");

        int idade = entrada.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade!");
        }else {
            System.out.println("Não é maior de idade!");
        }
        entrada.close();
    }
}

/* 

Testes a se fazer:

entrada e saídas
 |  17  | Não é maior de idade! |
 |  10  | Não é maior de idade! |
 |  18  | É maior de idade!     |
 |  20  | É maior de idade!     |

*/
