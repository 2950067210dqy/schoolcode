package ��ĩ��ҵ1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChaXunLuQuXueXiaoListen  implements ActionListener{
	JRadioButton textradio4,textradio5,textradio6,textradio7;
	static JTextField txT1 = new JTextField(5);;

	School school = new School();
	public ChaXunLuQuXueXiaoListen() {
		
		
	}
	public void seTJRadioButton(JRadioButton radio4,JRadioButton radio5,JRadioButton radio6,JRadioButton radio7) {
		textradio4=radio4;
		textradio5=radio5;
		textradio6=radio6;
		textradio7=radio7;
	}



	public void actionPerformed(ActionEvent e) {
		init();
	}
	public void init() {
		String s = "\n\n                ��ѡ��Ҫ��ѯѧУ��Ԥ���Σ�";
		int a = Integer.parseInt(txT1.getText());
		int i = 0;
		if(textradio4.isSelected())
		{	if(a<527) {
			s="\n\n              ���ķ������Ҵﲻ��һ�����η������أ������������͸���Ŷ��";
			}
			else {
				s= "��ѧ����"+"                                   Ͷ��������\n";
				if(a>=750)
					a=750;
				for(int a1=0; a1<school.scollLine.length;a1++){
						if(Integer.parseInt(school.scollLine[a1])==527)
							{i=a1;break;}
					
				}
				for(;Integer.parseInt(school.scollLine[i])<=a;i++)
			{s= s+school.name[i]+"                       "+school.scollLine[i]+"                  "+"\n";}
		}
				
		}
		
		if(textradio5.isSelected())
		{	if(a<447) {
			s="\n\n              ���ķ������Ҵﲻ���������η������أ������������͸���Ŷ��";
			}
			else {
				s= "��ѧ����"+"                                   Ͷ��������\n";
				if(a>=527)
					a=527;
				for(int a1=0;a1<school.scollLine.length;a1++){
					
					if(Integer.parseInt(school.scollLine[a1])==447)
						{i=a1;break;}
				
					}
				for(;Integer.parseInt(school.scollLine[i])<=a;i++)
			{s=s+school.name[i]+"                       "+school.scollLine[i]+"                  "+"\n";}
		}
		}
		if(textradio6.isSelected())
		{	if(a<159) {
			s="\n\n              ���ķ������Ҵﲻ��ר�����η������أ�����������Ŷ��";
			}
			else {
				s= "��ѧ����"+"                                   Ͷ��������\n";
				if(a>447)
					a=447;
				for(int a1=0;a1<school.scollLine.length;a1++){
					if(Integer.parseInt(school.scollLine[a1])==159)
							{i=a1;break;}
				}
				for(;Integer.parseInt(school.scollLine[i])<=a;i++)
			{s= s+school.name[i]+"                       "+school.scollLine[i]+"                  "+"\n";}
			}
		}
		if(textradio7.isSelected())
		{	if(a<159) {
			s="\n\n              ���ķ������Ҵﲻ���������η������أ���������ͣ�";
			}
		else {
			s= "��ѧ����"+"                                   Ͷ��������\n";
			for(;Integer.parseInt(school.scollLine[i])<a;i++)
				{
					s= s+school.name[i]+"                       "+school.scollLine[i]+"                  "+"\n";
					if(Integer.parseInt(school.scollLine[i])==689)
						break;
				}
		}
			}
		
		ChaXunLuQuXueXiao.Area.setFont(new Font("����", Font.BOLD, 15));
		ChaXunLuQuXueXiao.Area.setText(s);
		
	}

}

