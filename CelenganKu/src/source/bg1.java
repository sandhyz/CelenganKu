package source;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class bg1 extends JPanel {

    private Image bgimg;

    public bg1() {
        bgimg = new ImageIcon(getClass().getResource("/source/bg1.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(bgimg, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
