import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<RownanieKwadratowe> pierwiastek = new ArrayList<>();

        for(int i = 0; i<4; i++){

            Scanner in = new Scanner(System.in);
            System.out.println("Wprowadź a: ");
            int a = in.nextInt();
            System.out.println("Wprowadź b: ");
            int b = in.nextInt();
            System.out.println("Wprowadź c: ");
            int c = in.nextInt();

            RownanieKwadratowe row = new RownanieKwadratowe(a, b, c);
            pierwiastek.add(row);
        }




        System.out.println(pierwiastek);





    }
}