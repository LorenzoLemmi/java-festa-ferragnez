import java.util.Scanner;
public class CheckGuest{
    public static void main(String[] args) throws Exception {
        String [] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String name = scan.nextLine();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i].equals(name)) {
                System.out.println("Benvenuto " + name + "!");
            } else {
                System.out.println("Mi dispiace, " + name + " non puoi entrare.");
            }
        }
    }
}
