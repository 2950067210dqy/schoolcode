package ��ĩ��ҵ1;
import javax.swing. *;
import java.awt.*;
import java.awt.event.*;

//import ��ĩ��ҵ.Window;

public class TelePhone extends Window implements ActionListener{
	JTextArea area;
public TelePhone() {
			
		}
		public TelePhone(String s,int x,int y,int h,int w) {
			init(s);
			this.setLayout(new FlowLayout());
			setLocation(x,y);
			setSize(w,h);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}
	
	public void actionPerformed(ActionEvent e) {
		TelePhone telephone = new TelePhone("��ϵ�绰",600,400,500,530);
		
	}
	public void init(String s) {
	setTitle(s);
	area = new JTextArea(20,20);
	add(area);
	area.setFont(new Font("����",Font.BOLD, 20));
	area.setText("��ϵ�绰��15106924385\n����: JJU123456789");
	}

}