package WhileAndFor;
                                                 // processo só finalisa apos  ser satisfeito

import java.util.Scanner;

public class JogoDoAdvinha {
    public static void main(String[] args) {
        int numero = 0;
        int resposta = 42;
        Scanner leia = new Scanner(System.in);

        while (numero != resposta)
        {
            System.out.println("Tente advinhar O valor dentre 1 e 50!");
            numero = leia.nextInt();

            if (numero == 42)
            {
                System.out.println("Parabens! é 42");

            }
            else {
                System.out.println("Não foi dessa vez :( ");
            }
        }
    }
}
