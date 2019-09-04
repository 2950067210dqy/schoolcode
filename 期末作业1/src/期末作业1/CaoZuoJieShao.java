package 期末作业1;

import javax.swing. *;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class CaoZuoJieShao extends Window implements ActionListener{
	ImageIcon caozuojieshaoimg1,caozuojieshaoimg2,caozuojieshaoimg3,caozuojieshaoimg4;
	JLabel A1,A2,A3,A4;
	public CaoZuoJieShao() {
		
	}
	public CaoZuoJieShao(String s,int x,int y,int h,int w) {
		init(s);
		this.setLayout(new FlowLayout());
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		CaoZuoJieShao caozuojieshao = new CaoZuoJieShao("操作介绍",500,200,800,930);
	}
	public void init(String s){
		setTitle(s);
		caozuojieshaoimg1 = new ImageIcon("src/期末作业1/操作介绍1.jpg");
		caozuojieshaoimg2 = new ImageIcon("src/期末作业1/操作介绍2.jpg");
		caozuojieshaoimg3 = new ImageIcon("src/期末作业1/操作介绍3.jpg");
		caozuojieshaoimg4 = new ImageIcon("src/期末作业1/操作介绍4.jpg");
		A1 = new JLabel("简介图文详解:",caozuojieshaoimg1,SwingConstants.LEFT);//创建具有指定文本、图像和水平对齐方式的 JLabel 实例。
		A2 = new JLabel("填写信息图文详解:",caozuojieshaoimg2,SwingConstants.LEFT);
		A3 = new JLabel("查询图文详解:",caozuojieshaoimg3,SwingConstants.LEFT);
		A4 = new JLabel("关于我们图文详解:",caozuojieshaoimg4,SwingConstants.LEFT);
		A1.setHorizontalTextPosition(SwingConstants.LEFT);//设置标签的文本相对其图像的水平位置。
		A2.setHorizontalTextPosition(SwingConstants.LEFT);
		A3.setHorizontalTextPosition(SwingConstants.LEFT);
		A4.setHorizontalTextPosition(SwingConstants.LEFT);
		this.add(A1);
		this.add(A2);
		this.add(A3);
		this.add(A4);
	}
	
}
