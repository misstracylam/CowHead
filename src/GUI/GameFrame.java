package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

public class GameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setMinimumSize(new Dimension(145, 100));
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(splitPane_1);
		
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 50));
		splitPane_1.setLeftComponent(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(10, 50));
		splitPane_1.setRightComponent(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		panel_1.add(table, BorderLayout.CENTER);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_2);
		
		JSplitPane splitPane_4 = new JSplitPane();
		splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_2.setRightComponent(splitPane_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setMinimumSize(new Dimension(6, 50));
		splitPane_4.setLeftComponent(textPane);
		
		textField = new JTextField();
		textField.setMinimumSize(new Dimension(6, 20));
		splitPane_4.setRightComponent(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		splitPane_2.setLeftComponent(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblYourCards = new JLabel("Your cards:");
		panel_2.add(lblYourCards);
		
		JButton btnNewButton = new JButton("104");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("104");
		panel_2.add(btnNewButton_1);
		
		JButton button = new JButton("104");
		panel_2.add(button);
		
		JButton button_1 = new JButton("104");
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("104");
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("104");
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("104");
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("104");
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("104");
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("104");
		panel_2.add(button_7);
		
		JButton btnNewButton_2 = new JButton("Confirm");
		panel_2.add(btnNewButton_2);
	}

}
