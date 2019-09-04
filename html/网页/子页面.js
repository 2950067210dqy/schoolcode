
 
function lunbokaishi(){
	lunbo(-470);
	lunbo1(-470);
	var a= setInterval(function() {lunbo(-470);}, 4000)
var b= setInterval(function() {lunbo1(-470);}, 4000)
				
				
			}
 

function lunbo(zhi){
	var a=document.getElementById("guanggaolunbo"); 
	if(parseInt(a.style.left)>-1560)
		{		var newleft=parseInt(a.style.left)+zhi;
				a.style.left=newleft+'px';
		 		
		
          }	
		
	else{
				a.style.left=-470+'px';
				
		}
	}
 
function lunbo1(zhi){
	var a=document.getElementById("guanggaolunbo1"); 
	if(parseInt(a.style.left)>-1560)
		{		var newleft=parseInt(a.style.left)+zhi;
				a.style.left=newleft+'px';
		 		
		
          }	
		
	else{
				a.style.left=-470+'px';
				
		}
	}
 






		function pinglunqu(){
			var z=document.getElementById("erro");
			var a=document.getElementById("pinglunqu");
			 if(!z){
				a.innerHTML='<div class="footer1" id="yourperson"><div class="footer1left" id="userimg"></div><div class="footer1name" id="username"></div><div class="footer1date" id="date"></div><div class="footer1text" id="read"></div><div class="footer1kehuduan" id="usershebei"></div><div class="footer1dianzan" id="userhudong"></div></div>';
				Tg();}
			else{
				alert('请先登录您的账号才能进行评论哦,登陆账号在右上角哦！');
			}
		}
		function huifuqu1(){
		var z=document.getElementById("erro");	
		var b=document.getElementById("huifuqudeweizhi");
			if(!z){
				b.innerHTML='<div class="footer2"><div class="footer2left" id="userimg1"></div><div class="footer2name" id="username1"> </div><div class="footer2date" id="date1"></div><div class="footer2textbefore" id="read1"></div><h6 style="position: absolute;top: 230px;left: 30px;">巨黑的白兔子回复：</h6><div class="footer2textafter" id="readafter1"></div><div class="footer2kehuduan" id="usershebei1"></div><div class="footer2dianzan" id="userhudong1"></div></div>';
				huifu3();}
			else{
				alert('请先登录您的账号才能进行评论哦,登陆账号在右上角哦！');
			}
		}
		function huifuqu2(){
		var z=document.getElementById("erro");	
		var b=document.getElementById("huifuqudeweizhi");
			if(!z){
				b.innerHTML='<div class="footer2"><div class="footer2left" id="userimg1"></div><div class="footer2name" id="username1"> </div><div class="footer2date" id="date1"></div><div class="footer2textbefore" id="read1"></div><h6 style="position: absolute;top: 230px;left: 30px;">巨黑的白兔子回复：</h6><div class="footer2textafter" id="readafter1"></div><div class="footer2kehuduan" id="usershebei1"></div><div class="footer2dianzan" id="userhudong1"></div></div>';
				huifu2();}
			else{
				alert('请先登录您的账号才能进行评论哦,登陆账号在右上角哦！');
			}
		}
	function huifuqu3(){
		var z=document.getElementById("erro");
		var b=document.getElementById("huifuqudeweizhi");
		if(!z){
				b.innerHTML='<div class="footer2"><div class="footer2left" id="userimg1"></div><div class="footer2name" id="username1"> </div><div class="footer2date" id="date1"></div><div class="footer2textbefore" id="read1"></div><h6 style="position: absolute;top: 230px;left: 30px;">巨黑的白兔子回复：</h6><div class="footer2textafter" id="readafter1"></div><div class="footer2kehuduan" id="usershebei1"></div><div class="footer2dianzan" id="userhudong1"></div></div>';
				huifu();}
		else{
				alert('请先登录您的账号才能进行评论哦,登陆账号在右上角哦！');
			}
		}
	function huifuqu4(){
		var z=document.getElementById("erro");
		var b=document.getElementById("huifuqudeweizhi");
		if(!z){
				b.innerHTML='<div class="footer2"><div class="footer2left" id="userimg1"></div><div class="footer2name" id="username1"> </div><div class="footer2date" id="date1"></div><div class="footer2textbefore" id="read1"></div><h6 style="position: absolute;top: 230px;left: 30px;">巨黑的白兔子回复：</h6><div class="footer2textafter" id="readafter1"></div><div class="footer2kehuduan" id="usershebei1"></div><div class="footer2dianzan" id="userhudong1"></div></div>';
				huifu4();}
		else{
				alert('请先登录您的账号才能进行评论哦,登陆账号在右上角哦！');
			}
		}
		function Gh(){
			var a='<div id="body" style="background: url(../图片/beijing.png); background-repeat: no-repeat;background-size: cover;position: absolute;top: 0px;left: 0px;width: 1900px; height: 100%; z-index: -1"></div>';
			document.getElementById("body").innerHTML=a;
		}
		function Fh(){
			var a='<div id="body" style="background: url(../图片/beijing2.png); background-repeat: no-repeat;background-size: cover;position: absolute;top: 0px;left: 0px;width: 1900px; height: 100%; z-index: -1"></div>';
			document.getElementById("body").innerHTML=a;
		}
		function Hh(){
			var a='<div id="body" style="background: url(../图片/beijing3.png); background-repeat: no-repeat;background-size: cover;position: absolute;top: 0px;left: 0px;width: 1900px; height: 100%; z-index: -1"></div>';
			document.getElementById("body").innerHTML=a;
		}
		function Ih(){
			var a='<div id="body" style="background: url(../图片/beijing4.png); background-repeat: no-repeat;background-size: cover;position: absolute;top: 0px;left: 0px;width: 1900px; height: 100%; z-index: -1"></div>';
			document.getElementById("body").innerHTML=a;
		}
		function Fx(){
			var c=document.getElementById('img');
			var a='<div id="body" style="background: black; background-repeat: no-repeat;background-size: cover;position: absolute;top: 0px;left: 0px;width: 1900px; height: 100%; z-index: -1"></div>';
			var b='<div id="body" style="background: white; background-repeat: no-repeat;background-size: cover;position: absolute;top: 0px;left: 0px;width: 1900px; height: 100%; z-index: -1"></div>';
			if (c.src.match("deng1"))
				{
					c.src="../图片/deng2.png";
					document.getElementById("body").innerHTML=b;
				}
			else
				{
					c.src="../图片/deng1.png";
					document.getElementById("body").innerHTML=a;
				}
		}
		function Tg(){
			var myDate = new Date();
		 var a=document.getElementById("footerinput").value;
			var z=document.getElementById("erro");
			
                if(!z)
				{
					 if(a)
					{
					alert('评论成功，请赶快去评论区查看吧！（经验值+5）');
					var b=document.getElementById("read");
					var c=document.getElementById("userimg");
					var d=document.getElementById("username");
					var e=document.getElementById("date");
					var f=document.getElementById("usershebei");
					var g=document.getElementById("userhudong");
					var i=document.getElementById("jingtai");
					b.innerHTML='<blockquote><p  style="font-size: 20px;">'+a+'</p></blockqulote>';
					c.innerHTML='<img src="../图片/pic_bulboff.png" width="100%" height="100%" style="border-radius:75px;"/>';
					d.innerHTML='<span style="color: #0C81B8; margin-left: 20px; font-size: 18px;">巨黑的白兔子</span><span style="color: black; margin-left: 15px; font-size: 18px;border: 2px solid #ADADAD;border-radius: 8px;"><strong>Lv.5</strong></span>';
					e.innerHTML='<span style="color: black;margin-left: 80px;font-size: 13px; font-style: oblique;">'+myDate.toLocaleString( )+'</span>';
					f.innerHTML='<span  style="color: black;margin-left: 80px;font-size: 14px; font-style: oblique;">来自腾讯电脑客户端</span>';
					g.innerHTML='<span><input type="button" value="💗赞" onClick="dianZan1()">[<span style="color: red" id="zan1">0</span><span style="color: red" id="quanju2">			</span>]<input type="button" value="👎踩" onClick="cai1()">[<span style="color: red" id="cai1">0</span><span style="color: red" id="quanju3">	</span>]<span 		style="color: #0C81B8; " class="hui"><input type="button" value="✎回复" class="huifuqu4" onClick="huifuqu4()"/></span></span>';
					i.innerHTML=parseInt(i.innerHTML)+1;
					}
					else{
						alert('您不能发表空的评论哦！');
					}
					
       			}else{
                alert('请先登录您的账号才能进行评论哦,登陆账号在右上角哦！');
               }
			
		}
		function dianZan(){
			var z=document.getElementById("erro");
			if(!z){
				
			var a=document.getElementById("zan");
			var b=document.getElementById("quanju");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}
			}
			else{
				alert('请先登录才能点赞哦');
			}
		}
		function dianZan1(){
			var z=document.getElementById("erro");
			if(!z){
			var a=document.getElementById("zan1");
			var b=document.getElementById("quanju2");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}
				}
			else{
				alert('请先登录才能点赞哦');
			}
		}
		function dianZan2(){
			var z=document.getElementById("erro");
			if(!z){
				
			var a=document.getElementById("zan2");
			var b=document.getElementById("quanju4");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}
			}
			else{
				alert('请先登录才能点赞哦');
			}
		}
		function dianZan3(){
			var z=document.getElementById("erro");
			if(!z){
				
			var a=document.getElementById("zan3");
			var b=document.getElementById("quanju6");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}
				}
			else{
				alert('请先登录才能点赞哦');
			}
		}
		function cai(){
			var z=document.getElementById("erro");
			if(!z){
				
			var a=document.getElementById("cai");
			var b=document.getElementById("quanju1");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}
			}
			else{
				alert('请先登录才能踩哦');
			}
		}
		function cai1(){
			var z=document.getElementById("erro");
			if(!z){
				
			var a=document.getElementById("cai1");
			var b=document.getElementById("quanju3");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}}
				else{
				alert('请先登录才能踩哦');
			}
		}
		function cai2(){
			var z=document.getElementById("erro");
			if(!z){
				
			var a=document.getElementById("cai2");
			var b=document.getElementById("quanju5");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}}
			else{
				alert('请先登录才能踩哦');
			}
		}
		function cai3(){
			var z=document.getElementById("erro");
			if(!z){
				
			var a=document.getElementById("cai3");
			var b=document.getElementById("quanju7");
			if(b.innerHTML==='*')
			{a.innerHTML=parseInt(a.innerHTML)-1;
					b.innerHTML='';}
			else{
				a.innerHTML=parseInt(a.innerHTML)+1;
				b.innerHTML='*';
			}
				}
			else{
				alert('请先登录才能踩哦');
			}
		}
		function huifu(){
			
			var a=document.getElementById("huifukuangyincang");
			var b=document.getElementById("huifuzhiqian");
			var c=document.getElementById("thirdperson");
			b.innerHTML=c.innerHTML;
			a.innerHTML='<div class="huifukuang">'+b.innerHTML+'<div style="position:absolute;top:400px;"><span style="margin-left: 400px;font-size: 20px;">回复他/她:</span><textarea id="footerinput2" placeholder="请输入你的想法和理解.....                                                                                                                 .                                                         发表言论可以助您升级更快哦o(´^｀)o                                 .       请注意不良言论可能会造成不良后果哦o(╥﹏╥)o                                                                            .                                                发表情可以更加亲切呢ψ(*｀ー´)ψ"></textarea><br/><span class="importantword"></span><input type="image" src="../图片/主页/anniu.png" class="footerinput2" onClick="huifuing()"></div>'+'</div>';
			
		}
		function huifu2(){
		
			var a=document.getElementById("huifukuangyincang");
			var b=document.getElementById("huifuzhiqian");
			var c=document.getElementById("secondperson");
			b.innerHTML=c.innerHTML;
			a.innerHTML='<div class="huifukuang">'+b.innerHTML+'<div style="position:absolute;top:400px;"><span style="margin-left: 400px;font-size: 20px;">回复他/她:</span><textarea id="footerinput2" placeholder="请输入你的想法和理解.....                                                                                                                 .                                                         发表言论可以助您升级更快哦o(´^｀)o                                 .       请注意不良言论可能会造成不良后果哦o(╥﹏╥)o                                                                            .                                                发表情可以更加亲切呢ψ(*｀ー´)ψ"></textarea><br/><span class="importantword"></span><input type="image" src="../图片/主页/anniu.png" class="footerinput2" onClick="huifuing2()"></div>'+'</div>';
			
		}
		function huifu3(){
			
			var a=document.getElementById("huifukuangyincang");
			var b=document.getElementById("huifuzhiqian");
			var c=document.getElementById("firstperson");
			b.innerHTML=c.innerHTML;
			a.innerHTML='<div class="huifukuang">'+b.innerHTML+'<div style="position:absolute;top:400px;"><span style="margin-left: 400px;font-size: 20px;">回复他/她:</span><textarea id="footerinput2" placeholder="请输入你的想法和理解.....                                                                                                                 .                                                         发表言论可以助您升级更快哦o(´^｀)o                                 .       请注意不良言论可能会造成不良后果哦o(╥﹏╥)o                                                                            .                                                发表情可以更加亲切呢ψ(*｀ー´)ψ"></textarea><br/><span class="importantword"></span><input type="image" src="../图片/主页/anniu.png" class="footerinput2" onClick="huifuing3()"></div>'+'</div>';
			
		}
		function huifu4(){
			
			var a=document.getElementById("huifukuangyincang");
			var b=document.getElementById("huifuzhiqian");
			var c=document.getElementById("yourperson");
			b.innerHTML=c.innerHTML;
			a.innerHTML='<div class="huifukuang">'+b.innerHTML+'<div style="position:absolute;top:400px;"><span style="margin-left: 400px;font-size: 20px;">回复他/她:</span><textarea id="footerinput2" placeholder="请输入你的想法和理解.....                                                                                                                 .                                                         发表言论可以助您升级更快哦o(´^｀)o                                 .       请注意不良言论可能会造成不良后果哦o(╥﹏╥)o                                                                            .                                                发表情可以更加亲切呢ψ(*｀ー´)ψ"></textarea><br/><span class="importantword"></span><input type="image" src="../图片/主页/anniu.png" class="footerinput2" onClick="huifuing4()"></div>'+'</div>';
				
			
		}
		function huifuing(){
			
			var myDate = new Date();
		 var a=document.getElementById("footerinput2").value;
                if(a){
					alert('评论成功，请赶快去评论区查看吧！（经验值+5）');
					var z=document.getElementById("readafter1");
					var b=document.getElementById("read1");
					var c=document.getElementById("userimg1");
					var d=document.getElementById("username1");
					var e=document.getElementById("date1");
					var f=document.getElementById("usershebei1");
					var g=document.getElementById("userhudong1");
					var i=document.getElementById("jingtai");
					b.innerHTML=document.getElementById("userthirdtext").innerHTML;
					z.innerHTML='<blockquote><p  style="font-size: 16px;">'+a+'</p></blockqulote>';
					c.innerHTML=document.getElementById("userthirdimg").innerHTML;
					d.innerHTML=document.getElementById("userthirdname").innerHTML;
					e.innerHTML='<span style="color: black;margin-left: 80px;font-size: 13px; font-style: oblique;">'+myDate.toLocaleString( )+'</span>';
					f.innerHTML=document.getElementById("userthirdkehuduan").innerHTML;
					g.innerHTML=document.getElementById("userthirddianzan").innerHTML;
					i.innerHTML=parseInt(i.innerHTML)+1;
					
              }else{
                 alert('您不能发表空的评论哦');
               }
			document.getElementById("huifukuangyincang").innerHTML='<div class="footer1" id="huifuzhiqian" style="position:absolute;top:-1100px;left:0px;display: none;"></div>'	}
		function huifuing2(){
			
				var myDate = new Date();
		 		var a=document.getElementById("footerinput2").value;
                if(a){
					alert('评论成功，请赶快去评论区查看吧！（经验值+5）');
					var z=document.getElementById("readafter1");
					var b=document.getElementById("read1");
					var c=document.getElementById("userimg1");
					var d=document.getElementById("username1");
					var e=document.getElementById("date1");
					var f=document.getElementById("usershebei1");
					var g=document.getElementById("userhudong1");
					var i=document.getElementById("jingtai");
					b.innerHTML=document.getElementById("usersecondtext").innerHTML;
					z.innerHTML='<blockquote><p  style="font-size: 16px;">'+a+'</p></blockqulote>';
					c.innerHTML=document.getElementById("usersecondimg").innerHTML;
					d.innerHTML=document.getElementById("usersecondname").innerHTML;
					e.innerHTML='<span style="color: black;margin-left: 80px;font-size: 13px; font-style: oblique;">'+myDate.toLocaleString( )+'</span>';
					f.innerHTML=document.getElementById("usersecondkehuduan").innerHTML;
					g.innerHTML=document.getElementById("userseconddianzan").innerHTML;
					i.innerHTML=parseInt(i.innerHTML)+1;
              }else{
                 alert('您不能发表空的评论哦');
               }
			document.getElementById("huifukuangyincang").innerHTML='<div class="footer1" id="huifuzhiqian" style="position:absolute;top:-1100px;left:0px;display: none;"></div>';		}
		function huifuing3(){
				var myDate = new Date();
		 		var a=document.getElementById("footerinput2").value;
                if(a){
					alert('评论成功，请赶快去评论区查看吧！（经验值+5）');
					var z=document.getElementById("readafter1");
					var b=document.getElementById("read1");
					var c=document.getElementById("userimg1");
					var d=document.getElementById("username1");
					var e=document.getElementById("date1");
					var f=document.getElementById("usershebei1");
					var g=document.getElementById("userhudong1");
					var i=document.getElementById("jingtai");
					b.innerHTML=document.getElementById("userfirsttext").innerHTML;
					z.innerHTML='<blockquote><p  style="font-size: 16px;">'+a+'</p></blockqulote>';
					c.innerHTML=document.getElementById("userfirstimg").innerHTML;
					d.innerHTML=document.getElementById("userfirstname").innerHTML;
					e.innerHTML='<span style="color: black;margin-left: 80px;font-size: 13px; font-style: oblique;">'+myDate.toLocaleString( )+'</span>';
					f.innerHTML=document.getElementById("userfirstkehuduan").innerHTML;
					g.innerHTML=document.getElementById("userfirstdianzan").innerHTML;
					i.innerHTML=parseInt(i.innerHTML)+1;
              }else{
                 alert('您不能发表空的评论哦');
               }
			document.getElementById("huifukuangyincang").innerHTML='<div class="footer1" id="huifuzhiqian" style="position:absolute;top:-1100px;left:0px;display: none;"></div>';		}
		function huifuing4(){
				var myDate = new Date();
		 		var a=document.getElementById("footerinput2").value;
                if(a){
					var z=document.getElementById("readafter1");
					var b=document.getElementById("read1");
					var c=document.getElementById("userimg1");
					var d=document.getElementById("username1");
					var e=document.getElementById("date1");
					var f=document.getElementById("usershebei1");
					var g=document.getElementById("userhudong1");
					var i=document.getElementById("jingtai");
					b.innerHTML=document.getElementById("read").innerHTML;
					z.innerHTML='<blockquote><p  style="font-size: 16px;">'+a+'</p></blockqulote>';
					c.innerHTML=document.getElementById("userimg").innerHTML;
					d.innerHTML=document.getElementById("username").innerHTML;
					e.innerHTML='<span style="color: black;margin-left: 80px;font-size: 13px; font-style: oblique;">'+myDate.toLocaleString( )+'</span>';
					f.innerHTML=document.getElementById("usershebei").innerHTML;
					g.innerHTML=document.getElementById("userhudong").innerHTML;
					i.innerHTML=parseInt(i.innerHTML)+1;
              }else{
                 alert('您不能发表空的评论哦');
               }
			document.getElementById("huifukuangyincang").innerHTML='<div class="footer1" id="huifuzhiqian" style="position:absolute;top:-1100px;left:0px;display: none;"></div>';		}
		function zhuCe(){
			var a=document.getElementById("name1").value;
			var b=document.getElementById("password1").value;
			var c=parseInt(document.getElementsByName("YES").value);
			if(a&&b){
			if(a==="2591215997")
			{
				
				if(b==="123456789as")
					{	if(c===1){
						
					
						document.getElementById("displayl").innerHTML='<span class="topnavspana"><input type="button" value="注销" style="position:relative;top: 30px;" onClick="zhuXiao()"></span><span style="color: yellow;font-size: 17px;border: 3px solid white;border-radius: 8px;position: absolute;left:1680px;top: 15px;">Lv.5</span><span class="topnavspana"><h6 id="turth">巨黑的白兔子，您好</h6></span><span class="topnavspana1"><img src="../图片/pic_bulboff.png" width="90px" height="90px" style="border-radius: 35px;"></span>';
						}
					 	else{
							alert('请阅读优哥论坛协议并选中才能登录哦！');
						}
					}
				else{
					alert('密码错误，请再输入一次哦！');
				}
			}
			else{
				alert('账号错误，请再输入一次吧！');
			}
			}
			else{
				alert('账号密码不能为空哦，我的小主人！');
			}
		}
		function zhuXiao(){
			alert('你确定要注销吗');
			document.getElementById("displayl").innerHTML='<span class="topnavspana"><h4>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;登陆</h4><div class="nonecard"><h2>登陆</h2><form method="post" action=""><table  cellpadding="10px"><tr><td><p><span class="w">*</span>&nbsp;账号</p></td><td><input type="text" name="name" placeholder="请输入您的账号" class="nop2input" id="name1"><br/></td></tr><tr><td><p><span class="w">*</span>&nbsp;密码</p></td><td><input type="password" name="password" placeholder="请输入您的密码" class="nop2input" id="password1"><br/></td></tr><tr><td><input type="reset" value="重置" class="nop2inputA"></td><td><input type="button" value="确认" class="nop2inputB" onClick="zhuCe()"></td></tr><tr><td><input type="radio" name="YES" class="nop2inputC"></td><td><span class="nop2inputC1"><a href="主页面.html" target="_blank" style="color: black;font-size: 10px;">我已阅读优哥论坛协议</a></span></td></tr></table></form></div></span><span class="topnavspana1"><a href="../../实训项目/0515.html"><h4>注册</h4></a></span>';
			
		}
	function xieyi(){
		var c=parseInt(document.getElementsByName("YES").value);
		c=1;
		document.getElementsByName("YES").value=c;
	}



