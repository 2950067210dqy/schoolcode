package ��ĩ��ҵ1;
import javax.swing. *;
import java.awt.*;
import java.awt.event.*;



public class Email extends Window implements ActionListener{
	JTextArea area;
public Email() {
		
	}
	public Email(String s,int x,int y,int h,int w) {
		init(s);
		this.setLayout(new FlowLayout());
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Email email = new Email("��ϵ����",600,400,500,530);
	}
	public void init(String s) {
		setTitle(s);
		area = new JTextArea(20,20);
		add(area);
		area.setFont(new Font("����",Font.BOLD, 20));
		area.setText("QQ���䣺  123456789@qq.com\nGmail����: JJU123456789@gmail.com\n�������� ��1235466@136.com");
	}
}