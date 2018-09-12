
public class Numeros {

    int numero;

    public int maiorNumero(int x, int y) {
        int maior = 0;
        if (x > y) {
            System.out.println(x + " é maior que " + y);
            numero = x;
        }
        if (x == y) {
            System.out.println(x + " é igual a " + y);
        }
        if (x < y) {
            System.out.println(x + " não é maior que " + y);
            numero = y;
        }
        return maior;
    }

    public void mostrarNumero() {
        System.out.println("O maior numero é: " + numero);
    }

    public void numeroDecrescente(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.println(i);
        }
    }
    
}
