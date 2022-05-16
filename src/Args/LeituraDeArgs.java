package Args;

public class LeituraDeArgs {

    public static void main(String[] args) {
        double salario = Double.parseDouble(args[0]);
        int bonus = Integer.parseInt(args[1]);


        System.out.println(salario + bonus);
    }
}
