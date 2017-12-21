package Start;

/**
 * Created by Вадим on 25.11.2017.
 */
public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        if(b) System.out.println("Этот код выполнется");
        b = false;
        if(b) System.out.println("Этот код не выполняется");
        System.out.println("10>9 равно " + (10>9));
    }
}
