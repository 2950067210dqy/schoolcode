package 期末作业1;

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
	String s = "经过计算您的总分是：       ";
	int g;
	g=Integer.parseInt(txt1.getText())+Integer.parseInt(txt2.getText())+Integer.parseInt(txt3.getText())+Integer.parseInt(txt4.getText());
	s=s+g+"分";
	if(g>=527)
			s=s+"\n\n        您的分数已经达到一本批次院校投档线，继续加油！";
		else if(g>=447&&g<527)
			s=s+"\n\n        您的分数已经达到二本批次院校投档线，继续加油！";
			else if(g>=159&&g<447)
				s=s+"\n\n       您的分数已经达到专科批次院校投档线，继续加油！";
				else
					s=s+"\n\n      您的分数未达到所有批次院校投档线，继续加油！";
	textarea.setFont(new Font("楷体", Font.BOLD, 15));
	textarea.setText(s);
	
}
}
