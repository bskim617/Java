package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 130, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(22, 37, 94, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(12, 72, 70, 25);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(94, 72, 70, 25);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btn3.setBounds(176, 72, 70, 25);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...","확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn4.setBounds(258, 72, 70, 25);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextFiled 컴포넌트");
		lblNewLabel_2.setBounds(12, 107, 130, 25);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(26, 133, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(26, 164, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(26, 195, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf1Result = new JLabel("결과 :");
		lbltxtf1Result.setBounds(211, 136, 117, 15);
		contentPane.add(lbltxtf1Result);
		
		JLabel lbltxtf2Result = new JLabel("결과 :");
		lbltxtf2Result.setBounds(211, 167, 117, 15);
		contentPane.add(lbltxtf2Result);
		
		JLabel lbltxtf3Result = new JLabel("결과 :");
		lbltxtf3Result.setBounds(211, 198, 117, 15);
		contentPane.add(lbltxtf3Result);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lbltxtf1Result.setText("결과 : " + txt);
				
			}
		});
		btntxtf1.setBounds(149, 132, 60, 23);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf2.getText();
				lbltxtf2Result.setText("결과 : " + txt);
			}
		});
		btntxtf2.setBounds(149, 163, 60, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf3.getText();
				lbltxtf3Result.setText("결과 : " + txt);
			}
		});
		btntxtf3.setBounds(149, 195, 60, 23);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("ChackBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 230, 130, 31);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("부산");
		chk1.setBounds(12, 256, 60, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(76, 256, 60, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(133, 256, 60, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(194, 256, 60, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(258, 256, 60, 23);
		contentPane.add(chk5);
		
		JLabel chkResult = new JLabel("결과 : ");
		chkResult.setBounds(12, 292, 368, 15);
		contentPane.add(chkResult);
		
		JButton btnchk = new JButton("확인");
		btnchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				chkResult.setText("결과 : " + chks.toString());
				
			}
		});
		btnchk.setBounds(320, 256, 60, 23);
		contentPane.add(btnchk);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_4.setBounds(12, 317, 130, 25);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(22, 343, 50, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(94, 343, 50, 23);
		contentPane.add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lblGenderResult = new JLabel("결과 : ");
		lblGenderResult.setBounds(25, 383, 168, 15);
		contentPane.add(lblGenderResult);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> rdchks = new ArrayList<>();
				
				if(rdMale.isSelected()) {
					rdchks.add(rdMale.getText());
				}
				if(rdFemale.isSelected()) {
					rdchks.add(rdFemale.getText());
				}
				lblGenderResult.setText("결과 : " + rdchks.toString());
			}
		});
		btnGender.setBounds(157, 343, 60, 23);
		contentPane.add(btnGender);
		
	
		
	
		
	}
}
