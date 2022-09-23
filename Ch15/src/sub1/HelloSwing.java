package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 내용 : 2022/09/22
 * 이름 : 김보성
 * 내용 : 자바 Swing 실습하기
 */
public class HelloSwing {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hello Swing");
		frame.setPreferredSize(new Dimension(300,200));
		Container pane = frame.getContentPane();
		
		JLabel label = new JLabel("Hello java Swing!");
		pane.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}
