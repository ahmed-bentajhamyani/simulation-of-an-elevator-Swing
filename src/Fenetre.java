
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Fenetre extends javax.swing.JFrame {

    int i = 0;
    Personne p1, p2, p3, p4, p5, p6;
    public Fenetre() {
        initComponents();

        ascenseurBtn.setBackground(new Color(255, 255, 255));
        ascenseurBtn.setBorder(null);
        ascenseurBtn.setBorderPainted(false);
        ImageIcon ascenseurBtnIcon = new ImageIcon("icons/ascenseurBtn.png");
        Image imageBtn = ascenseurBtnIcon.getImage();
        Image scalledImageBtn = imageBtn.getScaledInstance(40, 38, java.awt.Image.SCALE_SMOOTH);
        ascenseurBtnIcon = new ImageIcon(scalledImageBtn);
        ascenseurBtn.setIcon(ascenseurBtnIcon);
        ascenseurBtn.setBounds(617, 49, 40, 38);
        
        ImageIcon houseDoorIcon = new ImageIcon("icons/houseDoor.jpg");
        Image image = houseDoorIcon.getImage();
        Image scalledImage = image.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        houseDoorIcon = new ImageIcon(scalledImage);
        houseDoor1.setIcon(houseDoorIcon);
        houseDoor2.setIcon(houseDoorIcon);
        houseDoor3.setIcon(houseDoorIcon);
        houseDoor4.setIcon(houseDoorIcon);
        houseDoor5.setIcon(houseDoorIcon);
        houseDoor6.setIcon(houseDoorIcon);
        houseDoor7.setIcon(houseDoorIcon);
        houseDoor8.setIcon(houseDoorIcon);

        ImageIcon buildingDoorIcon = new ImageIcon("icons/buildingDoor.jpg");
        Image image2 = buildingDoorIcon.getImage();
        Image scalledImage2 = image2.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        //image2.getScaledInstance(WIDTH, HEIGHT, WIDTH);
        buildingDoorIcon = new ImageIcon(scalledImage2);
        buildingDoor1.setIcon(buildingDoorIcon);
        buildingDoor2.setIcon(buildingDoorIcon);

        ImageIcon ascenseurIcon = new ImageIcon("icons/ascenseur.jpg");
        Image image3 = ascenseurIcon.getImage();
        Image scalledImage3 = image3.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        ascenseurIcon = new ImageIcon(scalledImage3);
        ascenseur1.setIcon(ascenseurIcon);
        ascenseur2.setIcon(ascenseurIcon);
        
        ImageIcon pIcon1 = new ImageIcon("icons/blueGuy.png");
        Image image4 = pIcon1.getImage();
        Image scalledImage4 = image4.getScaledInstance(65, 60, java.awt.Image.SCALE_SMOOTH);
        pIcon1 = new ImageIcon(scalledImage4);
        blueGuy.setIcon(pIcon1);
        
        ImageIcon pIcon2 = new ImageIcon("icons/beachGuy.png");
        Image image5 = pIcon2.getImage();
        Image scalledImage5 = image5.getScaledInstance(65, 60, java.awt.Image.SCALE_SMOOTH);
        pIcon2 = new ImageIcon(scalledImage5);
        beachGuy.setIcon(pIcon2);
        
        ImageIcon pIcon3 = new ImageIcon("icons/lensGuy.png");
        Image image6 = pIcon3.getImage();
        Image scalledImage6 = image6.getScaledInstance(65, 60, java.awt.Image.SCALE_SMOOTH);
        pIcon3 = new ImageIcon(scalledImage6);
        lensGuy.setIcon(pIcon3);
        
        ImageIcon pIcon4 = new ImageIcon("icons/travelGuy.png");
        Image image7 = pIcon4.getImage();
        Image scalledImage7 = image7.getScaledInstance(65, 60, java.awt.Image.SCALE_SMOOTH);
        pIcon4 = new ImageIcon(scalledImage7);
        travelGuy.setIcon(pIcon4);
        
        ImageIcon pIcon5 = new ImageIcon("icons/travelGirl.png");
        Image image8 = pIcon5.getImage();
        Image scalledImage8 = image8.getScaledInstance(65, 60, java.awt.Image.SCALE_SMOOTH);
        pIcon5 = new ImageIcon(scalledImage8);
        travelGirl.setIcon(pIcon5);
        
        ImageIcon pIcon6 = new ImageIcon("icons/backpackGirl.png");
        Image image9 = pIcon6.getImage();
        Image scalledImage9 = image9.getScaledInstance(65, 60, java.awt.Image.SCALE_SMOOTH);
        pIcon6 = new ImageIcon(scalledImage9);
        backpackGirl.setIcon(pIcon6);
        
        

        // Ascenseur 1
        p1 = new Personne(blueGuy);
        p1.setEtageTo(2);
        p2 = new Personne(backpackGirl);
        p2.setEtageTo(3);
        p3 = new Personne(travelGirl);
        p3.setEtageTo(1);
        
        // Ascenseur 2
        p4 = new Personne(lensGuy);
        p4.setEtageTo(2);
        p5 = new Personne(beachGuy);
        p5.setEtageTo(2);
        p6 = new Personne(travelGuy);
        p6.setEtageTo(2);
        
        Ascenseur a1 = new Ascenseur(ascenseur1, p3);
        a1.start();

        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                
            }
        };

        Timer timer = new Timer(50, task);
        timer.start();

        System.out.println(houseDoor1.getLocation().x);
        System.out.println(houseDoor1.getLocation().y);
        System.out.println(houseDoor2.getLocation().x);
        System.out.println(houseDoor2.getLocation().y);
        System.out.println(houseDoor3.getLocation().x);
        System.out.println(houseDoor3.getLocation().y);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        houseDoor3 = new javax.swing.JLabel();
        houseDoor1 = new javax.swing.JLabel();
        houseDoor5 = new javax.swing.JLabel();
        houseDoor7 = new javax.swing.JLabel();
        houseDoor2 = new javax.swing.JLabel();
        houseDoor4 = new javax.swing.JLabel();
        houseDoor6 = new javax.swing.JLabel();
        houseDoor8 = new javax.swing.JLabel();
        buildingDoor2 = new javax.swing.JLabel();
        buildingDoor1 = new javax.swing.JLabel();
        ascenseur1 = new javax.swing.JLabel();
        ascenseur2 = new javax.swing.JLabel();
        blueGuy = new javax.swing.JLabel();
        beachGuy = new javax.swing.JLabel();
        lensGuy = new javax.swing.JLabel();
        travelGirl = new javax.swing.JLabel();
        backpackGirl = new javax.swing.JLabel();
        travelGuy = new javax.swing.JLabel();
        ascenseurBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        houseDoor3.setText("Door");

        houseDoor1.setText("Door");

        houseDoor5.setText("Door");

        houseDoor7.setText("Door");

        houseDoor2.setText("Door");

        houseDoor4.setText("Door");

        houseDoor6.setText("Door");

        houseDoor8.setText("Door");

        buildingDoor2.setText("Door");

        buildingDoor1.setText("Door");

        ascenseur1.setText("ascenseur1");

        ascenseur2.setText("ascenseur2");

        blueGuy.setText("jLabel1");

        beachGuy.setText("jLabel1");

        lensGuy.setText("jLabel1");

        travelGirl.setText("jLabel1");

        backpackGirl.setText("jLabel1");

        travelGuy.setText("jLabel1");

        ascenseurBtn.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buildingDoor1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseDoor7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseDoor1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseDoor3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseDoor5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(blueGuy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(ascenseur1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(ascenseur2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(travelGirl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backpackGirl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(travelGuy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(beachGuy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lensGuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houseDoor8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseDoor6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseDoor2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseDoor4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buildingDoor2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ascenseurBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ascenseurBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(houseDoor1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseDoor3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(travelGirl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseDoor5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backpackGirl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(houseDoor7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(houseDoor2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(houseDoor4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseDoor6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(travelGuy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseDoor8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beachGuy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buildingDoor2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ascenseur1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buildingDoor1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ascenseur2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueGuy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lensGuy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ascenseur1;
    private javax.swing.JLabel ascenseur2;
    private javax.swing.JButton ascenseurBtn;
    private javax.swing.JLabel backpackGirl;
    private javax.swing.JLabel beachGuy;
    private javax.swing.JLabel blueGuy;
    private javax.swing.JLabel buildingDoor1;
    private javax.swing.JLabel buildingDoor2;
    private javax.swing.JLabel houseDoor1;
    private javax.swing.JLabel houseDoor2;
    private javax.swing.JLabel houseDoor3;
    private javax.swing.JLabel houseDoor4;
    private javax.swing.JLabel houseDoor5;
    private javax.swing.JLabel houseDoor6;
    private javax.swing.JLabel houseDoor7;
    private javax.swing.JLabel houseDoor8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lensGuy;
    private javax.swing.JLabel travelGirl;
    private javax.swing.JLabel travelGuy;
    // End of variables declaration//GEN-END:variables
}
