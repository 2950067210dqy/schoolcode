package 期末作业1;


import java.awt.*;
import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
public class Window extends JFrame {
	JMenuBar menubar;
	JMenu menu1,menu2,menu3,menu4,subMenu;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8;
	JLabel jianjie;
	JTextField text1;
	ImageIcon background;
	RuanJianJieShao ruanjianjieshao;
	CaoZuoJieShao caozuojieshao;
	TianXieXinXi tianxiexinxi;
	ChaXunLuQuXueXiao chaxunluquxuexiao;
	FenShuJiSuanQi fenshujisuanqi;
	Email email;
	TelePhone telephone;
	public Window(){}
	

	public Window(String s,int x,int y,int h,int w){
			setLayout(new GridLayout());
			init(s);
			setLocation(x,y);
			setSize(w,h);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
		}
	void init(String s){
			setTitle(s);
			TianXieXinXi.text2.setText("");
			background =new ImageIcon("src/期末作业1/beijing2.png");
			menubar = new JMenuBar();
			menu1 = new JMenu("关于我们");
			menu2 = new JMenu("简介");
			menu3 = new JMenu("查询");
			menu4 = new JMenu("填写信息");
			subMenu = new JMenu("联系我们");
			item1 = new JMenuItem("软件介绍");
			item2 = new JMenuItem("操作介绍");
			item3 = new JMenuItem("查询能录取的学校");
			item5 = new JMenuItem("联系电话");
			item6 = new JMenuItem("联系邮箱"); 
			item7 = new JMenuItem("分数计算器");
			item8 = new JMenuItem("填写个人信息");
			fenshujisuanqi = new FenShuJiSuanQi();
			ruanjianjieshao = new RuanJianJieShao();
			caozuojieshao = new CaoZuoJieShao();
			tianxiexinxi = new TianXieXinXi();
			chaxunluquxuexiao = new ChaXunLuQuXueXiao();
			email = new Email();
			telephone = new TelePhone();
			item1.addActionListener(ruanjianjieshao);
			item2.addActionListener(caozuojieshao);
			item8.addActionListener(tianxiexinxi);
			item3.addActionListener(chaxunluquxuexiao);
			item7.addActionListener(fenshujisuanqi);
			item6.addActionListener(email);
			item5.addActionListener(telephone);
			menu1.add(subMenu);
			menu2.add(item1);
			menu2.add(item2);
			menu3.add(item3);
			menu3.add(item7);
			menu4.add(item8);
			subMenu.add(item5);
			subMenu.add(item6);
			menubar.add(menu2);
			menubar.add(menu4);
			menubar.add(menu3);
			menubar.add(menu1);
			setJMenuBar(menubar);	
			jianjie = new JLabel(background);
			add(jianjie);
			chaxunluquxuexiao.setradioAndCheckbox2(TianXieXinXi.text2);
			
	}
}



