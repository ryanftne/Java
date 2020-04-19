import java.awt.event.ActionEvent;
import org.eclipse.swt.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import javax.swing.*;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import java.awt.*; 

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class InterfaceG implements ActionListener { 
	public InterfaceG() {
	}

	protected Shell shell; // Déclaration des variables
	private Text text_1;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InterfaceG window = new InterfaceG(); // 
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		shell.setSize(368, 335);
		shell.setText("SWT Application");
		
		Label lblNom = new Label(shell, SWT.NONE);
		lblNom.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNom.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNom.setBounds(69, 106, 55, 15);
		lblNom.setText("Nom");
		
		Label lblMotDePasse = new Label(shell, SWT.NONE);
		lblMotDePasse.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblMotDePasse.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblMotDePasse.setBounds(69, 133, 88, 15);
		lblMotDePasse.setText("Mot de passe");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(194, 103, 106, 21);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(194, 130, 106, 21);
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(176, 67, 2, 64);
		
		Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label_1.setBounds(176, 123, 2, 64);
		
		  Button button = new Button(shell, SWT.NONE);
		    button.setText("Valider");
		    button.setBounds(250, 200, 75, 25);

		    button.addSelectionListener(new SelectionListener() {
		      public void widgetSelected(SelectionEvent arg0) {
		    	  Interface2 test = new Interface2();
		  		
		    	 
		    	  try {
		  			Interface2 window = new Interface2(); // Constructeur par défaut
		  			window.open();
		  		} catch (Exception e) {
		  			e.printStackTrace();
		  		}
		    	  
		      }
		      public void widgetDefaultSelected(SelectionEvent arg0) {
		      }
		    });

		    shell.pack();
		    
		    Label lblBienvenue = new Label(shell, SWT.NONE);
		    lblBienvenue.setFont(SWTResourceManager.getFont("Segoe UI Black", 18, SWT.BOLD));
		    lblBienvenue.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		    lblBienvenue.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		    lblBienvenue.setBounds(105, 24, 158, 30);
		    lblBienvenue.setText("BIENVENUE !");
		    shell.open();


	}
	
		

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
