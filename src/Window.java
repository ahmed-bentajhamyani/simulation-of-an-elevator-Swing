
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window {

    private JFrame ascenseurFrame;
    Personne p1, p2, p3, p4, p5, p6;
    private int i = 0;

    public Window() {
        ascenseurFrame = new JFrame();
        ascenseurFrame.setResizable(false);
        ascenseurFrame.setBounds(100, 100, 800, 600);
        ascenseurFrame.setTitle("Ascenseur");
        ascenseurFrame.getContentPane().setBackground(new Color(255, 255, 255));
        ascenseurFrame.getContentPane().setLayout(null);

        JButton ascenseurBtn = new JButton();
        ascenseurBtn.setBackground(new Color(255, 255, 255));
        ascenseurBtn.setBorder(null);
        ascenseurBtn.setBorderPainted(false);
        ImageIcon ascenseurBtnIcon = new ImageIcon("icons/ascenseurBtn.png");
        Image imageBtn = ascenseurBtnIcon.getImage();
        Image scalledImageBtn = imageBtn.getScaledInstance(40, 38, java.awt.Image.SCALE_SMOOTH);
        ascenseurBtnIcon = new ImageIcon(scalledImageBtn);
        ascenseurBtn.setIcon(ascenseurBtnIcon);
        ascenseurBtn.setBounds(617, 49, 40, 38);
        ascenseurFrame.getContentPane().add(ascenseurBtn);
        
        JButton exitBtn = new JButton();
        exitBtn.setBackground(new Color(255, 255, 255));
        exitBtn.setBorder(null);
        exitBtn.setBorderPainted(false);
        ImageIcon exitBtnIcon = new ImageIcon("icons/exitBtn.png");
        Image imageExitBtn = exitBtnIcon.getImage();
        Image scalledImageExitBtn = imageExitBtn.getScaledInstance(40, 38, java.awt.Image.SCALE_SMOOTH);
        exitBtnIcon = new ImageIcon(scalledImageExitBtn);
        exitBtn.setIcon(exitBtnIcon);
        exitBtn.setBounds(640, 470, 40, 38);
        ascenseurFrame.getContentPane().add(exitBtn);


        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(100, 100, 600, 400);
        ascenseurFrame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel houseDoor1 = new JLabel("");
        JLabel houseDoor2 = new JLabel("");
        JLabel houseDoor3 = new JLabel("");
        JLabel houseDoor4 = new JLabel("");
        JLabel houseDoor5 = new JLabel("");
        JLabel houseDoor6 = new JLabel("");
        JLabel houseDoor7 = new JLabel("");
        JLabel houseDoor8 = new JLabel("");

        JLabel buildingDoor1 = new JLabel();
        JLabel buildingDoor2 = new JLabel();

        JLabel ascenseur1 = new JLabel();
        JLabel ascenseur2 = new JLabel();

        // House Door
        ImageIcon houseDoorIcon = new ImageIcon("icons/houseDoor.jpg");
        Image image = houseDoorIcon.getImage();
        Image scalledImage = image.getScaledInstance(70, 65, java.awt.Image.SCALE_SMOOTH);
        houseDoorIcon = new ImageIcon(scalledImage);

        houseDoor1.setIcon(houseDoorIcon);
        houseDoor1.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor1.setBounds(50, 20, 45, 50);
        panel.add(houseDoor1);

        houseDoor2.setIcon(houseDoorIcon);
        houseDoor2.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor2.setBounds(500, 20, 45, 50);
        panel.add(houseDoor2);

        houseDoor3.setIcon(houseDoorIcon);
        houseDoor3.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor3.setBounds(50, 90, 45, 50);
        panel.add(houseDoor3);

        houseDoor4.setIcon(houseDoorIcon);
        houseDoor4.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor4.setBounds(500, 90, 45, 50);
        panel.add(houseDoor4);

        houseDoor5.setIcon(houseDoorIcon);
        houseDoor5.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor5.setBounds(50, 160, 45, 50);
        panel.add(houseDoor5);

        houseDoor6.setIcon(houseDoorIcon);
        houseDoor6.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor6.setBounds(500, 160, 45, 50);
        panel.add(houseDoor6);

        houseDoor7.setIcon(houseDoorIcon);
        houseDoor7.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor7.setBounds(50, 230, 45, 50);
        panel.add(houseDoor7);

        houseDoor8.setIcon(houseDoorIcon);
        houseDoor8.setHorizontalAlignment(SwingConstants.CENTER);
        houseDoor8.setBounds(500, 230, 45, 50);
        panel.add(houseDoor8);

        // Building Door
        ImageIcon buildingDoorIcon = new ImageIcon("icons/buildingDoor.jpg");
        Image image2 = buildingDoorIcon.getImage();
        Image scalledImage2 = image2.getScaledInstance(70, 65, java.awt.Image.SCALE_SMOOTH);
        buildingDoorIcon = new ImageIcon(scalledImage2);

        buildingDoor1.setIcon(buildingDoorIcon);
        buildingDoor1.setHorizontalAlignment(SwingConstants.CENTER);
        buildingDoor1.setBounds(50, 300, 45, 50);
        panel.add(buildingDoor1);

        buildingDoor2.setIcon(buildingDoorIcon);
        buildingDoor2.setHorizontalAlignment(SwingConstants.CENTER);
        buildingDoor2.setBounds(500, 300, 45, 50);
        panel.add(buildingDoor2);

        // Personnage
        JLabel beachGuy = new JLabel();
        ImageIcon pIcon2 = new ImageIcon("icons/beachGuy.png");
        Image image5 = pIcon2.getImage();
        Image scalledImage5 = image5.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        pIcon2 = new ImageIcon(scalledImage5);
        beachGuy.setIcon(pIcon2);
        beachGuy.setHorizontalAlignment(SwingConstants.CENTER);
        beachGuy.setBounds(430, 300, 45, 50);
        panel.add(beachGuy);

        JLabel lensGuy = new JLabel();
        ImageIcon pIcon3 = new ImageIcon("icons/lensGuy.png");
        Image image6 = pIcon3.getImage();
        Image scalledImage6 = image6.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        pIcon3 = new ImageIcon(scalledImage6);
        lensGuy.setIcon(pIcon3);
        lensGuy.setHorizontalAlignment(SwingConstants.CENTER);
        lensGuy.setBounds(430, 90, 45, 50);
        panel.add(lensGuy);

        JLabel travelGuy = new JLabel();
        ImageIcon pIcon4 = new ImageIcon("icons/travelGuy.png");
        Image image7 = pIcon4.getImage();
        Image scalledImage7 = image7.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        pIcon4 = new ImageIcon(scalledImage7);
        travelGuy.setIcon(pIcon4);
        travelGuy.setHorizontalAlignment(SwingConstants.CENTER);
        travelGuy.setBounds(430, 160, 45, 50);
        panel.add(travelGuy);

        JLabel blueGuy = new JLabel();
        ImageIcon pIcon1 = new ImageIcon("icons/blueGuy.png");
        Image image4 = pIcon1.getImage();
        Image scalledImage4 = image4.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        pIcon1 = new ImageIcon(scalledImage4);
        blueGuy.setIcon(pIcon1);
        blueGuy.setHorizontalAlignment(SwingConstants.CENTER);
        blueGuy.setBounds(130, 230, 45, 50);
        panel.add(blueGuy);

        JLabel travelGirl = new JLabel();
        ImageIcon pIcon5 = new ImageIcon("icons/travelGirl.png");
        Image image8 = pIcon5.getImage();
        Image scalledImage8 = image8.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        pIcon5 = new ImageIcon(scalledImage8);
        travelGirl.setIcon(pIcon5);
        travelGirl.setHorizontalAlignment(SwingConstants.CENTER);
        travelGirl.setBounds(130, 20, 45, 50);
        panel.add(travelGirl);

        JLabel backpackGirl = new JLabel();
        ImageIcon pIcon6 = new ImageIcon("icons/backpackGirl.png");
        Image image9 = pIcon6.getImage();
        Image scalledImage9 = image9.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        pIcon6 = new ImageIcon(scalledImage9);
        backpackGirl.setIcon(pIcon6);
        backpackGirl.setHorizontalAlignment(SwingConstants.CENTER);
        backpackGirl.setBounds(130, 90, 45, 50);
        panel.add(backpackGirl);

        // Ascenseur
        ImageIcon ascenseurIcon = new ImageIcon("icons/ascenseur.jpg");
        Image image3 = ascenseurIcon.getImage();
        Image scalledImage3 = image3.getScaledInstance(70, 65, java.awt.Image.SCALE_SMOOTH);
        ascenseurIcon = new ImageIcon(scalledImage3);

        ascenseur1.setIcon(ascenseurIcon);
        ascenseur1.setHorizontalAlignment(SwingConstants.CENTER);
        ascenseur1.setBounds(215, 300, 45, 50);
        panel.add(ascenseur1);

        ascenseur2.setIcon(ascenseurIcon);
        ascenseur2.setHorizontalAlignment(SwingConstants.CENTER);
        ascenseur2.setBounds(345, 300, 45, 50);
        panel.add(ascenseur2);

        ascenseurBtn.addActionListener(e -> {
            // Personnage d'Ascenseur 1
            p1 = new Personne(blueGuy);
            p1.setEtageTo(2);
            p2 = new Personne(backpackGirl);
            p2.setEtageTo(1);
            p3 = new Personne(travelGirl);
            p3.setEtageTo(0);

            // Personnage d'Ascenseur 2
            p4 = new Personne(lensGuy);
            p4.setEtageTo(4);
            p5 = new Personne(beachGuy);
            p5.setEtageTo(2);
            p6 = new Personne(travelGuy);
            p6.setEtageTo(1);

            Ascenseur a1 = new Ascenseur(ascenseur1, p1);
            a1.start();
            Ascenseur a2 = new Ascenseur(ascenseur2, p6);
            a2.start();

            ActionListener task = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    i++;
                    if (i == 90) {
                        Ascenseur a3 = new Ascenseur(ascenseur1, p2);
                        a3.start();
                        Ascenseur a4 = new Ascenseur(ascenseur2, p5);
                        a4.start();
                    }
                    if (i == 180) {
                        Ascenseur a5 = new Ascenseur(ascenseur1, p3);
                        a5.start();
                        Ascenseur a6 = new Ascenseur(ascenseur2, p4);
                        a6.start();
                    }
                }
            };

            Timer timer = new Timer(50, task);
            timer.start();
        });

        exitBtn.addActionListener(e -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Window window = new Window();
                window.ascenseurFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
