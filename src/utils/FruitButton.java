package utils;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.IFruct;

public class FruitButton extends JButton implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IFruct fruct;
	

	public FruitButton(Class<? extends IFruct> c, JLabel lb) {
		this.setText(c.getSimpleName().toString());
		this.setPreferredSize(new Dimension(85,30));
		try {
			this.fruct = c.newInstance();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}
		this.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  lb.setText(fruct.getGust());
			  } 
			} );
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		 fruct.getGust();
	}

}
