package alanCannon.ie.jav;
//line 87
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.UIManager;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class LanguagePanel extends JPanel {
	private JTextField txtLangType;
	private JTextField txtHelloMsg;


	private JLabel imgEngFlag;
	private JLabel imgIrishFlag;
	private JLabel imgWelshFlag;
	private JLabel imgItalianFlag;
	private JLabel imgSpanishFlag;
	private JLabel imgMalteseFlag;
	private JLabel imgGermanFlag;
	private JLabel imgAzerFlag;
	private JLabel imgSwahiliFlag;
	
	public void hideLabel(){
		imgEngFlag.setVisible(false);
		imgIrishFlag.setVisible(false);
		imgWelshFlag.setVisible(false);
		imgItalianFlag.setVisible(false);
		imgSpanishFlag.setVisible(false);
		imgMalteseFlag.setVisible(false);
		imgGermanFlag.setVisible(false);
		imgAzerFlag.setVisible(false);
		imgSwahiliFlag.setVisible(false);
	}
	
	
	public LanguagePanel() {
		setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnClear.setFont(new Font("Kristen ITC", Font.PLAIN, 11));
		btnClear.setBounds(339, 140, 89, 23);
		btnClear.addActionListener(myActionListener);
		add(btnClear);
		

		txtLangType = new JTextField();
		txtLangType.setFont(new Font("Britannic Bold", Font.PLAIN, 17));
		txtLangType.setEditable(false);
		txtLangType.setBackground(new Color(255, 255, 255));
		txtLangType.setBounds(169, 22, 259, 38);
		add(txtLangType);
		txtLangType.setColumns(10);
		
		txtHelloMsg = new JTextField();
		txtHelloMsg.setFont(new Font("Britannic Bold", Font.PLAIN, 18));
		txtHelloMsg.setBackground(new Color(255, 255, 255));
		txtHelloMsg.setEditable(false);
		txtHelloMsg.setBounds(31, 71, 397, 92);
		add(txtHelloMsg);
		txtHelloMsg.setColumns(10);
		
		JButton btnItalian = new JButton("Italian");
		btnItalian.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnItalian.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnItalian.setBounds(41, 217, 112, 32);
		btnItalian.addActionListener(myActionListener);
		add(btnItalian);
		
		JButton btnEnglish = new JButton("English");
		btnEnglish.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnEnglish.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnEnglish.setBounds(41, 174, 112, 32);
		btnEnglish.addActionListener(myActionListener);
		add(btnEnglish);
		
		JButton btnIrish = new JButton("Irish");
		btnIrish.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnIrish.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnIrish.setBounds(171, 174, 112, 32);
		btnIrish.addActionListener(myActionListener);
		add(btnIrish);
		
		JButton btnMaltese = new JButton("Maltese");
		btnMaltese.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnMaltese.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnMaltese.addActionListener(myActionListener);
		btnMaltese.setBounds(305, 217, 112, 32);
		add(btnMaltese);
		
		JButton btnSpanish = new JButton("Spanish");
		btnSpanish.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnSpanish.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnSpanish.setBounds(171, 217, 112, 32);
		btnSpanish.addActionListener(myActionListener);
		add(btnSpanish);
		
		JButton btnWelsh = new JButton("Welsh");
		btnWelsh.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnWelsh.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnWelsh.setBounds(305, 174, 112, 32);
		btnWelsh.addActionListener(myActionListener);
		add(btnWelsh);
		

		
		JButton btnGerman = new JButton("German");
		btnGerman.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnGerman.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnGerman.setBounds(41, 260, 112, 32);
		btnGerman.addActionListener(myActionListener);
		add(btnGerman);
		
		JButton btnAzerbaijani = new JButton("Azerbaijani");
		btnAzerbaijani.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnAzerbaijani.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnAzerbaijani.setBounds(169, 261, 112, 32);
		btnAzerbaijani.addActionListener(myActionListener);
		add(btnAzerbaijani);
		
		JButton btnSwahili = new JButton("Swahili");
		btnSwahili.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnSwahili.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnSwahili.setBounds(305, 260, 112, 32);
		btnSwahili.addActionListener(myActionListener);
		add(btnSwahili);
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(38, 22, 113, 38);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblHelloIn = new JLabel("Hello in:");
		lblHelloIn.setBounds(6, 16, 101, 17);
		panel.add(lblHelloIn);
		lblHelloIn.setBackground(Color.WHITE);
		lblHelloIn.setFont(new Font("Hobo Std", Font.PLAIN, 22));

		imgEngFlag = new JLabel("");
		imgEngFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\englishFlag.png"));
		imgEngFlag.setBounds(0, 0, 450, 300);
		imgEngFlag.setVisible(false);
		add(imgEngFlag);
	
		imgIrishFlag = new JLabel("");
		imgIrishFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\irishFlag.png"));
		imgIrishFlag.setBounds(0, 0, 450, 300);
		imgIrishFlag.setVisible(false);
		add(imgIrishFlag);
		
		imgWelshFlag = new JLabel("");
		imgWelshFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\welshFlag.png"));
		imgWelshFlag.setBounds(0, 0, 450, 300);
		imgWelshFlag.setVisible(false);
		add(imgWelshFlag);
		
		imgItalianFlag = new JLabel("");
		imgItalianFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\italianFlag.png"));
		imgItalianFlag.setBounds(0, 0, 450, 300);
		imgItalianFlag.setVisible(false);
		add(imgItalianFlag);
		
		imgSpanishFlag = new JLabel("");
		imgSpanishFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\spanishFlag.png"));
		imgSpanishFlag.setBounds(0, 0, 450, 300);
		imgSpanishFlag.setVisible(false);
		add(imgSpanishFlag);

		imgMalteseFlag = new JLabel("");
		imgMalteseFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\malteseFlag.png"));
		imgMalteseFlag.setBounds(0, 0, 450, 300);
		imgMalteseFlag.setVisible(false);
		add(imgMalteseFlag);
	
		imgGermanFlag = new JLabel("");
		imgGermanFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\germanFlag.png"));
		imgGermanFlag.setBounds(0, 0, 450, 300);
		imgGermanFlag.setVisible(false);
		add(imgGermanFlag);
	
		imgAzerFlag = new JLabel("");
		imgAzerFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\azerFlag.png"));
		imgAzerFlag.setBounds(0, 0, 450, 300);
		imgAzerFlag.setVisible(false);
		add(imgAzerFlag);
	
		imgSwahiliFlag = new JLabel("");
		imgSwahiliFlag.setIcon(new ImageIcon("C:\\Java\\HelloWorldExtreme\\swahiliFlag.png"));
		imgSwahiliFlag.setBounds(0, 0, 450, 300);
		imgSwahiliFlag.setVisible(false);
		add(imgSwahiliFlag);
	
	}

	
		
		//below are LanguagePanel constructor,
		//were going to create our ActionListener
	
	private ActionListener myActionListener = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent event){

			//this is where the code goes for when an event happens
			if(event.getSource() instanceof JButton){
				JButton buttonPressed = (JButton)event.getSource();
				String buttonText = buttonPressed.getText();
			
			switch(buttonText){
				case "English": txtLangType.setText(buttonText);
								txtHelloMsg.setText("Hello");
								txtLangType.setBackground(new Color(255,255,255));
								txtHelloMsg.setBackground(new Color(30,144,255));
							
								txtLangType.setForeground(new Color(255,0,0));
								txtHelloMsg.setForeground(new Color(255,0,0));
							
								hideLabel();
								imgEngFlag.setVisible(true);
								
					break;
			
				case "Irish": txtLangType.setText(buttonText);
							  txtHelloMsg.setText("Dia Duit");
							  txtLangType.setBackground(new Color(255,165,0));
							  txtHelloMsg.setBackground(new Color(0,255,0));
							  
							  txtLangType.setForeground(new Color(255,255,255));
							  txtHelloMsg.setForeground(new Color(255,255,255));
							  
							  hideLabel();
							  imgIrishFlag.setVisible(true);
					break;
				
				case "Welsh": txtLangType.setText(buttonText);
							  txtHelloMsg.setText("Helo");
							  txtLangType.setBackground(new Color(0,255,0));
							  txtHelloMsg.setBackground(new Color(255,255,255));
							
							  txtLangType.setForeground(new Color(255,0,0)); 
							  txtHelloMsg.setForeground(new Color(255,0,0));
							  
							  hideLabel();
							  imgWelshFlag.setVisible(true);
					break;
				
				case "Italian": txtLangType.setText(buttonText);
								txtHelloMsg.setText("Ciao");
							    txtLangType.setBackground(new Color(34,144,34));
							    txtHelloMsg.setBackground(new Color(204,0,0));
								
							    txtLangType.setForeground(new Color(255,255,255));
								txtHelloMsg.setForeground(new Color(255,255,255));
								
								hideLabel();
								imgItalianFlag.setVisible(true);
					break;
				
				case "Spanish":	txtLangType.setText(buttonText);
								txtHelloMsg.setText("Hola");
							    txtLangType.setBackground(new Color(255,0,0));
							    txtHelloMsg.setBackground(new Color(255,255,0));
								
							    txtLangType.setForeground(new Color(255,255,0)); 
								txtHelloMsg.setForeground(new Color(255,0,0));
								
								hideLabel();
								imgSpanishFlag.setVisible(true);
					break;
				
				case "Maltese": txtLangType.setText(buttonText);
								txtHelloMsg.setText("Hello");
							    txtLangType.setBackground(new Color(255,255,255));
						        txtHelloMsg.setBackground(new Color(255,0,0));
							
						        txtLangType.setForeground(new Color(255,0,0));
								txtHelloMsg.setForeground(new Color(255,255,255));
								
								hideLabel();
								imgMalteseFlag.setVisible(true);
					break;
			
				case "German": txtLangType.setText(buttonText);
								txtHelloMsg.setText("Hallo");
								txtLangType.setBackground(new Color(0,0,0));
								txtHelloMsg.setBackground(new Color(255,0,0));
							
								txtLangType.setForeground(new Color(255,255,0));
								txtHelloMsg.setForeground(new Color(255,255,0));
								
								hideLabel();
								imgGermanFlag.setVisible(true);
					break;
					
				case "Azerbaijani": txtLangType.setText(buttonText);
									txtHelloMsg.setText("salam");
									txtLangType.setBackground(new Color(0,0,255));
									txtHelloMsg.setBackground(new Color(255,0,0));
									
									txtLangType.setForeground(new Color(0,255,0));
									txtHelloMsg.setForeground(new Color(0,255,0));							
									
									hideLabel();
									imgAzerFlag.setVisible(true);
					break;
					
				case "Swahili": txtLangType.setText(buttonText);
								txtHelloMsg.setText("hujambo");
								txtLangType.setBackground(new Color(255,255,0));
								txtHelloMsg.setBackground(new Color(255,0,0));
								
								txtLangType.setForeground(new Color(0,0,0));
								txtHelloMsg.setForeground(new Color(0,0,0));							
							
								hideLabel();
								imgSwahiliFlag.setVisible(true);
					break;
					
				case "Clear":	txtLangType.setText("");
								txtHelloMsg.setText("");
								txtLangType.setBackground(new Color(240,240,240));
								txtHelloMsg.setBackground(new Color(240,240,240));
								hideLabel();
			
			
			}
			
			}
		}
	};
	private JPanel panel;
}
