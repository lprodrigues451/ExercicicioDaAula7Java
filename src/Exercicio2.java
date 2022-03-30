import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        double altura, peso, imc;

        System.out.println("Por favor insira a altura : ");
        altura = leitor.nextDouble();

        System.out.println("Por favor insira o peso : ");
        peso = leitor.nextDouble();

        imc = peso/(altura * altura );



        
        if (imc < 18.5){
            System.out.println(" magreza ");
        }

        else if(imc >=18.5 && imc < 24.9) {
            System.out.println("Normal");
        }

        else if(imc > 25 && imc < 29.9 ) {
            System.out.println("Sobre Peso");
        }

        else if(imc > 30 && imc < 39.9 ) {
            System.out.println("Obesidade");
        }

        else {
            System.out.println("Obesidade grave");
        }
    }
    
}
