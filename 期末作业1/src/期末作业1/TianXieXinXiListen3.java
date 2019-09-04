package ÆÚÄ©×÷Òµ1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TianXieXinXiListen3 implements ActionListener{
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
		String s = "";
		txt1.setText(s);
		txt2.setText(s);
		txt3.setText(s);
		txt4.setText(s);
		txt5.setText(s);
		area.setText(s);
	}

}
