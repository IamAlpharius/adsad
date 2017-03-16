import java.util.Arrays;
import java.util.Random;

/**
 * Created by Антон Андреевич on 16.03.2017.
 */
public class Loveaaa {
    public static void main(String[] args) {
        Random r = new Random();
        int mass[] = new int[10];
        int k = 0;
        int b = 0;
        System.out.println("Основной массив");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(9);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                k++;
            } else {
                b++;
            }
        }
        System.out.println("Количество четных = " + k);
        System.out.println("Количество нечетных = " + b);
        int mass1[] = new int[k];
        int mass2[] = new int[b];
        int f = 0;
        int h = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                mass1[f] = mass[i];
                f++;
            } else {
                mass2[h] = mass[i];
                h++;
            }
        }
        System.out.println("Массив четных числе:");
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i]);
        }
        System.out.println();
        System.out.println("Массив нечетных числе:");
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i]);
        }
        System.out.println();
        Arrays.sort(mass1);
        Arrays.sort(mass2);
        int max = mass1[k - 1];
        int min = mass1[0];
        int max1 = mass2[b - 1];
        int min1 = mass2[0];
        System.out.println("Максимум четных чисел = " + max + " Минимум четных чисел = " + min);
        System.out.println("Максимум нечетных чисел = " + max1 + " Минимум нечетных чисел = " + min1);
    }
}
