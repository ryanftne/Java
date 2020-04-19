import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.forms.widgets.ColumnLayout;
import org.eclipse.ui.forms.widgets.ColumnLayoutData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.wb.swt.SWTResourceManager;

public class Interface2 {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Interface2 window = new Interface2();
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		{
			TableWrapLayout twl_shell = new TableWrapLayout();
			twl_shell.numColumns = 3;
			shell.setLayout(twl_shell);
		}
		
		Button btnAjouter = new Button(shell, SWT.NONE);
		btnAjouter.setText("Ajouter");
		 btnAjouter.setBounds(250, 200, 75, 25);

		 btnAjouter.addSelectionListener(new SelectionListener() {
		      public void widgetSelected(SelectionEvent arg0) {
		    	  Ajouter ajt = new Ajouter();
		  		
		    	 
		    	  try {
		  			Ajouter window = new Ajouter();
		  			window.open();
		  		} catch (Exception e) {
		  			e.printStackTrace();
		  		}
		    	  
		      }
		      public void widgetDefaultSelected(SelectionEvent arg0) {
		      }
		    });
		
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setText("Modifier");
		
		btnNewButton.addSelectionListener(new SelectionListener() {
		      public void widgetSelected(SelectionEvent arg0) {
		    	  Modifier mdf = new Modifier();
		  		
		    	 
		    	  try {
		  			Modifier window = new Modifier();
		  			window.open();
		  		} catch (Exception e) {
		  			e.printStackTrace();
		  		}
		    	  
		      }
		      public void widgetDefaultSelected(SelectionEvent arg0) {
		      }
		    });
		
		Button btnSupprimer = new Button(shell, SWT.NONE);
		btnSupprimer.setText("Supprimer");

	}
}
