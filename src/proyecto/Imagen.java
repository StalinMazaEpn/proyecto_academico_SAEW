
package proyecto;
/**
 *
 * @author STALIN
 */

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Imagen extends javax.swing.JPanel {
    
  

    //@Override
    public void paintComponent(Graphics g) {
         Dimension tamanio = getSize();
        ImageIcon Img = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/EPN.jpg")).getImage());
        g.drawImage(Img.getImage(), 0, 0, tamanio.width,tamanio.height, null);
        //setOpaque(false);        
        //super.paintComponents(g);
    }    

}
