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
                    <td><% User u =((User)session.getAttribute("user")); 
                    out.print(u);%></td>
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
                            	<td> <input type = "button" value="<%=e.getValue().getName() %>" ></input></td>
                            <%}
                            %>


                          
                      </tbody></table></td>
                    </tr>
                  </tbody></table> 
  </div>
    <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <td>NEW* ANNOUNCEMENT 2</td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody><tr>
                            <td class="n_time">Posted: March 29,2017</td>
                          </tr>
                          <tr>
                            <td class="n_con" align="left">NEW* ANNOUNCEMENT 2<br />

                          </tr>
                      </tbody></table></td>
                    </tr>
                  </tbody></table> 
  </div>
    <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <td>Database update items</td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody><tr>
                            <td class="n_time">Posted: March 29,2017</td>
                          </tr>
                          <tr>
                            <td class="n_con" align="left">We made some updates to Spells in the game.<br />

Thank you</td>
                          </tr>
                      </tbody></table>
                      </td>
                    </tr>
                  </tbody></table> 
  </div>
  <table class="n_bg" height="38" width="603" align="center" border="0" cellpadding="0" cellspacing="0">
                  <tbody><tr onclick="ShowOrHiden(0);">
                    <td style="padding: 1px 0px 0px 1px;" width="60">&nbsp;</td>
                    <td>Database update items</td>
                  </tr>
                </tbody></table>
   <div name="content_id0" id="content_id0" class="style7">
                  <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                      <td height="64" width="30" align="center">&nbsp;</td>
                      <td width="594"><table width="99%" border="0" cellpadding="0" cellspacing="0">
                          <tbody><tr>
                            <td class="n_time">Posted: March 29,2017</td>
                          </tr>
                          <tr>
                            <td class="n_con" align="left">We made some updates to Spells in the game.<br />

Thank you</td>
                          </tr>
                      </tbody></table>
                      </td>
                    </tr>
                  </tbody></table> 
  </div>
   
                </td>
            </tr>
        </tbody></table>
</div>
