package Zadanie_Funkcja.Silnia;

public class Main {
    public static int fibbonaczi(int n){

        if(n<3){
            return 1;
        }

        return fibbonaczi(n-2) + fibbonaczi(n-1);

    }

    public static void main(String[] args) {

	int[]tablica = new int[90];

       int liczba = 46;

        tablica[0] = 0;
        tablica[1] = 1;
        tablica[2] = 1;


        for(int i=3; i<=liczba; i++){
            tablica[i] = tablica[i-1] + tablica[i-2];

            System.out.println(tablica[i]);

        }
        System.out.println("Fib: " + fibbonaczi(liczba));

    }
}


//-Xint wyłączenie gita w Run/Edit configuration/