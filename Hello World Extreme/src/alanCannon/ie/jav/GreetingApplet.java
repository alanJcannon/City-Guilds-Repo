package alanCannon.ie.jav;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

public class GreetingApplet extends JApplet {

	public GreetingApplet() {
		LanguagePanel langPanel = new LanguagePanel(); // Creating panel

		setContentPane(langPanel); // adds panel to jApplet

	}

	public void init() {
		setSize(450,300);
	}
}
