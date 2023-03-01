class Avto {
    String znamka, model, voznik;
    double cena;
    int starostVoznika, casVozniskegaDovoljenja;
    boolean voznikAvta = true;

    Avto(String inpZnamka, String inpModel, String inpVoznik, int inpStarostVoznika, int inpCasVozniskegaDovoljenja, double inpCena) {
        znamka = inpZnamka;
        model = inpModel;
        voznik = inpVoznik;
        cena = inpCena;
        starostVoznika = inpStarostVoznika;
        casVozniskegaDovoljenja = inpCasVozniskegaDovoljenja; 
    }

    void opis() {
        System.out.println("znamka: " + znamka + ", model: " + model + ", cena: " + cena);
        if(voznikAvta == true) {
            System.out.println("ime voznika: " + voznik + ", starost: " + starostVoznika + ", cas vozniskega dovoljenja: " + casVozniskegaDovoljenja);
        }
    }

    void nastaviVoznika(String noviVoznik) {
        voznikAvta = true;
        voznik = noviVoznik;
    }

    void trenutniVoznik() {
        if(voznikAvta == true) {
            System.out.println("trenutni voznik: " + voznik);
        } else {
            System.out.println("v avtu ni voznika");
        }
    }

    void izstopVoznika() {
        voznikAvta = false;
        System.out.println("voznik je izstopil");
    }

    boolean avtoPrizgan = false;

    void vzgi() {
        if(avtoPrizgan == false) {
            avtoPrizgan = true;
            System.out.println("avto se je vzgal");
        } else if(avtoPrizgan == true) {
            System.out.println("avto je ze prizgan");
        }
    }

    void premakni() {
        if(avtoPrizgan == true) {
            System.out.println("avto se je premaknil");
        } else if(avtoPrizgan == false) {
            System.out.println("avto je ugasnen");
        }

    }

    void ugasni() {
        if(avtoPrizgan == true) {
            avtoPrizgan = false;
            System.out.println("avto se je ugasnil");
        } else if(avtoPrizgan == false) {
            System.out.println("avto je ze ugasnen");
        }
    }
}
