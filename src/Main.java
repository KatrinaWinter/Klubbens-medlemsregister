import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();

        System.out.println("\n--- MedlemsRegister ---");
        int val = 0;

        while (val != 4) {
            System.out.println("\n1. Lägg till Medlem");
            System.out.println("2. Lista alla Medlemmar");
            System.out.println("3. Sök Medlem");
            System.out.println("4. Avsluta");
            System.out.println("\nVälj ett alternativ: ");

            String input = scanner.nextLine();

            try {
                val = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ange en siffra från menyn.");
                continue;
            }

            if (val == 1) {

                System.out.print("Namn: ");
                String namn = scanner.nextLine();

                int nr = 0;
                boolean giltigtNr = false;

                while (!giltigtNr) {
                    System.out.print("Medlemsnummer: ");
                    String inmatning = scanner.nextLine();

                    try {
                        nr = Integer.parseInt(inmatning);
                        giltigtNr = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Ange ett giltigt medlemsnummer med siffror.");
                    }
                }

                Medlem nymedlem = new Medlem(namn, nr);
                register.LaggTillmedlem(nymedlem);


            } else if (val == 2) {
                register.HittaAlla();

            } else if (val == 3) {
                System.out.println("Ange Namn: ");
                String namn = scanner.nextLine();

                Medlem hittad = register.Sokmedlem(namn);

                if (hittad != null) {
                    System.out.println(hittad.getNamn() +
                            ", Medlems nr: " +
                            hittad.getMedlemsnummer());
                } else {
                    System.out.println(namn + " hittades inte.");
                }

            } else if (val == 4) {
                System.out.println("Programmet avslutas.");

            } else {
                System.out.println( "Ogiltigt val. Välj mellan 1 och 4.");
            }
        }

        scanner.close();
    }
}
