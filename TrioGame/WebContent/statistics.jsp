<%@page import="java.util.Comparator"%>
<%@page import="model.user.sortComp"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="model.dao.UserDAO"%>
<%@page import="java.util.TreeMap"%>
<%@page import="model.user.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="ie=7" http-equiv="x-ua-compatible">
<meta name="author" content="Free Web Game">
<meta name="description" content="ArenaMasters">
<meta name="keywords" content="ArenaMasters">
<meta name="revisit-after" content="15 days">
<meta name="robots" content="index,follow">
<title>ArenaMasters/</title>
<link type="text/css" rel="stylesheet" href="css/un.css">
<script type="text/javascript" src="javascript/jquery-1.js"></script>

<style type="text/css"></style></head>

<body>

<embed src="diablo.mp3" autostart="true" loop="true" hidden="true">

<div id="mainbox">
   <div class="top1"></div>
   <div class="top2"></div>
   <div class="top3"></div>
   <div class="top4"></div>
   <div class="top5"></div>
   <div class="top6"></div>
   <div class="top7"></div>	
   <div class="top8"></div>
   <div class="top9"></div>
   <div class="top10"></div>
   <div class="top11"></div>
   <div class="menu">
     <table height="72" width="960" align="center" border="0" cellpadding="0" cellspacing="0">
       <tbody><tr align="center">
         <td class="f1" height="72" width="9">&nbsp;</td>
         <td class="f1" width="86">
         	<form action="login" method="post">
    			<a href="#" onclick="document.forms[0].submit();return false;">Home</a>
			</form>
		</td>
         <td class="f1" width="86">
         	<form action="play" method="post">
    			<a href="#" onclick="document.forms[1].submit();return false;">Play</a>
			</form>
		</td>
         <td class="f1" width="86">
         	<form action="profile.jsp" method="post">
    			<a href="#" onclick="document.forms[2].submit();return false;">Profile</a>
			</form>
		</td>
        <td class="f1" width="86">
         	<form action="statistics.jsp" method="post">
    			<a href="#" onclick="document.forms[3].submit();return false;">Statitics</a>
			</form>
		</td>
         <td class="f1" width="84"></td>
         <td class="f1" width="86"></td>
         <td class="f1" width="86"></td>
         <td class="f1" width="84"></td>
         <td class="f1" width="88"></td>
         <td valign="bottom" width="182"></td>
       </tr>
     </tbody></table>
   </div>

<% ArrayList<User> winFilter = new ArrayList<User>(); 
	HashMap<String,User> allUsers =UserDAO.getInstance().getAllUsers();
	for(User u2 : allUsers.values()) {
		winFilter.add(u2);
	}
	Collections.sort(winFilter,new sortComp());
%>
  <script type="text/javascript" src="javascript/cal_down.js"></script>
 <div class="b_l">
        <div class="l_1"><div class="a1">Statistics</div><div class="m1"></div></div>
<div class="l_2">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
            <tbody><tr>
              <td valign="top">
                  <% for (User u5 : winFilter) { %>
                  <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <td>Username <%= u5.getUsername() %></td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody><tr>
                            <td class="n_time">Wins <%= u5.getWins() %></td>
                            <td class="n_time">Losses <%= u5.getLosses() %></td>
                          </tr>
                          <tr>
                            <br />


                          </tr>
                      </tbody></table></td>
                    </tr>
                  </tbody></table> 
  </div>
  <% } %>
  
   
                </td>
            </tr>
        </tbody></table>
</div>
<!--<div class="banner"><a href="#"></a></div>-->
<div class="l_3"><div class="a1">How To Connect to ArenaMasters</div></div>
<div class="l_4"><div class="con">
Arena Masters is a free to play Web Browser game <br><br>
<span class="style1">To play simply register a new account if you dont have one and enjoy</span><br><br>
</div></div>
   </div>
   <div class="b_r">
        <div class="r_1"><div class="a1">Hello, <%User u =((User)session.getAttribute("user"));
        if(u!=null) { out.print(u.getName() + ", pick your champion to play"); %>
        </div>
        </div>
        <div class="menu">
     <table height="72" width="225" align="center" border="0" cellpadding="0" cellspacing="0">
       <tbody><tr align="center">
         <td class="f1" height="72" width="9">&nbsp;</td>
         <td class="f1" width="86">
         	<form action="mage" method="post">
    			<a href="#" onclick="document.forms[4].submit();return false;">Mage</a>
			</form>
		</td>
         <td class="f1" width="86">
         	<form action="priest" method="post">
    			<a href="#" onclick="document.forms[5].submit();return false;">Priest</a>
			</form>
		</td>
         <td class="f1" width="86">
         	<form action="rogue" method="post">
    			<a href="#" onclick="document.forms[6].submit();return false;">Rogue</a>
			</form>
		</td>
        <td class="f1" width="86">
         	<form action="warrior" method="post">
    			<a href="#" onclick="document.forms[7].submit();return false;">Warrior</a>
			</form>
		</td>
		 </tr>
     </tbody></table>
   </div>
         <% }  else { out.print(" you are not logged in");%> 
         </div>
         </div>
      
<div class="r_2">

     <table width="100%" border="0" cellpadding="0" cellspacing="0">
                                 <tbody><tr>
                        <td>  
<form name="login_form" id="login_form" method="post" action="login">
    <table style="margin-left: 15px;" width="90%" border="0" cellpadding="0" cellspacing="0">
      <tbody><tr>
        <td class="STYLE2" height="40" valign="middle" width="33%" align="center">Username: </td>
        <td width="67%"><input name="user" id="acc_name" class="inputbox" alt="acc_name" size="28" type="text"></td>
      </tr>
      <tr>
        <td class="STYLE2" height="40" valign="middle" align="center">Password:</td>
        <td><input name="pass" id="password" class="inputbox" size="28" alt="password" type="password"></td>
      </tr>
      <tr>
        <td height="40" align="center"><input name="action" value="dologin" type="hidden"><input name="Submit" class="button" value="" type="submit"></td>
      </tr>
    </tbody></table>
  </form></td>
                    </tr>
                   
             </tbody></table>
             </div>
        <form action="register" method="post">
      <input type="image" src ="images/reg.jpg" alt="Submit Form"> </input>
        </form>
             <% } %>
        
<div class="r_3"><div class="a1">Realm Status</div>
</div>
<div class="r_4">	
  <table height="159" width="88%" align="center" border="0" cellpadding="0" cellspacing="0">
            <tbody><tr>
              <td colspan="2" height="19">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2" height="26"><img src="images/up.png" height="31" width="160"></td>
            </tr>
            <tr>
              <td height="99" width="8%"></td>
              <td width="92%"><span class="style3">

             </span></td>
            </tr>
          </tbody></table>

</div>
<div class="r_5">
   <div class="a1">Follow</div>
   <table width="90%" align="center" border="0" cellpadding="0" cellspacing="0">
             <tbody><tr>
               <td height="55" width="18%"><img src="images/facebook.png" height="45" width="45"></td>
               <td width="32%"><a href="https://www.facebook.com/pages/Dispersion-WoW/265161320207823" target="_blank">Arena-Masters</a></td>
               <td width="18%"><img src="images/Twitter.png" height="45" width="45"></td>
               <td width="32%"><a href="#" target="_blank">Arena-Masters</a></td>
             </tr>
           </tbody></table>
</div>

</div>
   </div>
   <script type="text/javascript" src="javascript/message.js"></script>
   <div class="clear"></div>
  
</div>
  </form>	
                
                      
                               </div>
            </div>
   <div class="t_9"></div><div class="clear"></div>
   
</div>
  <div id="bottom">
 <div class="b1">  <table height="120" width="78%" align="center" border="0" cellpadding="0" cellspacing="0">
    <tbody><tr>
      <td height="100" valign="bottom" align="center">
        <span class="style5">Copyright ©2017 Arena-Masters. All Rights Reserved.<div style="display:none">
<script src="#" type="text/javascript"></script><a href="http://countt.51yes.com/index.aspx?id=473365677" target="_blank"><img src="images/count1.gif" alt="51YES网站统计系统" height="20" hspace="0" vspace="0" width="20" border="0"></a><iframe marginwidth="0" marginheight="0" hspace="0" vspace="0" src="#" frameborder="0" height="0" scrolling="no" width="0"></iframe>
</div></span></td>
    </tr>
  </tbody></table></div>
</div>

<div id="dp_swf_engine"><object style="position: absolute; top: -1000000px; left: -1000000px;" id="_dp_swf_engine" data="dealply_swf_engine.swf" type="application/x-shockwave-flash" height="1" width="1"><param value="always" name="allowscriptaccess"></object></div></body></html>