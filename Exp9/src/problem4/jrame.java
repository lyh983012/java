package problem4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.GridBagLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Component;

public class jrame extends JFrame {
	private JTextField txtHhhhhhh;

	/**
	 * Launch the application.
	 */
	JList list;
	JTextArea textArea ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jrame frame = new jrame();
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
	public jrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		textArea = new JTextArea();
		textArea.setBounds(222, 20, 191, 205);
		getContentPane().add(textArea);
		this.setSize(400,400);

		String[] s=new String[]{"日本","英国","法国","中国","美国","??","soviet, unit", "Austalia", " Uri" };
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setSize(153, 148);
		scrollPane.setLocation(47, 77);
		getContentPane().add(scrollPane);
		list = new JList(s);
		scrollPane.setViewportView(list);
		
		Button button = new Button("dwdwdw");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.getSelectedIndex();
				textArea.setText("hey you choose num. "+list.getSelectedIndex());
			}
		});
		button.setBounds(57, 234, 117, 29);
		getContentPane().add(button);
		
		txtHhhhhhh = new JTextField();
		txtHhhhhhh.setEditable(false);
		txtHhhhhhh.setEnabled(false);
		txtHhhhhhh.setText("hhhhhhh");
		txtHhhhhhh.setBounds(47, 15, 130, 26);
		getContentPane().add(txtHhhhhhh);
		txtHhhhhhh.setColumns(10);



	}
}
