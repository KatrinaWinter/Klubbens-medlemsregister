//Importera ArrayList, som används för att skapa en lista som kan växa när medlemmar läggs till i registret.
import java.util.ArrayList; 
//Importera List, som används för att deklarera listan med medlemmar.
import java.util.List;

//Skapa en klass som representerar ett register för medlemmar.
public class Register {
    //Skapa en privat lista för att lagra medlemmar.
    private List<Medlem> medlemmar = new ArrayList<>();

    //Skapa en metod som tar emot en medlem och lägger till den i det registret.
    public void LaggTillMedelem(Medlem medelem) {
        medlemmar.add(medelem);
        //Skriv ut ett meddelande som bekräftar att medlemmen har lagts till.
        System.out.println("Medlemmen " + medelem.getNamn() + " har lagts till i registret.");
    }
    //Skapa en metod som går igenom listan med medlemmar och skriver ut deras namn och medlemsnummer.
    public void HittaAlla() {
        //Kontrollera om listan är tom.
        if (medlemmar.isEmpty()) {
             //Skriv ut ett meddelande om att inga medlemmar hittades om listan är tom.
            System.out.println("Inga medlemmar hittades i registret.");
            return;
        } 
        //Om listan inte är tom, gå igenom varje medlem i listan. 
        for (Medlem medlem : medlemmar) {
            //Skriv ut deras namn och medlemsnummer.
            System.out.println("Namn: " + medlem.getNamn() + ", Medlemsnummer: " + medlem.getMedlemsnummer());
        }
    }

    //Skapa en metod som tar emot ett namn som parameter. 
    public Medlem SokMedelem(String namn) {
        //Gå igenom listan med medlemmar och jämför deras namn med det angivna namnet.
        for (Medlem medlem : medlemmar) {
            //Jämför namnet på medlemmen med det angivna namnet, ignorera skillnader i versaler och gemener samt eventuella extra mellanslag.
            if (medlem.getNamn().equalsIgnoreCase(namn.trim())) {
                //Returnera medlemmen om den hittas.
                return medlem;
            }
        }
        //Returnera inget medlemsobjekt om medlemmen inte hittas.
        return null; 
    }

}