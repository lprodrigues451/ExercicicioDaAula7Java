import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        double Nota1, Nota2, Nota3, Nota4, media;

        System.out.println("Por favor insira a primeira nota : ");
        Nota1 = leitor.nextDouble();

        System.out.println("Por favor insira a segunda nota : ");
        Nota2 = leitor.nextDouble();

        System.out.println("Por favor insira a terceira nota : ");
        Nota3 = leitor.nextDouble();

        System.out.println("Por favor insira a quarta nota : ");
        Nota4 = leitor.nextDouble();

        media = (Nota1 + Nota2 + Nota3 + Nota4)/4;

        
        if (media >= 7){
            System.out.println(" Aprovado ");
        }

        else {
            System.out.println("Não aprovado");
        }
    }
    
}
