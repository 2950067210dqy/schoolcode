package 期末作业1;
import javax.swing. *;
import java.awt.*;
import java.awt.event.*;

//import 期末作业.Window;

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
		TelePhone telephone = new TelePhone("联系电话",600,400,500,530);
		
	}
	public void init(String s) {
	setTitle(s);
	area = new JTextArea(20,20);
	add(area);
	area.setFont(new Font("楷体",Font.BOLD, 20));
	area.setText("联系电话：15106924385\n传真: JJU123456789");
	}

}