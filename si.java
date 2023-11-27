import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import java.awt.event.*;

public class si{
    public static void main(String[] args) {
        // Create a JFrame (window) with a title
        JFrame frame = new JFrame("Swing Example");

        // Create menu bar
        JMenuBar mb = new JMenuBar();

        // Create menu elements
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenu optionMenu = new JMenu("Options");

        // Create menu items
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");

        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");


        // Add menu items to menu elements
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke("Ctrl e"));

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        editMenu.add(optionMenu);

        JCheckBoxMenuItem readonly = new JCheckBoxMenuItem("Read-Only");
        readonly.setSelected(true);
        JRadioButtonMenuItem overtype = new JRadioButtonMenuItem("overtype");

        optionMenu.add(readonly);
        optionMenu.add(overtype);

        // Add the file menu to the menu bar
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(helpMenu);
        frame.setJMenuBar(mb);

        // Add action listner by not using lambda expression
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        // Creating a toolbar
        JToolBar toolBar = new JToolBar("My Toolbar");
        // Create and add tools in the toolbar for example buttons. You can also add some separators
        // Tool bar is a model box where interaction can be done without interacting with the box

        
        // Create a JButton
        JButton button = new JButton("Click Me");
        button.setToolTipText("Hello");

        // Add an ActionListener to the button using lambda expression
        button.addActionListener(e -> {
            // Show a message dialog when the button is clicked
            JOptionPane.showMessageDialog(frame, "Button Clicked!","Hello", JOptionPane.WARNING_MESSAGE);
            // It is a modelless box which should be interated to interact with other component of the box
        });

        // Add the button to the content pane of the frame
        frame.getContentPane().add(button);

        // Set default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}

