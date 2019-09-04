package 期末作业1;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
		
public class TIanXieXinXiListen implements ActionListener {
	JTextField txt1,txt2,txt3,txt4,txt5;
	JTextArea area;
	JComboBox textcombox1;
	JRadioButton textradio1,textradio2,textradio3;
	JCheckBox textcheckbox1,textcheckbox2,textcheckbox3,textcheckbox4;
	public void setText1(JTextField text) {
		txt1=text;  
	}
	public void setText2(JTextField text) {
		  txt2=text;
	}
	public void setText3(JTextField text) {
		  txt3=text;
	}
	public void setText4(JTextField text) {
		 txt4=text;
	}
	public void setText5(JTextField text) {
		 txt5=text;
	}
	public void setArea(JTextArea textarea) {
		  area=textarea;
	}
	public void setJRadioButton1(JRadioButton radio) {
		textradio1=radio;
	}
	public void setJRadioButton2(JRadioButton radio) {
		textradio2=radio;
	}
	public void setJRadioButton3(JRadioButton radio) {
		textradio3=radio;
	}
	public void setJComboBox(JComboBox combox) {
		textcombox1=combox;
	}
	public void setJCheckBox(JCheckBox checkbox1,JCheckBox checkbox2,JCheckBox checkbox3,JCheckBox checkbox4) {
		textcheckbox1=checkbox1;
		textcheckbox2=checkbox2;
		textcheckbox3=checkbox3;
		textcheckbox4=checkbox4;
	}
	public void actionPerformed(ActionEvent e) {
		String s;
		s="姓名   ："+txt1.getText()+".\n高考分数  ："+txt2.getText()+".\n学校 ："+txt3.getText()+".\n性别  ：";
		if(textradio1.isSelected())
			s=s+"男"+".\n民族   ：";
		if(textradio2.isSelected())
			s=s+"女"+".\n民族   ：";
		if(textradio3.isSelected())
			s=s+"我不想告诉您呢"+".\n民族   ：";
		s=s+txt4.getText()+"\n居住地   ：";
		s=s+textcombox1.getSelectedItem()+txt5.getText()+"\n理想大学位置：";
		if(textcheckbox1.isSelected()) 
			s=s+"一线城市 ，";
		if(textcheckbox2.isSelected()) 
			s=s+"二线城市， ";
		if(textcheckbox3.isSelected()) 
			s=s+"三线城市，";
		if(textcheckbox4.isSelected()) 
			s=s+"四线城市. ";
		area.setFont(new Font("楷体", Font.BOLD, 20));
		area.setText(s);
		ChaXunLuQuXueXiaoListen.txT1.setText(txt2.getText());
		ChaXunLuQuXueXiao.Txt1.setText(txt1.getText());
		ChaXunLuQuXueXiao.Txt2.setText(txt2.getText());
		ChaXunLuQuXueXiao.Txt3.setText(txt3.getText());
		
	}


	


	

	
	

}
