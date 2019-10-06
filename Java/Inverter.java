public class Inverter {
    public static void main(String args[]) {
        int numeroInverte = 123456789;
        int numeroInvertido = 0;
        while (numeroInverte > 0) {
            numeroInvertido = numeroInvertido *10;
            numeroInvertido = numeroInvertido + (numeroInverte % 10);
            numeroInverte = numeroInverte / 10;
		}
		System.out.println(numeroInvertido);
    }
}
