package a20_8_25_event2;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class eventTest extends Applet implements ActionListener, ItemListener {

	JTextField txt1,txt2;
	JButton btn1, btn2;
	JLabel lbl1, lbl2;
	
	public void init() {
		lbl1 = new JLabel("이름");
		lbl2 = new JLabel("전화번호");
		txt1 = new JTextField();
		txt2 = new JTextField();
		btn1 = new JButton("전송");
		btn2 = new JButton("취소");
		this.setLayout(null);			//현재 애플릿에 배치관리자가 없음 이라는 뜻
		lbl1.setBounds(10, 20, 50, 20);
		lbl2.setBounds(10, 50, 50, 20);
		
		txt1.setBounds(90, 20, 100, 20);
		txt2.setBounds(90, 50, 100, 20);
		
		btn1.setBounds(10, 70, 100, 20);
		this.add(lbl1);
		this.add(lbl2);
		this.add(txt1);
		this.add(txt2);
		this.add(btn1);
		this.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		
	}
	
	public void itemStateChanged(ItemEvent arg0) {

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println(txt1.getText());
			System.out.println(txt2.getText());
		}
		else if(e.getSource()==btn2) {
			txt1.setText("");
			txt2.setText("");
		}
	}

}
