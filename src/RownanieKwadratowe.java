/**
 * Klasa ma za zadanie obliczac delte
 * a: jest to pole które ma za zadanie przechowywanie liczby którą wprowadzi uzytkownik
 * b: jest to pole które ma za zadanie przechowywanie liczby którą wprowadzi uzytkownik
 * c: jest to pole które ma za zadanie przechowywanie liczby którą wprowadzi uzytkownik
 * wynik: jest to kolekcja która przechowuje w sobie wszystkie rownania
 * @author: Denys Yermiichuk
 *
 * **/

import java.util.ArrayList;

public class RownanieKwadratowe {

    static private int a;
    static private int b;
    static private int c;

    ArrayList<Integer> wynik = new ArrayList<>();

    public RownanieKwadratowe(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Copy(int a, int b, int c) {
        RownanieKwadratowe.a = a;
        RownanieKwadratowe.b = b;
        RownanieKwadratowe.c = c;
    }

    public ArrayList<Integer> obliczPierwiastek(){
        int delta = (int) (Math.pow(b, 2) - 4* a*c);

        if(delta < 0){
            return wynik;
        }
        if(delta == 0){
            int pierwiastek = (-b)/2*a;
            wynik.add(pierwiastek);
            return wynik;
        }
        else{
            int pierwiastekplus = (int) ((-b+Math.sqrt(delta))/2*a);
            int pierwiastekminus = (int) ((-b-Math.sqrt(delta))/2*a);
            wynik.add(pierwiastekplus, pierwiastekminus);
            return wynik;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Wynik: " +
                a + "x^2"+
                " + " + b + "x" +
                " + " + c +
                " Rownania: " + wynik
                ;

    }


}
