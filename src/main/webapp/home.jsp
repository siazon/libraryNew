<%--
  Created by IntelliJ IDEA.
  User: effy
  Date: 22/11/2022
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<style type="text/css">
  /* 清除默认样式 同时给所有元素设置样式 */
  * {
    margin: 0;
    padding: 0;
    font-family: "Open Sans Light";
    letter-spacing: .07em; /* 字母间隔大小 */
  }
  /* 因为下面想设置body、wrap区域的宽高为整个窗口高度 所以得先设置html也得这样设置
       这里得注意 body 和 html 的区别
       1.如果body及其子元素想设置高度为窗口高度 那么得设置h向下面这样设置html

       2.在body里面设置background-color时，发现整个窗口都会变了颜色 这容易产生错觉： body == 窗口
  */
  html {
    height: 100%;
  }
  body {
    height: 100%;
  }
  /* 继承窗口高度 设置一个渐变色向右渐变  渐变色推荐网站：https://www.sj520.cn/tools/jianbian/  应该有你喜欢的吧 */
  .wrap {
    height: 100%;
    background-image: linear-gradient(to right, #30cfd0, #330867);
  }
  /* 这个是登录区域 */
  .chuze-wrap {
    width: 400px;
    height: 600px;
    background-color: rgba(170, 170, 255, 0.3);
    /* 居中开始 */
    position: relative;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    /* 居中结束 */
    border-radius: 10px;
    padding: 0 50px; /* 左右留出空余 */

  }
  .button6{
    background: plum;
    color: greenyellow;
    border: 1px solid dodgerblue;
    transition-duration: 1s;/*过渡时间*/
    border-radius: 12px;
    padding: 13px 18px;
    margin-top: 20px;
    outline-style: none;/*去除点击时外部框线*/
    position: relative;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    width: 100%;
    line-height: 30px;
    border: 0;
    border-radius: 3px;
    margin-top: 20px;
    background-image: linear-gradient(to right, #5ee7df, #b490ca);
    font-size: 16px;
    text-align: center;
    cursor: pointer;
    color: #aa00ff;
    font-weight: bold;
  }
  .button6:hover{
    background: #aa00ff;
    color: #aa00ff;
    transition-duration: 1s;
  /* 给最上面的chuze这个标题设置样式 */
  .chuze-title {
    font-size: 25px;
    text-align: center;
    line-height: 100px;
    color: #fff;
    font-weight: bold;
  }
  /* 输入设置样式 */
  .chuze-form .chuze-input{
    display: block; /* input 标签是行内元素 */
    width: 100%;
    border: 0;
    border-bottom: 1px solid #ccc;
    padding: 10px 0 10px 10px;
    margin-bottom: 20px;
    outline: none; /* 输入框边框去掉 */
    background-color: transparent; /* 透明色 */
  }
  .chuze-form .chuze-input::placeholder {
    text-transform: uppercase; /* 设置placeholder内容的大小写 */
    color: #bdbdbd;
  }
  /* 给登录提交按钮设置样式 */
  .chuze-form .chuze-button {
    width: 100%;
    line-height: 30px;
    border: 0;
    border-radius: 3px;
    margin-top: 20px;
    background-image: linear-gradient(to right, #5ee7df, #b490ca);
    font-size: 16px;
    text-align: center;
    cursor: pointer;
    color: #aa00ff;
    font-weight: bold;
  }
  /* tip 区域样式 */
  .tip {
    margin-top: 15px;
  }
  .tip a {
    padding-left: 110px;
    text-decoration: none;
    color: #7d3ebc;
  }

</style>
<body>
<div class="wrap">
  <div class="chuze-wrap">
    <class class="chuze-title">

      <br>
      <br>
      <div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        欢迎使用图书管理系统
      </div>
      <div>  </div>
      <div>
        <br>
        <br>
        <a href="Show.jsp" ><button class="button6">浏览图书信息</button></a><br>
        <a href="addbook.html   " ><button class="button6">添加图书信息</button></a><br>
        <a href="updatebook.html   "><button class="button6">修改图书信息</button></a><br>
        <a href="<%=request.getContextPath()%>/bookServlet"><button class="button6">查询图书信息</button></a><br>
        <a href="delitebook.html "><button class="button6">删除图书信息</button></tr></a></div>

      <div class="tip">
        <br>
        Click here to jump back to the loginpage    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

        <a href="login1.html">return</a>
      </div>
    </class>

  </div>
</div>
</body>

</html>
