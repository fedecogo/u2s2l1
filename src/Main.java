import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci un numero da inserire nell array (6 per uscire):");
            System.out.println("Inserisci un numero da inserire nell array (6 per uscire):");
            int num = scanner.nextInt();
            if (num == 6) {
                break;
            }
            System.out.println("Inserisci la posizione in cui inserire il numero nell array :");
            int pos = scanner.nextInt();
            try {
                array[pos - 1] = num;
                stampaArray(array);
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        scanner.close();
    }

    private static void stampaArray(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
