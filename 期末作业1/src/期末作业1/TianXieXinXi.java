package ��ĩ��ҵ1;

import javax.swing. *;
import java.awt.*;
import java.awt.event.*;


public class TianXieXinXi extends Window implements ActionListener{
	JTextField text1,text3,text4,text5;
	static JTextField text2 =new JTextField(5);
	JButton button,button2;
	JCheckBox checkbox1,checkbox2,checkbox3,checkbox4;
	JRadioButton radio1,radio2,radio3;
	ButtonGroup group;
	JComboBox combox1;
	JTextArea area;
	JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7;
	TIanXieXinXiListen listen1;
	TianXieXinXiListen3 listen3;
	ChaXunLuQuXueXiao chaxunluquxuexiao;
	ChaXunLuQuXueXiaoListen listen = new ChaXunLuQuXueXiaoListen();
	public TianXieXinXi() {
		
	}
	public TianXieXinXi(String s,int x,int y,int h,int w) {
		init(s);
		setLayout(new FlowLayout());
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {	
		TianXieXinXi tianxiexinxi = new TianXieXinXi("��д��Ϣ",600,200,800,580);
	}
	public void init(String s) {
		chaxunluquxuexiao = new ChaXunLuQuXueXiao();
		listen1 = new TIanXieXinXiListen();
		listen3 = new TianXieXinXiListen3();
		setTitle(s);
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jp1.add(new JLabel("����:"));
		text1 = new JTextField(5);
		jp1.add(text1);
		jp1.add(new JLabel("�߿�����:"));
		jp1.add(text2);
		add(jp1);
		jp2 = new JPanel();
		jp2.add(new JLabel("ѧУ��"));
		text3 = new JTextField(13);
		jp2.add(text3);	
		add(jp2);
		jp3 = new JPanel();
		jp3.add(new JLabel("�Ա�"));
		group = new ButtonGroup();
		radio1 = new JRadioButton("��");
		radio2 = new JRadioButton("Ů");
		radio3 = new JRadioButton("����");
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		jp3.add(radio1);
		jp3.add(radio2);
		jp3.add(radio3);
		add(jp3);
		jp6 = new JPanel();
		jp6.add(new JLabel("����  ��"));
		text4 = new JTextField(5);
		jp6.add(text4);
		add(jp6);
		jp4 = new JPanel();
		jp4.add(new JLabel("��סʡ��    ��"));
		combox1 = new JComboBox();
		combox1.addItem("������");
		combox1.addItem("�����");
		combox1.addItem("�Ϻ���");
		combox1.addItem("������");
		combox1.addItem("�ӱ�ʡ");
		combox1.addItem("ɽ��ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("������ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("�㽭ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("ɽ��ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("�㶫ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("�Ĵ�ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("����ʡ");
		combox1.addItem("�ຣʡ");
		combox1.addItem("̨��ʡ");
		combox1.addItem("���ɹ�������");
		combox1.addItem("����׳��������");
		combox1.addItem("����������");
		combox1.addItem("���Ļ���������");
		combox1.addItem("�½�ά���������");
		combox1.addItem("����ر�������");
		combox1.addItem("�����ر�������");
		jp4.add(combox1); 
		jp4.add(new JLabel("��ס��ϸ��ַ(ʡ�ݳ���) ��"));
		text5 = new JTextField(15);
		jp4.add(text5);
		add(jp4);
		jp5 = new JPanel();
		jp5.add(new JLabel("�����ѧλ��  ��"));
		checkbox1 = new JCheckBox("һ�߳���");
		checkbox2 = new JCheckBox("���߳���");
		checkbox3 = new JCheckBox("���߳���");
		checkbox4 = new JCheckBox("���߳���");
		jp5.add(checkbox1);
		jp5.add(checkbox2);
		jp5.add(checkbox3);
		jp5.add(checkbox4);
		add(jp5);
		
		jp6 = new JPanel();
		area = new JTextArea(22,50);
		listen1.setArea(area);
		jp6.add(area);
		add(jp6);
		jp7 = new JPanel();
		button = new JButton("�ύ");
		button2 = new JButton("����");
		
		listen1.setText1(text1);
		listen1.setText2(text2);
		listen1.setText3(text3);
		listen1.setText4(text4);
		listen1.setText5(text5);
		listen1.setJRadioButton1(radio1);
		listen1.setJRadioButton2(radio2);
		listen1.setJRadioButton3(radio3);
		listen1.setJComboBox(combox1);
		listen1.setJCheckBox(checkbox1, checkbox2, checkbox3, checkbox4);
		listen3.setText1(text1);
		listen3.setText2(text2);
		listen3.setText3(text3);
		listen3.setText4(text4);
		listen3.setText5(text5);
		listen3.setJRadioButton1(radio1);
		listen3.setJRadioButton2(radio2);
		listen3.setJRadioButton3(radio3);
		listen3.setJComboBox(combox1);
		listen3.setJCheckBox(checkbox1, checkbox2, checkbox3, checkbox4);
		listen3.setArea(area);
		button.addActionListener(listen1);
		jp7.add(button);
		button2.addActionListener(listen3);
		jp7.add(button2);
		add(jp7);
	}
	

}

