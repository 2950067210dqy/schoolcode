package ��ĩ��ҵ1;

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
		CaoZuoJieShao caozuojieshao = new CaoZuoJieShao("��������",500,200,800,930);
	}
	public void init(String s){
		setTitle(s);
		caozuojieshaoimg1 = new ImageIcon("src/��ĩ��ҵ1/��������1.jpg");
		caozuojieshaoimg2 = new ImageIcon("src/��ĩ��ҵ1/��������2.jpg");
		caozuojieshaoimg3 = new ImageIcon("src/��ĩ��ҵ1/��������3.jpg");
		caozuojieshaoimg4 = new ImageIcon("src/��ĩ��ҵ1/��������4.jpg");
		A1 = new JLabel("���ͼ�����:",caozuojieshaoimg1,SwingConstants.LEFT);//��������ָ���ı���ͼ���ˮƽ���뷽ʽ�� JLabel ʵ����
		A2 = new JLabel("��д��Ϣͼ�����:",caozuojieshaoimg2,SwingConstants.LEFT);
		A3 = new JLabel("��ѯͼ�����:",caozuojieshaoimg3,SwingConstants.LEFT);
		A4 = new JLabel("��������ͼ�����:",caozuojieshaoimg4,SwingConstants.LEFT);
		A1.setHorizontalTextPosition(SwingConstants.LEFT);//���ñ�ǩ���ı������ͼ���ˮƽλ�á�
		A2.setHorizontalTextPosition(SwingConstants.LEFT);
		A3.setHorizontalTextPosition(SwingConstants.LEFT);
		A4.setHorizontalTextPosition(SwingConstants.LEFT);
		this.add(A1);
		this.add(A2);
		this.add(A3);
		this.add(A4);
	}
	
}
