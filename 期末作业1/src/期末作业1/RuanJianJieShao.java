package ��ĩ��ҵ1;
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
		RuanJianJieShao reuanjianjieshao = new RuanJianJieShao("�������",500,200,800,800);
		
	}
	public  void init(String s){
		setTitle(s);
		ruanjianjieshaoimg = new ImageIcon("ͼƬ/�������.jpg");
		ruanjianjianjie = new JLabel(ruanjianjieshaoimg);
	    txt = new JTextArea(70,70);
	    txt.setLineWrap(true);// �����ı����Ļ��в��ԡ�
	    txt.setFont(new Font("����", Font.BOLD, 22));  //���õ�ǰ���塣
	    txt.setText( "                                                                                     �߿�¼ȡѧУԤ����ѯϵͳ\n\n\n�ò�ƷΪ�û��ṩһ���������ģ�ȫ��Ĵ�ѧԤ����ѯƽ̨�������������棬������������ͨ��Web��Ϊ�����û�ҲΪȺ���û��ṩ��ǿ��Ĳ�ѯ���ܡ���ƽ̨�ǻ���JAVAʵ�ֵģ��������˴�����ѧУ��Ϣ����985��211�ٵ���ͨ���������籱����ѧ���廪��ѧ���漰�漫�㣬��Щ����Ϊʹ�����ṩ�˱��ʽ�Ĳ�ѯ���ܡ����ò�Ʒ��ʱ�����ƣ�ֻ�ṩ��Ʋ�ѯ���Ŀ���δ���ţ�лл��⣡��" );
	    this.add(txt);
	    this.add(ruanjianjianjie);
	}
}
