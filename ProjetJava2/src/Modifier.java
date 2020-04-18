import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class Modifier {

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
			Modifier window = new Modifier();
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
		shell.setText("SWT Application");
		
		Label lblChoisirLesInformations = new Label(shell, SWT.NONE);
		lblChoisirLesInformations.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblChoisirLesInformations.setBounds(78, 10, 333, 33);
		lblChoisirLesInformations.setText("Choisir la/les informations \u00E0 modifier");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(93, 102, 76, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(93, 175, 76, 21);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(189, 175, 76, 21);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(284, 175, 76, 21);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(189, 102, 76, 21);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(284, 102, 76, 21);
		
		Label lblNom = new Label(shell, SWT.NONE);
		lblNom.setBounds(114, 81, 55, 15);
		lblNom.setText("Nom");
		
		Label lblPrnom = new Label(shell, SWT.NONE);
		lblPrnom.setBounds(210, 81, 55, 15);
		lblPrnom.setText("Pr\u00E9nom");
		
		Label lblge = new Label(shell, SWT.NONE);
		lblge.setBounds(304, 81, 55, 15);
		lblge.setText("\u00C2ge");
		
		Label lblClasse = new Label(shell, SWT.NONE);
		lblClasse.setBounds(114, 155, 55, 15);
		lblClasse.setText("Classe");
		
		Label lblCantine = new Label(shell, SWT.NONE);
		lblCantine.setBounds(205, 155, 55, 15);
		lblCantine.setText("Cantine");
		
		Label lblInformations = new Label(shell, SWT.NONE);
		lblInformations.setBounds(292, 154, 68, 15);
		lblInformations.setText("Informations");
		
		Button btnModifier = new Button(shell, SWT.NONE);
		btnModifier.setBounds(189, 214, 75, 25);
		btnModifier.setText("Modifier");

	}
}
