package source;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class wallet extends JLabel {

    private Image logoimg;

    public wallet() {
        logoimg = new ImageIcon(getClass().getResource("/source/wallet.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);

        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(logoimg, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }

}
