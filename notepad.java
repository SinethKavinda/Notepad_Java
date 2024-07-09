import javax.swing.*;
import java.awt.*;

class NotepadApp extends JFrame {
    private JTextArea textArea;

	//Create Main Menu bar
    private JMenuBar mainMenuBar;

	//Options in Main Menu bar
    private JMenu fileMenu;
    private JMenu editMenu;
	private JMenu viewMenu;

	//Options in File menu 
    private JMenuItem newMenuItem;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem saveAsMenuItem;
	private JMenu sendtoMenu;
		private JMenuItem localdiskItem;
		private JMenuItem emailItem;

	//Options in Edit menu
	private JMenuItem undoMenuItem;
	private JMenuItem cutMenuItem;
	private JMenuItem copyMenuItem;
	private JMenuItem pasteMenuItem;
	private JMenuItem deleteMenuItem;

	//Options in View menu
	private JMenuItem zoomMenuItem;
	private JMenuItem statusbarMenuItem;


    NotepadApp() {
        setSize(600, 400);
        setTitle("Notepad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("", Font.PLAIN, 25));
        JScrollPane textPane = new JScrollPane(textArea);
        add("Center", textPane);

        mainMenuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        fileMenu.setFont(new Font("", Font.BOLD, 25));

        newMenuItem = new JMenuItem("New");
        newMenuItem.setFont(new Font("", Font.PLAIN, 18));

        openMenuItem = new JMenuItem("Open");
        openMenuItem.setFont(new Font("", Font.PLAIN, 18));

        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setFont(new Font("", Font.PLAIN, 18));

        saveAsMenuItem = new JMenuItem("Save as");
        saveAsMenuItem.setFont(new Font("", Font.PLAIN, 18));

		sendtoMenu = new JMenu("Send to");
        sendtoMenu.setFont(new Font("", Font.PLAIN, 18));

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);

		localdiskItem = new JMenuItem("Local Disk");
        localdiskItem.setFont(new Font("", Font.PLAIN, 18));

		emailItem = new JMenuItem("Email");
        emailItem.setFont(new Font("", Font.PLAIN, 18));

		sendtoMenu.add(localdiskItem);
		sendtoMenu.add(emailItem);
		
		fileMenu.add(sendtoMenu);

        mainMenuBar.add(fileMenu);

		editMenu = new JMenu("Edit");
        editMenu.setFont(new Font("", Font.BOLD, 25));

		undoMenuItem = new JMenuItem("Undo");
        undoMenuItem.setFont(new Font("", Font.PLAIN, 18));

        cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.setFont(new Font("", Font.PLAIN, 18));

        copyMenuItem = new JMenuItem("Copy");
        copyMenuItem.setFont(new Font("", Font.PLAIN, 18));

        pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.setFont(new Font("", Font.PLAIN, 18));

		deleteMenuItem = new JMenuItem("Paste");
        deleteMenuItem.setFont(new Font("", Font.PLAIN, 18));

		editMenu.add(undoMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
		editMenu.add(deleteMenuItem);

		mainMenuBar.add(editMenu);

		viewMenu = new JMenu("View");
        viewMenu.setFont(new Font("", Font.BOLD, 25));

		zoomMenuItem = new JMenuItem("Zoom");
        zoomMenuItem.setFont(new Font("", Font.PLAIN, 18));

        statusbarMenuItem = new JMenuItem("Status bar");
        statusbarMenuItem.setFont(new Font("", Font.PLAIN, 18));

		viewMenu.add(zoomMenuItem);
        viewMenu.add(statusbarMenuItem);

		mainMenuBar.add(viewMenu);

        setJMenuBar(mainMenuBar);
    }
}

class notepad {
    public static void main(String args[]) {
        new NotepadApp().setVisible(true);
    }
}
