import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuExample {
   public static void main(String[] args) {
    JFrame frame = new JFrame("Menu Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,300);

    JMenuBar menuBar = new JMenuBar();

    JMenu fileMenu = new JMenu("File");
    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    exitItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    });
    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.addSeparator(); 
    fileMenu.add(exitItem);
    
    JMenu helpMenu = new JMenu("Help");
    JMenuItem aboutItem = new JMenuItem("About");

    aboutItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "This is an example Swing application");
        }
    });
    helpMenu.add(aboutItem);
    menuBar.add(fileMenu);
    menuBar.add(helpMenu);
    frame.setJMenuBar(menuBar);
    frame.setVisible(true);
   }
}
