
import java.awt.Point;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;

public class Personne extends Thread {

    private JLabel personneLabel;
    private int y;
    private boolean appel = true;
    private int etageTo;

    public Personne(JLabel p) {
        this.personneLabel = p;
        this.y = p.getLocation().y;
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

    public Boolean getAppel() {
        return appel;
    }

    public int getEtage() {
        return Etage(this.y);
    }

    public void setEtage(int etage) {
        this.y = Y(etage);
    }

    public void setEtageTo(int etageTo) {
        this.etageTo = etageTo;
    }

    public int getEtageTo() {
        return etageTo;
    }

    synchronized void goIn() {
        Point location = this.personneLabel.getLocation();
        if (location.x == 130) {
            this.personneLabel.setLocation(location.x + 100, location.y);
        } else if (location.x == 430) {
            this.personneLabel.setLocation(location.x - 100, location.y);
        }
        this.personneLabel.setVisible(false);
        try {
            Personne.sleep(500);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
    }

    synchronized void goOut() {
        Point location = this.personneLabel.getLocation();
        if (location.x == 230) {
            this.personneLabel.setLocation(location.x - 100, location.y);
        } else if (location.x == 330) {
            this.personneLabel.setLocation(location.x + 100, location.y);
        }
        this.personneLabel.setVisible(true);
        try {
            Personne.sleep(500);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
    }

    synchronized void go(int e) {
        this.y = Y(e);
        this.personneLabel.setLocation(this.personneLabel.getLocation().x, this.y);
        try {
            sleep(500);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
    }
}
