# Klubbens medlemsregister


Datalogiskt tänkande:
Vi gick igenom uppgiften och jämförde den med en att-göra-lista från ett tidigare arbete för att få en bra grund och dela upp arbetet i tydliga delsteg. 
Vi skrev in uppgifterna i README-filen och fördelade ansvaret mellan gruppmedlemmarna. 
När vi arbetade på våra egna branches delade vi vid behov upp uppgifterna i mindre steg.

Klass vs Objekt:
Medlem får egen klass eftersom den ska kontrollera att medlemmarna får sitt namn och nummer. Det är den klassens fokus på. om den skulle va variabler i Main så skulle den bli svårare att hantera och kontrollera när man ska ha flera medlemmar.

Samarbete i Git:
Vi valde att arbeta med branches och att varje gruppmedlem ansvarade för sin egen klass. 
Vi samarbetade också genom anteckningar i README-filen och kom överens om namn på getters och metoder för att våra klasser skulle fungera tillsammans. 
Vi bestämde att vi kunde bocka av uppgifter i att-göra-listan, men att vi inte skulle ändra i varandras klasser före nästa merge. 
På så sätt kunde vi arbeta parallellt och minska risken för konflikter.


Ett problem ni löste:
Ett problem vi löste var en merge-konflikt som uppstod när ändringar gjordes på olika sätt, både via en PR och direkt utan PR. 
Vi granskade konflikten tillsammans på GitHub och mergade ändringarna. 
Under arbetet stötte vi även på problem med stavfel och hamnade i Vim när Git behövde ett commitmeddelande för en merge. 
Med hjälp av AI och genom att samarbeta löste vi problemen och fick koden att fungera.

Reflektion kring AI och externa hjälpmedel
Gemensamt: Vi använde ChatGPT för att diskutera hur vi kunde dela upp arbetet och planera utvecklingen och använde även anteckningar och tidigare arbeten som stöd.

Katrina: När jag hade skrivit min Main-klass bad jag ChatGPT granska koden och se om jag hade missat något eller om något såg konstigt ut. 
Jag jämförde återkopplingen med uppgiftens krav och våra överenskomna metodnamn för att avgöra vad som behövde rättas eller kontrolleras.

Sarah: Jag använde AI som ett bollplank och stämde av för att se om min kod såg okej ut eller om det var något som behövde ändras. 

Att-göra-lista 

[x] 1. Skapa klassen Medlem med namn (String) och medlemsnummer (int), fälten private, en konstruktor som sätter fälten när objektet skapas och metoder för att läsa namn och nummer (getNamn()) och (getNr()). - Tekla

[x] 2. Skapa klassen Register. Lägg till en medlem, lista alla (skriv ut namn + nummer) och sök på namn (skriv ut träffen eller att medlemmen saknas). LaggTillmedlem, HittaAlla, Sokmedlem. - Sarah

[x] 3. Skapa meny med scanner. Lägg till medlem, lista alla medlemmar, sök medlem och avsluta. - Katrina

[x] 4. Skriv i README.md.

Vi använder följande commits;
chore: text
feat: text
fix: text
docs: text

