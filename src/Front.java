
import java.util.Scanner;

public class Front {
// //Exerciocio 1

//    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
//        Numeros num = new Numeros();
//        
//        System.out.print("Digite um numero: ");
//        int x = ler.nextInt();
//        
//        System.out.print("Digite outro numero: ");
//        int y = ler.nextInt();
//        
//        num.maiorNumero(x, y);
//        num.mostrarNumero();
//        
//    }
//  //CRIANDO TABUADA DE PRODUTO
//    public static void main(String[] args) {
//// 2. instanciando e criando um objeto Scanner
//    Scanner ler = new Scanner(System.in);
// 
//    int i, n;
// 
//    System.out.printf("Informe o número para a tabuada:\n");
//    n = ler.nextInt(); // 3.1 entrada de dados (lendo um valor inteiro)
// 
//    System.out.printf("\n+--Resultado--+\n");
//    for (i=1; i<=10; i++) {
//      System.out.printf("| %2d * %d = %2d |\n", i, n, (i*n));
//    }
//    System.out.printf("+-------------+\n");
//    // PROGRAMA IMC CORPORAL
//    public static void main(String args[]) {
//// 2. instanciando e criando um objeto Scanner
//        Scanner ler = new Scanner(System.in);
//
//        double pc, alt, vlrIMC;
//
//        System.out.printf("Informe o Peso Corporal em kg: ");
//        pc = ler.nextDouble(); // 3.3 entrada de dados (lendo um valor real)
//
//        System.out.printf("Informe a Altura em metros...: ");
//        alt = ler.nextDouble(); // 3.3 entrada de dados (lendo um valor real)
//
//        System.out.printf("\n========================================\n");
//        vlrIMC = IMC(pc, alt);
//        System.out.printf("IMC = %.2f (%s)\n", vlrIMC, interpretacaoIMC(vlrIMC));
//        System.out.printf("========================================\n");
//    }
//
//    public static double IMC(double pc, double alt) {
//        return (pc / (alt * alt));
//    }
//
//    public static String interpretacaoIMC(double vlrIMC) {
//        if (vlrIMC < 20) {
//            return ("Magro");
//        } else if ((vlrIMC >= 20) && (vlrIMC <= 24)) {
//            return ("Normal");
//        } else if ((vlrIMC >= 25) && (vlrIMC <= 29)) {
//            return ("Acima do peso");
//        } else if ((vlrIMC >= 30) && (vlrIMC <= 34)) {
//            return ("Obeso");
//        } else // acima de 34
//        {
//            return ("Muito obeso");
//        }
//    }
//    // EXERCICIO 2
//    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
//        Numeros num = new Numeros();
//
//        System.out.print("Digite um numero: ");
//        int x = ler.nextInt();
//
//        num.numeroDecrescente(x);
//    }
    
    // EXERCICIO 3
    public static void main(String[] args) {
        int soma = 0;
        long produto = 1;

        for (int i = 0; i <= 30; i++) {
            if ((i % 2) != 0) {
                soma = soma + i;
            }
        }
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                produto = produto * i;
            }
        }
        
        System.out.println("Soma dos impares de 0 a 30: " + soma + "\n");
        System.out.println("Produto dos pares de 0 a 30: " + produto + "\n");
    }
    
    
    
}
