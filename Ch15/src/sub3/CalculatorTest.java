package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
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
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(26, 10, 236, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(26, 65, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(88, 65, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBounds(150, 65, 50, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(212, 65, 50, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(26, 125, 50, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(88, 125, 50, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBounds(150, 125, 50, 50);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.setBounds(212, 125, 50, 50);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setBounds(26, 185, 50, 50);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBounds(26, 245, 50, 50);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_8_1 = new JButton("2");
		btnNewButton_8_1.setBounds(88, 185, 50, 50);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_9_1 = new JButton("C");
		btnNewButton_9_1.setBounds(88, 245, 50, 50);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_8_2 = new JButton("3");
		btnNewButton_8_2.setBounds(150, 185, 50, 50);
		contentPane.add(btnNewButton_8_2);
		
		JButton btnNewButton_9_2 = new JButton("=");
		btnNewButton_9_2.setBounds(150, 245, 50, 50);
		contentPane.add(btnNewButton_9_2);
		
		JButton btnNewButton_8_3 = new JButton("-");
		btnNewButton_8_3.setBounds(212, 185, 50, 50);
		contentPane.add(btnNewButton_8_3);
		
		JButton btnNewButton_9_3 = new JButton("+");
		btnNewButton_9_3.setBounds(212, 245, 50, 50);
		contentPane.add(btnNewButton_9_3);
	}

}
