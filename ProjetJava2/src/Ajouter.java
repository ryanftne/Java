import org.eclipse.swt.widgets.Display;
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

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class Ajouter {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Ajouter window = new Ajouter();
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
		shell.setSize(450, 300);
		shell.setText("Fenêtre - Ajouter un étudiant");
		
		Label lblNom = new Label(shell, SWT.NONE);
		lblNom.setBounds(81, 52, 55, 15);
		lblNom.setText("Nom");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(216, 49, 76, 21);
		
		Label lblPrnom = new Label(shell, SWT.NONE);
		lblPrnom.setBounds(81, 85, 55, 15);
		lblPrnom.setText("Pr\u00E9nom");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(216, 82, 76, 21);
		
		Label lblge = new Label(shell, SWT.NONE);
		lblge.setBounds(81, 116, 55, 15);
		lblge.setText("\u00C2ge");
		
		Label lblClasse = new Label(shell, SWT.NONE);
		lblClasse.setBounds(81, 137, 55, 15);
		lblClasse.setText("Classe");
		
		Label lblCantine = new Label(shell, SWT.NONE);
		lblCantine.setBounds(81, 171, 55, 15);
		lblCantine.setText("Cantine");
		
		Label lblInformations = new Label(shell, SWT.NONE);
		lblInformations.setBounds(81, 210, 76, 15);
		lblInformations.setText("Informations");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(216, 110, 76, 21);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(216, 137, 76, 21);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(216, 168, 76, 21);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(216, 204, 76, 21);
		
		Button btnAjouter = new Button(shell, SWT.NONE);
		btnAjouter.setBounds(349, 226, 75, 25);
		btnAjouter.setText("Ajouter");
		btnAjouter.addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent arg0) {
                AddUser();
            }
            public void widgetDefaultSelected(SelectionEvent arg0) {
            }
          });
		
		
		Label lblAjouterUntudiant = new Label(shell, SWT.NONE);
		lblAjouterUntudiant.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblAjouterUntudiant.setBounds(151, 10, 202, 33);
		lblAjouterUntudiant.setText("Ajouter un \u00E9tudiant");

	}

void AddUser() {
		
		
	    String jdbcURL = "jdbc:mysql://localhost:3308/projetjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    String dbUsername = "root";
	    String dbPassword ="";
	    
	    
	    
	    try {
	    	Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
	    	
	    	String sql = "INSERT INTO etudiant (nom, prenom, age, classe, cantine, informations)"
	    			+" VALUES (?, ?, ?, ?, ?, ?)";
	    	
	    	PreparedStatement statement = connection.prepareStatement(sql);
	    	statement.setString(1, text.getText());
	    	statement.setString(2, text_1.getText());
	    	statement.setString(3, text_2.getText());
	    	statement.setString(4, text_3.getText());
	    	statement.setString(5, text_4.getText());
	    	statement.setString(6, text_5.getText());
	    	
	    	int rows = statement.executeUpdate();
	    	
	    	if (rows > 0) {
	    		System.out.println("A new user has been inserted");
	    	}
	    		
	    		connection.close();
	    	
	    }catch (SQLException ex) {
	    	ex.printStackTrace();
	    }
	}

}
