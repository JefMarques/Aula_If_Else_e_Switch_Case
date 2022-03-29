import java.util.Scanner;

public class Aula_Varios_IfElse {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço do item: ");

        double preco = entrada.nextDouble();

        if (preco <= 10){
            System.out.println("Produto está barato.");
        } else if (preco > 10 && preco <= 15){
            System.out.println("Produto está bom.");
        } else if (preco > 15 && preco <= 20){
            System.out.println("Prduto está caro.");
        } else if (preco > 20 && preco <= 25){
            System.out.println("Produto está muito caro.");
        } else{ //Qualquer numero acima de 25
            System.out.println("Não compre de jeito nenhum!");
        }

        entrada.close();
    }
}

/* 

Testes a se fazer:

entrada e saídas
 |  8,5   | Produto está barato.        |
 |  10    | Produto está barato.        |
 |  11,2  | Produto está bom.           |
 |  15    | Produto está bom.           |
 |  16,4  | Prduto está caro.           |
 |  20    | Prduto está caro.           |
 |  21,3  | Produto está muito caro.    |
 |  25    | Produto está muito caro.    |
 |  25,3  | Não compre de jeito nenhum! |

*/
