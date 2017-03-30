<%@page import="model.champions.Priest"%>
<%@page import="model.champions.Warrior"%>
<%@page import="java.util.Random"%>
<%@page import="model.champions.Mage"%>
<%@page import="model.champions.Champion"%>
<%@page import="java.util.Map"%>
<%@page import="model.magics.Magic"%>
<%@page import="model.magics.Magic.MagicTypes"%>
<%@page import="java.util.HashMap"%>
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
 
 <script type="text/javascript" src="javascript/cal_down.js"></script>
 <div class="b_l">
        </div>
<div class="l_2">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
            <tbody><tr>
              <td valign="top">
                  <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <% Champion champ1 = new Mage((new Random().nextInt(70)+50),100,15); %>
                    <td><% User u =((User)session.getAttribute("user")); 
                    u.getChamp().targetEnemy(champ1);
                    out.print(u);%></td>
                    <td>Your current Target is <%= u.getChamp().getEnemyName() %></td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody>
                            <%  HashMap<MagicTypes,Magic> magics = u.getChamp().getMagics();
                            for(Map.Entry<MagicTypes,Magic> e : magics.entrySet()) {%>
                            	<td> <input type = "image" src="images/<%= e.getValue().getName() %>.png" value="<%=e.getValue().getName() %>" style="width:150px;" ></input></td>
                            <%}
                            %>
					</tbody></table></td>
                    </tr>
                  </tbody></table> 
  </div>
    <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <td>Player 2</td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody>
                           <%  HashMap<MagicTypes,Magic> magics1 = champ1.getMagics();
                            for(Map.Entry<MagicTypes,Magic> e : magics1.entrySet()) {%>
                            	<td> <input type = "image" src="images/<%= e.getValue().getName() %>.png" value="<%=e.getValue().getName() %>" style="width:150px;" ></input></td>
                            <%}
                            %>
                      </tbody></table></td>
                    </tr>
                  </tbody></table> 
  </div>
    <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <td>Player 3</td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody>
                            <% Champion champ2 = new Warrior((new Random().nextInt(70)+50),100,15); %>
                           <%  HashMap<MagicTypes,Magic> magics2 = champ2.getMagics();
                            for(Map.Entry<MagicTypes,Magic> e : magics2.entrySet()) {%>
                            	<td> <input type = "image" src="images/<%= e.getValue().getName() %>.png" value="<%=e.getValue().getName() %>" style="width:150px;" ></input></td>
                            <%}
                            %>
                      </tbody></table>
                      </td>
                    </tr>
                  </tbody></table> 
  </div>
  <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <td>Player 4</td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody>
                          <% Champion champ3 = new Priest((new Random().nextInt(70)+50),100,15); %>
                           <%  HashMap<MagicTypes,Magic> magics3 = champ3.getMagics();
                            for(Map.Entry<MagicTypes,Magic> e : magics3.entrySet()) {%>
                            	<td> <input type = "image" src="images/<%= e.getValue().getName() %>.png" value="<%=e.getValue().getName() %>" style="width:150px;" ></input></td>
                            <%}
                            %>
                      </tbody></table>
                      </td>
                    </tr>
                  </tbody></table> 
  </div>
   
                </td>
            </tr>
        </tbody></table>
</div>
