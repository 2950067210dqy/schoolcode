package ��ĩ��ҵ1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FenShuJiSuanQiListen implements ActionListener{
	JTextField txt1,txt2,txt3,txt4,txt5;
	JTextArea textarea;
public void setTextField(JTextField text1,JTextField text2,JTextField text3,JTextField text4,JTextArea area) {
		txt1=text1;
		txt2=text2;
		txt3=text3;
		txt4=text4;
		textarea=area;
	}
public FenShuJiSuanQiListen() {
	
}


public void actionPerformed(ActionEvent e) {
	String s = "�������������ܷ��ǣ�       ";
	int g;
	g=Integer.parseInt(txt1.getText())+Integer.parseInt(txt2.getText())+Integer.parseInt(txt3.getText())+Integer.parseInt(txt4.getText());
	s=s+g+"��";
	if(g>=527)
			s=s+"\n\n        ���ķ����Ѿ��ﵽһ������ԺУͶ���ߣ��������ͣ�";
		else if(g>=447&&g<527)
			s=s+"\n\n        ���ķ����Ѿ��ﵽ��������ԺУͶ���ߣ��������ͣ�";
			else if(g>=159&&g<447)
				s=s+"\n\n       ���ķ����Ѿ��ﵽר������ԺУͶ���ߣ��������ͣ�";
				else
					s=s+"\n\n      ���ķ���δ�ﵽ��������ԺУͶ���ߣ��������ͣ�";
	textarea.setFont(new Font("����", Font.BOLD, 15));
	textarea.setText(s);
	
}
}
