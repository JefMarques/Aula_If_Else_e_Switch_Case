import java.util.Scanner;

public class Aula_SwitchCase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da Semana 1-7:");

        int dia_da_semana = entrada.nextInt();
/*
        if (dia_da_semana == 1){
            System.out.println("Domingo");
        } else if (dia_da_semana == 2){
            System.out.println("Segunda-feira");
        } else if (dia_da_semana == 3){
            System.out.println("Terça-feira");
        } else if (dia_da_semana == 4){
            System.out.println("Quarta-feira");
        } else if (dia_da_semana == 5){
            System.out.println("Quinta-feira");
        } else if (dia_da_semana == 6){
            System.out.println("Sexta-feira");
        } else if (dia_da_semana == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia da semana válido.");
        }
*/
        switch(dia_da_semana){
        case 1: System.out.println("Domingo"); break;
        case 2: System.out.println("Segunda-feira"); break;
        case 3: System.out.println("Terça-feira"); break;
        case 4: System.out.println("Quarta-feira"); break;
        case 5: System.out.println("Quinta-feira"); break;
        case 6: System.out.println("Sexta-feira"); break;
        case 7: System.out.println("Sábado"); break;
        default: System.out.println("Não é um dia da semana válido.");
        }
        entrada.close();

/* 

Testes a se fazer:

entrada e saída
 |  1  | Domingo                        |
 |  2  | Segunda-feira                  |
 |  3  | Terça-feira                    |
 |  4  | Quarta-feira                   |
 |  5  | Quinta-feira                   |
 |  6  | Sexta-feira                    |
 |  7  | Sábado                         |
 |  8+ | Não é um dia da semana válido. |

*/

//Outro formato para o Switch Case

        switch(dia_da_semana){
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: System.out.println("Dia útil"); break;
        case 1: 
        case 7: System.out.println("Fim de semana"); break;
        default: System.out.println("Não é um dia da semana válido.");
        }
        entrada.close();
    }
}

/* 

Testes a se fazer:

entrada e saída
 |  1  | Fim de semana                  |
 |  2  | Dia útil                       |
 |  3  | Dia útil                       |
 |  4  | Dia útil                       |
 |  5  | Dia útil                       |
 |  6  | Dia útil                       |
 |  7  | Fim de semana                  |
 |  8+ | Não é um dia da semana válido. |

*/
