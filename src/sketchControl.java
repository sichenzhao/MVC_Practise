
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szhao
 */
public class sketchControl extends JPanel
                            implements MouseListener, MouseMotionListener{

    public void mouseDragged(MouseEvent me) {
        System.out.println("Dragged");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseMoved(MouseEvent me) {
        System.out.println("Moved");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseClicked(MouseEvent me) {
        System.out.println("Clicked");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mousePressed(MouseEvent me) {
        System.out.println("Pressed");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("Released");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("Entered");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("Exited");
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

}
