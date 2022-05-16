package caso;

import java.util.Scanner;

public class caso {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite O valor referente ao mês:");
        int mes = leia.nextInt();




        switch (mes) {
            case 1: // usase dois pontos " : "

                System.out.println("Janeiro");
                break;

                case 2: // usase dois pontos " : "

                System.out.println("fevereio");
                break;

                case 3: // usase dois pontos " : "

                System.out.println("Março");
                break;
                case 4: // usase dois pontos " : "

                System.out.println("Abril");
                break;
                case 5: // usase dois pontos " : "

                System.out.println("Maio");
                break;
                case 6: // usase dois pontos " : "

                System.out.println("Junho");
                break;
                case 7: // usase dois pontos " : "

                System.out.println("Julho");
                break;
                case 8: // usase dois pontos " : "

                System.out.println("Agosto");
                break;
                case 9: // usase dois pontos " : "

                System.out.println("Setembro");
                break;
                case 10: // usase dois pontos " : "

                System.out.println("Outubro");
                break;
                case 11: // usase dois pontos " : "

                System.out.println("Novembro");
                break;
                case 12: // usase dois pontos " : "

                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mes invalido");









        }


    }

}