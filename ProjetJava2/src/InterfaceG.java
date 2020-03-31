import org.eclipse.swt.widgets.Display;
import java.awt.event.ActionListener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class InterfaceG {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InterfaceG window = new InterfaceG();
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
		shell.setSize(467, 329);
		shell.setText("SWT Application");
		
		Label lblPseudo = new Label(shell, SWT.NONE);
		lblPseudo.setBounds(69, 70, 55, 15);
		lblPseudo.setText("Pseudo");
		
		Label lblNom = new Label(shell, SWT.NONE);
		lblNom.setBounds(69, 105, 55, 15);
		lblNom.setText("Nom");
		
		Label lblPrnom = new Label(shell, SWT.NONE);
		lblPrnom.setBounds(69, 138, 55, 15);
		lblPrnom.setText("Pr\u00E9nom");
		
		Label lblMotDePasse = new Label(shell, SWT.NONE);
		lblMotDePasse.setBounds(65, 175, 88, 15);
		lblMotDePasse.setText("Mot de passe");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(224, 67, 116, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(224, 102, 116, 21);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(224, 135, 116, 21);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(224, 169, 116, 21);
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(176, 67, 2, 64);
		
		Label label_8 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label_8.setBounds(176, 169, 2, 64);
		
		Label label_9 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label_9.setBounds(176, 26, 2, 64);
		
		Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label_1.setBounds(176, 123, 2, 64);
		
		Button btnValider = new Button(shell, SWT.NONE);
		btnValider.setBounds(248, 227, 75, 25);
		btnValider.setText("Valider");


	}
}
