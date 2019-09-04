package 期末作业1;
import javax.swing. *;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class RuanJianJieShao extends Window implements ActionListener {
	ImageIcon ruanjianjieshaoimg;
	JTextArea txt;
	JLabel ruanjianjianjie;
	public RuanJianJieShao() {
		
		
	}
	public RuanJianJieShao(String s,int x,int y,int h,int w) {
		init(s);
		this.setLayout(new FlowLayout());
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		RuanJianJieShao reuanjianjieshao = new RuanJianJieShao("软件介绍",500,200,800,800);
		
	}
	public  void init(String s){
		setTitle(s);
		ruanjianjieshaoimg = new ImageIcon("图片/软件介绍.jpg");
		ruanjianjianjie = new JLabel(ruanjianjieshaoimg);
	    txt = new JTextArea(70,70);
	    txt.setLineWrap(true);// 设置文本区的换行策略。
	    txt.setFont(new Font("宋体", Font.BOLD, 22));  //设置当前字体。
	    txt.setText( "                                                                                     高考录取学校预估查询系统\n\n\n该产品为用户提供一个可伸缩的，全面的大学预估查询平台，无论是在桌面，服务器，还是通过Web，为个人用户也为群体用户提供了强大的查询功能。该平台是基于JAVA实现的，它包含了大量的学校信息，从985到211再到普通二本（例如北京大学，清华大学）涉及面极广，这些对象为使用者提供了便捷式的查询功能。【该产品因时间限制，只提供理科查询，文科暂未开放，谢谢理解！】" );
	    this.add(txt);
	    this.add(ruanjianjianjie);
	}
}
