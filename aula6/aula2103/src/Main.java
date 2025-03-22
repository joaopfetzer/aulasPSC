
public class Main {
    public static void main(String[] args) {
     int[] va = {3,9,6,5,8};
     int numero = 9;
     M013 vetor = new M013(numero);
     int[] vm = vetor.getVetorMultiplicado(va);
     vetor.imprimir(vm);

    }
}