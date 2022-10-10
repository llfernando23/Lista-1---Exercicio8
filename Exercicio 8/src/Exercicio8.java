import java.util.Scanner;

public class Exercicio8{


    public static void main(String[] args){

        //1) Coloque quanto vc ganha por hora e o número de horas trabalhadas no mês
        //2) Calcule e mostre  o total do seu salário no referido mês

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o seu valor/hora: ");
        int valor_hora = sc.nextInt();
        System.out.println("Coloque a quantidade de horas trabalhadas no mês ");
        int horas_mes = sc.nextInt();
        sc.close();


        int salario_mes = valor_hora * horas_mes;
        System.out.println("O valor do seu salário esse mês é: " + salario_mes);

    }
}