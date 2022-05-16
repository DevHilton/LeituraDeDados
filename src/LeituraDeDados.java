import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String pronomeTratamento;
        String nome;
        double preco;
        int parcelas;

        System.out.println("Olá! Como gostaria de ser chamado? [senhor/senhora/senhorita]: ");

        pronomeTratamento = leia.nextLine();


        System.out.println("Qual seu nome?: ");
        nome = leia.nextLine();
        leia.nextLine();

        System.out.println("Qual o valor do produto?: ");
        preco = leia.nextDouble();

        System.out.println("Quantas parcelas deseja?: ");

        parcelas = leia.nextInt();
        System.out.println("Olá, "+pronomeTratamento+nome+"|");
        leia.nextLine();
        System.out.println("valor: "+preco+" "+" "+"parcelas: "+parcelas);
        System.out.println("valor das parcelas : " + preco / parcelas );



    }
}