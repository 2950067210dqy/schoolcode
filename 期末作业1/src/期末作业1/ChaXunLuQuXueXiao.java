package ��ĩ��ҵ1;
import javax.swing.*;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChaXunLuQuXueXiao extends Window implements ActionListener{
	 static JTextField Txt1 = new JTextField(5);
	 static JTextField Txt2 = new JTextField(5);
	 static JTextField Txt3 = new JTextField(10);
	 static JTextArea Area = new JTextArea(45,100);
	 JRadioButton radio4,radio5,radio6,radio7;
	JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7;
	JButton button;
	ButtonGroup group;
	JTextField txt1,txt2;
	ChaXunLuQuXueXiao chaxunluquxuexiao ;
	ChaXunLuQuXueXiaoListen listen = new ChaXunLuQuXueXiaoListen();
	
	
	
	public ChaXunLuQuXueXiao() {
		
	}
	public  ChaXunLuQuXueXiao(String s,int x,int y,int h,int w) {
		setLayout(new GridLayout());
		init(s);
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String s=txt2.getText();
		if(s.length()==0) {
		JOptionPane.showMessageDialog(this, "����д��Ϣ���޷���ѯ��Ŷ������ǰ����д��Ϣ����дŶ����", "����", JOptionPane.WARNING_MESSAGE);}
		else{chaxunluquxuexiao = new ChaXunLuQuXueXiao("��ѯ¼ȡѧУ",500,100,910,880);}
		
			
	
	}
	public void init(String s) {
		
		Area.setLineWrap(true);
		 Area.setWrapStyleWord(true);
		setTitle(s);
		jp1 = new JPanel();
		jp1.add(new JLabel("������"));
		jp1.add(Txt1);
		jp1.add(new JLabel("�߿�������"));
		jp1.add(Txt2);
		jp1.add(new JLabel("����ѧУ��"));
		jp1.add(Txt3);
		jp1.add(new JLabel("Ԥ��ѧУ��Σ�"));
		radio4 = new JRadioButton("һ��");
		radio5 = new JRadioButton("����");
		radio6 = new JRadioButton("ר��");
		radio7 = new JRadioButton("ȫ��");
		group = new ButtonGroup();
		group.add(radio4);
		group.add(radio5);
		group.add(radio6);
		group.add(radio7);
		listen.seTJRadioButton(radio4, radio5, radio6, radio7);
		jp1.add(radio4);
		jp1.add(radio5);
		jp1.add(radio6);
		jp1.add(radio7);
		button = new JButton("��ѯ(ֻ���������)");
		button.addActionListener(listen);
		Area.setFont(new Font("����", Font.BOLD, 15));
		Area.setText("\n\n       �˲�ѯ���ڵ��������߿�������ѧУ��������Ч��Ŷ������ǰ����д��Ϣ���ڽ��и��ģ�");
		JScrollPane jslp = new JScrollPane(Area);
		jslp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
		jslp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		jp1.add(button);
		jp1.add(jslp);
		add(jp1);
		
		
		
	}
	
	public void setradioAndCheckbox2(JTextField txt) {
		txt2=txt;
		
	}
}
