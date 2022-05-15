
import javax.swing.JLabel;

public class Ascenseur extends Thread {
    
    private JLabel ascenseur;
    private int y;
    private Personne personne;

    public Ascenseur(JLabel a, Personne p) {
        this.ascenseur = a;
        this.personne = p;
        this.y = a.getLocation().y;
    }

    public int getEtage() {
        return Etage(this.y);
    }

    public void setEtage(int etage) {
        this.y = Y(etage);
    }

    public int Etage(int y) {
        int e = 0;
        switch (y) {
            case 300:
                e = 0;
                break;
            case 230:
                e = 1;
                break;
            case 160:
                e = 2;
                break;
            case 90:
                e = 3;
                break;
            case 20:
                e = 4;
                break;
        }
        return e;
    }

    public int Y(int e) {
        int ordonne = 0;
        switch (e) {
            case 0:
                ordonne = 300;
                break;
            case 1:
                ordonne = 230;
                break;
            case 2:
                ordonne = 160;
                break;
            case 3:
                ordonne = 90;
                break;
            case 4:
                ordonne = 20;
                break;
        }
        return ordonne;
    }

    synchronized void goUp(int etage) {
        int e = etage - this.getEtage();
        for (int i = 0; i < e; i++) {
            int ordonne = Y(this.getEtage()) - 70;
            this.ascenseur.setLocation(this.ascenseur.getLocation().x, ordonne);
            this.setEtage(Etage(ordonne));
            try {
                sleep(500);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
    }

    synchronized void goDown(int etage) {
        int e = this.getEtage() - etage;
        for (int i = 0; i < e; i++) {
            int ordonne = Y(this.getEtage()) + 70;
            this.ascenseur.setLocation(this.ascenseur.getLocation().x, ordonne);
            this.setEtage(Etage(ordonne));
            try {
                sleep(500);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        if (this.personne.getAppel() == true) {
            int e;
            if ((e = this.personne.getEtage()) > this.getEtage()) {
                this.goUp(e);
                if (this.getEtage() == e) {
                    this.personne.goIn();
                }
                int etageTo = this.personne.getEtageTo();
                if (etageTo > this.getEtage()) {
                    this.goUp(etageTo);
                } else if (etageTo < this.getEtage()) {
                    this.goDown(etageTo);
                }
                if (this.getEtage() == etageTo) {
                    this.personne.go(etageTo);
                    this.personne.goOut();
                }
            } else if ((e = this.personne.getEtage()) < this.getEtage()) {
                this.goDown(e);
                if (this.getEtage() == e) {
                    this.personne.goIn();
                }
                int etageTo = this.personne.getEtageTo();
                if (etageTo > this.getEtage()) {
                    this.goUp(etageTo);
                } else if (etageTo < this.getEtage()) {
                    this.goDown(etageTo);
                }
                if (this.getEtage() == etageTo) {
                    this.personne.go(etageTo);
                    this.personne.goOut();
                }
            }
        }
    }
}
