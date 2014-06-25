import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JToolBar;


public class sketchView extends JFrame {
	
	private JPanel myPanel = new JPanel();
	private JToolBar myToolBar = new JToolBar();
	private JButton DrawButton = new JButton("Drawing");
	private JButton EraseButton = new JButton("Eracing");
	private JButton SelectButton = new JButton("Selecting");
        private sketchControl sketchSpace = new sketchControl();
	
	private JSlider timeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
	
	private Dimension preferedSize = new Dimension(400, 40);
	
	
	public sketchView(){
		initToolBar();
		initLayOut();
		this.add(myPanel);
		myPanel.setPreferredSize(preferedSize);
	}
	
	private void initToolBar(){
		myToolBar.add(DrawButton);
		myToolBar.add(EraseButton);
		myToolBar.add(SelectButton);
	}
	
	private void initLayOut(){
                sketchSpace.setPreferredSize(new Dimension(600, 1500));
                sketchSpace.setBackground(Color.yellow);
//		myPanel.setLayout(new GridBagLayout());
                
                this.add(myToolBar, BorderLayout.NORTH);
                this.add(sketchSpace, BorderLayout.CENTER);
                this.add(timeSlider, BorderLayout.SOUTH);

//		myPanel.add(myToolBar, new GridBagConstraints( 0, 0, 1, 1, 1.0, 0.0,
//				GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                myPanel.add(sketchSpace, new GridBagConstraints( 0, 1, 1, 1, 1.0, 0.0,
//				GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//		myPanel.add(timeSlider, new GridBagConstraints( 0, 2, 1, 1, 1.0, 0.0,
//				GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
	}
}