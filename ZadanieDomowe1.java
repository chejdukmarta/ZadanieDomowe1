public class ZadanieDomowe1 {
    public static void main(String[] args) {
        int humanAge = 21;

        if (humanAge < 0) return;
        if (humanAge > 130) return;

        if (humanAge < 18) {
            System.out.println("Osoba jest dzieckiem");
        } else if (humanAge >= 18 && humanAge < 40) {
            System.out.println("Osoba jest młoda");
        } else if (humanAge >= 40 && humanAge < 65) {
            System.out.println("Osoba jest w średnim wieku");
        } else if (humanAge >= 65) {
            System.out.println("Osoba jest starsza");
        }
    }
}
