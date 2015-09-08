package GUI;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.table.TableModel;

public class JTableExample extends JFrame {

  String data[][] = {{"John", "Sutherland", "Student"},
                     {"George", "Davies", "Student"},
                     {"Melissa", "Anderson", "Associate"},
                     {"Stergios", "Maglaras", "Developer"},
  };

  String fields[] = {"Name", "Surname", "Status"};

  public static void main( String[] argv ) {
    JTableExample myExample = new JTableExample( "JTable Example" );
  }

  public JTableExample( String title ) {
    super( title );
    setSize( 150, 150 );
    addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent we ) {
        dispose();
        System.exit( 0 );
      }
    } );
    init();
    pack();
    setVisible( true );
  }

  private void init() {

	JPanel jp = new JPanel();
    final JTable jt = new JTable( data, fields );
    
    JScrollPane pane = new JScrollPane( jp );
    jp.add(jt);
    JButton jb = new JButton("Update");
    jp.add(jb);
    getContentPane().add( pane );
    
    ActionListener jbAL = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			data[0][0] = "HIHI!";
			jt.repaint();
			
		}
    	
    };
    
    jb.addActionListener(jbAL);
    
    
  }
}