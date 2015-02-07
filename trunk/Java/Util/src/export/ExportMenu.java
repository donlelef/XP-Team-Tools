package export;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * An extension of {@link JMenu} which let the user perform every
 * required operation to export a {@link List} of elements of type 
 * T towards any destination. 
 * @author lele
 *
 * @param <T>: type of the single object to be exported
 */
public class ExportMenu<T> extends JMenu {

	private static final long serialVersionUID = 1L;
	
	private List<T> list;
	private IFormatter<T> formatter;
	
	/**
	 * 
	 * @param list: the list to be exported.
	 * @param formatter: the {@link IFormatter} to work on the single element of the list.
	 */
	public ExportMenu(List<T> list, IFormatter<T> formatter) {
		super("Export");
		this.list = list;
		this.formatter = formatter;
		this.buildMenu();
	}

	private void buildMenu() {
		JMenuItem file = new JMenuItem("File...");
		file.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showSaveDialog(null);
				File file = chooser.getSelectedFile();
				try {
					Exporter logger = new FileLogger<T>(formatter, list, file);
					logger.export();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(file);
		
		JMenuItem other = new JMenuItem("Other...");
			//TODO: implementation towards other destinations is required
		this.add(other);
		
	}
	
	

}
