import java.util.Scanner;

public class Zad_12 {
    public static void main(String[] args) {

        /*
        *  Napisz program zawierający definicję stałej nazwanej PI.
        * Wykorzystaj tę stałą do wyznaczenia objętości i pola powierzchni kuli.
        * Dane wejściowe, tj. promień kuli, mają być wprowadzone z klawiatury,
        *  a wynik wyświetlony na ekranie. (poziom 2, trzeba doczytać o zmiennych final)
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sphere radius: ");
        int r = scanner.nextInt();
        final double pi = 3.14d;


       double volume = 0.75*pi*r*r*r;
       System.out.println("Sphere volume: " +volume);
       double field = 4*pi*r*r;
       System.out.println("Sphere filed: " +field);

    }
}