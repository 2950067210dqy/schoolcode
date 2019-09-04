package 期末作业1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt. *;
import javax.swing. *;
import java.awt.event.*;
public class FenShuJiSuanQi extends Window implements ActionListener{
	JTextField text1,text2,text3,text4,text5;
	JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7;
	JButton button;
	JTextArea area = new JTextArea(20,40);
	FenShuJiSuanQiListen listen ;
	public FenShuJiSuanQi() {
		
	}
	public FenShuJiSuanQi(String s,int x,int y,int h,int w) {
		init(s);
		setLayout(new FlowLayout());
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		FenShuJiSuanQi fenshujisuanqi = new FenShuJiSuanQi("分数计算器",600,400,500,530);
		
	}
	public void init(String s) {
		listen = new FenShuJiSuanQiListen();
		jp1 = new JPanel();
		jp1.add(new JLabel("语文:"));
		text1 = new JTextField(5);
		jp1.add(text1);
		jp1.add(new JLabel("数学:"));
		text2 = new JTextField(5);
		jp1.add(text2);
		jp1.add(new JLabel("英语:"));
		text3 = new JTextField(5);
		jp1.add(text3);
		jp1.add(new JLabel("理综:"));
		text4 = new JTextField(5);
		jp1.add(text4);
		button = new JButton("计算:");
		listen.setTextField(text1, text2, text3, text4,area);
		button.addActionListener(listen);
		jp1.add(button);
		add(jp1);
		jp2 = new JPanel();
		jp2.add(area);
		
		add(jp2);
	}
	
}
