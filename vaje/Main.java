class Main {
    public static void main(String[] args) {
        Avto at = new Avto("Porsche", "911", "Miha", 24, 4, 120000);

        at.opis();
        at.nastaviVoznika("Jaka");
        at.trenutniVoznik();
        at.vzgi();
        at.premakni();
        at.ugasni();
        at.premakni();
        at.opis();
    }
}  