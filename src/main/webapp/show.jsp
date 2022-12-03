<%@ page import="java.util.ArrayList" %>
<%@ page import="com.lms.entity.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="com.lms.bean.BookInfo" %><%--
  Created by IntelliJ IDEA.
  User: effy
  Date: 23/11/2022
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>图书管理系统</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            /*font-size: 12px;*/
        }

        a {
            text-decoration: none;
            color: darkgray;
        }

        .head {
            position: relative;
            width: 100%;
            height: 45px;
            line-height: 45px;
            background: rgba(0, 0, 0, 0.79);
            z-index: 1000;
        }

        .title {
            color: white;
            float: left;
            font-size: 20px;
            font-weight: 600;
            letter-spacing: 3px;
            margin-left: 100px;
        }

        .head > a {
            margin-left: 100px;
        }

        .login {
            display: block;
            float: right;
            margin-right: 100px;
        }

        .login span {
            color: white;
        }

        .login a {
            margin: 0 16px;
        }

        .middle {
            position: relative;
        }

        .left {
            display: inline-block;
            width: 15%;
            height: 500px;
            border-right: 1px black solid;
            margin: 0 auto;
            text-align: center;
        }

        .left #operate {
            margin-top: 20px;
            background: #396bb3;
            color: white;
            height: 35px;
            line-height: 35px;
        }

        .left a {
            display: block;
            width: 200px;
            text-align: left;
            margin: 0px 0 0 23px;
            color: #396bb3;
        }

        .right {
            display: inline-block;
            position: absolute;
            width: 84.9%;

        }

        .find {
            position: relative;
            margin: 15px 6%;
            text-align: right;
        }

        .find span {
            display: inline-block;
            background: gray;
            padding-left: 25px;
            background: #f4f4f4;
            border: solid 1px #c9c9c9;;
            border-radius: 5px;
        }

        .find input {
            display: inline;
            width: 150px;
            height: 30px;
            border: none;
            border-left: 1px solid #c9c9c9;
            border-bottom-right-radius: 5px;
            border-top-right-radius: 5px;
        }

        button, .find button {
            width: 50px;
            height: 30px;
            background-color: #396bb3;
            color: white;
            border: solid 1px;
            border-radius: 4px;
        }

        .tb {
            width: 90%;
            margin: 0 auto;

            border-collapse: collapse;
        }

        .col_1 {
            width: 10%;
        }

        .col_6 {
            width: 15%;
        }

        .col_7 {
            width: 25%
        }

        .col_7 .view {
            background-color: #339900;
        }

        .col_7 .edit {
            background-color: orange;
        }

        .col_7 .del {
            background-color: firebrick;
        }

        tr {
            text-align: center;
            border-top: 1px solid #c9c9c9;
        }

        td, th {
            padding: 10px 0;
        }

        .page {
            margin: 20px auto;
            height: 34px;
        }

        .page ul {
            height: 34px;
            width: 50%;
            position: relative;
            left: 37%;
        }

        .page li {
            float: left;
            display: inline;
            height: 34px;
            line-height: 32px;
            text-align: center;
            font-size: 12px;
        }

        .page1 {
            width: 34px;
            line-height: 36px;
            color: white;
            background-color: #396bb3;
        }

        .page a {

            float: left;
            color: #396bb3;
            width: 34px;
            border: 1px solid #e1e1e1;
        }

        .page a:hover {
            color: #fff;
            background-color: #396bb3;
            border: 1px solid #396bb3;
        }

        .page .page_edge {
            width: 50px;
        }

        .bottom {
            margin-top: 20px;
            text-align: center;
            font-size: 14px;
        }

        .pb {
            font-weight: 600;
        }

        .pb span {
            color: #396bb3;
        }

        .hide {
            display: none;
        }

        .bg {
            position: fixed;
            width: 100%;
            height: 100%;
            background-color: gray;
            opacity: 0.3;
            z-index: 1;

        }

        .add_text {
            background: white;
            position: fixed;
            left: 50%;
            top: 50%;
            margin-top: -150px;
            margin-left: -150px;
            width: 350px;
            height: 350px;
            padding-top: 15px;
            z-index: 1;

        }

        .add_text input {
            width: 180px;
            height: 25px;
            font-size: 14px;
            margin: 10px;
            border: 1px solid gray;
            border-radius: 2px;
        }

        .add_text p {
            text-align: center;
            margin: 10px 0;
            line-height: 44px;
        }

        .add_text button {
            width: 60px;
            height: 30px;
            margin: 5px;
        }

        select {
            width: 25%;
        }

    </style>
</head>
<body>
<div class="bg hide handel"></div>

<form  action="/libraryNew/update" method="get" >
<div class="add_text hide handel">
    <p>书名:<input id="bookName" name="bookName" placeholder=""/></p>
    <p>数量:<input id="bookQty" name="bookQty" placeholder=""/></p>
    <p>作者:<input id="bookAuthor" name="bookAuthor" placeholder=""/></p>
    <p>货架:<input id="bookRackNo" name="bookRackNo" placeholder=""/></p>
    <p>分类:
        <select name="classify">
            <option id="计算机" value="计算机">计算机</option>
            <option id="文学" value="文学">文学</option>
        </select></p>
    <p id="butt">
        <button class="confirm" type="submit">确定</button>
        <button class="cancel">取消</button>
    </p>
</div>
</form>

<div class="all">
    <div class="head">
        <span class="title">图书管理系统</span>
        <a href="#1">首页</a>
        <span class="login">
            <a href="#2">欢迎你</a><span>Shaw</span>
            <a href="#3">注销</a>
            <a href="#4">修改密码</a>
        </span>
    </div>
    <div class="middle">
        <div class="left">
            <div id="operate">操作
                <div class="hide">
                    <a id="add_book" href="#">
                        <div> >>>添加书籍</div>
                    </a>
                    <a href="#">
                        <div> >>>草稿箱</div>
                    </a>
                    <a href="#">
                        <div> >>>设置默认编辑器</div>
                    </a>
                    <a href="#">
                        <div> >>>备份书籍</div>
                    </a>
                </div>
            </div>
        </div>
        <div class="right">
            <div class="find">
                <button onclick="newBook(this)">New</button>
                <span><input id="find_text" type="text" placeholder="  Title" value=""></span>
                <button id="find_btn" onclick="fd()">查找</button>
            </div>
            <div class="content">
                <table class="tb" id="tb_book_info">
                    <thead> <tr class="row_t">
                        <th class="col_1">图书编号</th>
                        <th class="col_6">书名</th>
                        <th class="col_1">数量</th>
                        <th class="col_1">作者</th>
                        <th class="col_1">货架</th>
                        <th class="col_1">分类</th>
                        <th class="col_1">上架时间</th>
                        <th class="col_7">操作</th>
                    </tr>
                    </thead>
                <%--                    <tr class="row hide">--%>
<%--                        <td class="col_1">15662</td>--%>
<%--                        <td class="col_2">Software Introduction</td>--%>
<%--                        <td class="col_3">egon</td>--%>
<%--                        <td class="col_4">12.00</td>--%>
<%--                        <td class="col_5">计算机</td>--%>
<%--                        <td class="col_6">2017-08-03</td>--%>
<%--                        <td class="col_7">--%>
<%--                            <button class="view">查看</button>--%>
<%--                            <button class="edit" onclick="redact(this)">编辑</button>--%>
<%--                            <button class="del" onclick="dell(this)">删除</button>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
                    <%

                        List<BookInfo> list = (ArrayList) request.getAttribute("arr");
                    %>
                    <%
                        for(int i = 0; i < list.size(); i++) {

                    %>
                    <tbody id="rows">
                    <tr id="row_0" data-index="3" >

                        <td class="col_1"><%=list.get(i).getBookId() %></td>
                        <td class="col_6"><%=list.get(i).getBookName()%></td>
                        <td class="col_1"><%=list.get(i).getQuantity()%></td>
                        <td class="col_1"><%=list.get(i).getAuthor_name()%></td>
                        <td class="col_1"><%=list.get(i).getLocationRackId()%></td>
                        <td class="col_1"><%=list.get(i).getCategory()%></td>
                        <td class="col_1"><%=list.get(i).getBookAddedOn()%></td>
                        <td class="col_1 hide"><%=list.get(i).getAuthor_id()%></td>
                        <td class="col_7">
                            <button class="view">查看</button>
                            <button class="edit" onclick="edit(this)">编辑</button>
                            <button class="del" onclick="dell(this)">删除</button>
                        </td>
                    </tr>
                    </tbody>
<% } %>
<%--                    <tr class="hide" id="row_6">--%>
<%--                        <td class="col_1">15668</td>--%>
<%--                        <td class="col_2">水浒传5</td>--%>
<%--                        <td class="col_3">alex</td>--%>
<%--                        <td class="col_4">45.00</td>--%>
<%--                        <td class="col_5">文学</td>--%>
<%--                        <td class="col_6">2017-08-03</td>--%>
<%--                        <td class="col_7">--%>
<%--                            <button class="view">查看</button>--%>
<%--                            <button class="edit" onclick="redact(this)">编辑</button>--%>
<%--                            <button class="del" onclick="dell(this)">删除</button>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
                </table>
            </div>
            <div class="page">
                <ul>
                    <li><a href="#" class="page_edge">上一页</a></li>
                    <li class="page1"><span>1</span></li>
                    <li><a href="#" class="pagepa hide">2</a></li>
                    <li><a href="#" class="page_edge">下一页</a></li>
                </ul>
            </div>
        </div>
    </div>

</div>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/datatables/1.10.21/js/jquery.dataTables.min.js"></script>
<script>
    var add_book = document.getElementById("add_book");
    var handel = document.getElementsByClassName("handel");
    var confirm = document.getElementsByClassName("confirm")[0];
    var cancel = document.getElementsByClassName("cancel")[0];
    var user = document.getElementsByName("book")[0];
    var author = document.getElementsByName("author")[0];
    var price = document.getElementsByName("price")[0];
    var input = document.getElementsByTagName("input");
    var select = document.getElementsByName("classify")[0];
    var find_text = document.getElementById("find_text");
    var find_btn=document.getElementById("find_btn")
    var operate = document.getElementById("operate");
    var row_all = document.getElementsByTagName("tr");
    var page_edge = document.getElementsByClassName("page_edge");

    var tag = 0;
    var row_list = {};

    var current_page = 1;

    for (var i = 2; i < row_all.length; i++) {
        row_list[row_all[i].id] = row_all[i]
    }

    //    for ()

    function list_lengh(list) {
        var i = 0;
        for (var j in list) {
            i++;
        }
        return i;
    }

    function newBook(self) {
        var data={
            bookid:-1,
            isEdit:"N"
        };
        window.location.href =generateUrlWithParams("/libraryNew/authorsAndCatogorys", data);

    }
    function dell(self) {
        var value = $(self).parent().parent().find("td");
        var data={
            bookid:value.eq(0).text()};
        window.location.href =generateUrlWithParams("/libraryNew/deletebook", data);
        self.parentNode.parentNode.parentNode.removeChild(self.parentNode.parentNode)

    }

    function changeNum(num) {
        if (num < 10) {
            return "0" + num;
        } else {
            return num;
        }
    }

    function getToday() {
        var data = new Date();
        var year = data.getFullYear();
        var mon = data.getMonth() + 1;
        var day = data.getDate();
        return year + "-" + changeNum(mon) + "-" + day;

    }
function edit(e) {
    var value = $(e).parent().parent().find("td");
    var data={
        bookid:value.eq(0).text(),
           isEdit:"Y"};
   // var data={
   //     isEdit:"Y",
   //     bookid:value.eq(0).text(),
   //     bookname:value.eq(1).text(),
   //     quantity:value.eq(2).text(),
   //     author:value.eq(3).text(),
   //     location:value.eq(4).text(),
   //     authorid:value.eq(7).text()
   // };
    window.location.href = generateUrlWithParams("/libraryNew/authorsAndCatogorys", data);
}
    function generateUrlWithParams(url, params) {
        console.log("params",params);
        var urlParams = [];
        for (var key in params) {
            if (params[key]) {
                urlParams.push(`${key}=${params[key]}`);
            }
        }
        url += "?" + urlParams.join("&");
        return url;
    }
    function redact(self) {
        console.log("self:",self);
        edit_row = self.parentElement.parentElement;

        for (var i = 0; i < handel.length; i++) {
            handel[i].classList.remove("hide");
        }

        for (i = 0; i < input.length - 1; i++) {
            input[i].value = edit_row.children[i + 1].innerText;
            console.log(edit_row.children[i + 1].innerText);
        }
        console.log("bookName:",document.getElementById("bookName").value);

        for (i = 0; i < select.options.length; i++) {
            select.options[i].removeAttribute("selected");
        }

        // var de_select = document.getElementById(edit_row.children[4].innerText);
        // de_select.setAttribute("selected", "");
        tag = 1;
    }

    function fd() {
        for (var i in row_list) {
            if (row_list[i].innerText.match(find_text.value.trim())) {
                row_list[i].classList.remove("hide")
            }
            else {
                row_list[i].classList.add("hide")
            }
        }
    }

    add_book.onclick = function () {
        for (i = 0; i < handel.length; i++) {
            handel[i].classList.remove("hide")
        }
    };

    confirm.onclick = function () {
        var message = [];
        var row = document.getElementsByTagName("tr")[document.getElementsByTagName("tr").length - 1];
        var new_row = row.cloneNode(true);
        var today = getToday();
        var flag = 1;

        for (var i = 0; i < handel.length; i++) {
            handel[i].classList.add("hide");
        }

        if (!tag) {
//            new_row.classList.remove("hide");

            message[0] = Number(new_row.children[0].innerText) + 1;
            for (i = 0; i < input.length - 1; i++) {
                message.push(input[i].value);
                input[i].value = "";
            }
            message[message.length - 1] = Number(message[message.length - 1]).toFixed(2)
            message.push(select.options[select.options.selectedIndex].innerText);
            message.push(today);
            console.log(message);

            for (var j = 0; j < message.length; j++) {
                new_row.children[j].innerText = message[j]
            }
            for (var me in message) {
                if (message[me].length == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag) {
                new_row.id = "row_" + list_lengh(row_list);
                row_list[new_row.id] = new_row;
                if (list_lengh(row_list) <= (current_page - 1) * 6 -1 || list_lengh(row_list) > (current_page) * 6-1) {
                    new_row.classList.add("hide")
                }
                else {
                    new_row.classList.remove("hide")
                }
                row.parentElement.appendChild(new_row);
            }
            else {
                alert("请填写完整的信息")
            }
        }
        else {
            message = [];
            for (i = 0; i < input.length - 1; i++) {
                message.push(input[i].value);
                input[i].value = "";
            }
            message[message.length - 1] = Number(message[message.length - 1]).toFixed(2)
            message.push(select.options[select.options.selectedIndex].innerText);

            for (var m in message) {
                if (message[m].length == 0) {
                    flag = 0;
                    break;
                }
            }
            tag = 0;

            if (flag) {
                for (j = 0; j < message.length; j++) {
                    edit_row.children[j + 1].innerText = message[j]
                }
            }
            else {
                alert("请填写完整的信息")
            }
        }
    };

    cancel.onclick = function () {
        for (var i = 0; i < input.length - 1; i++) {
            input[i].value = "";
        }
        for (i = 0; i < handel.length; i++) {
            handel[i].classList.add("hide");
        }
    };

    find_btn.onclick=function () {
        fd();
    }

    find_text.onkeydown = function (e) {
        e = e || window.event;
        var keynum = e.keyCode;
        if (keynum == 13) {
            fd();
        }
    }

    page_edge[1].onclick = function () {
        if (list_lengh(row_list) / 6 > current_page) {
            current_page++;
        }

        for (var i in row_list) {
            if (Number(i.slice(4,)) <= (current_page - 1) * 6-1 || Number(i.slice(4,)) > (current_page) * 6-1) {
                row_list[i].classList.add("hide")
            }
            else {
                row_list[i].classList.remove("hide")
            }
        }
    }

    page_edge[0].onclick = function () {
        if (current_page > 1) {
            current_page--;
        }

        for (var i in row_list) {
            if (Number(i.slice(4,)) <= (current_page - 1) * 6 -1|| Number(i.slice(4,)) > (current_page) * 6-1) {
                row_list[i].classList.add("hide")
            }
            else {
                row_list[i].classList.remove("hide")
            }
        }
    }

    var error = document.createElement("p");
    error.innerText = "2-10个字符，可使用字母、汉字、数字、不能是纯数字";
    error.style.color = "red";
    error.style.fontSize = "12px";
    error.style.lineHeight = "12px";
    error.style.float = "none";
    error.style.margin = "0";
    error.style.textAlign = "center";
    var error1 = error.cloneNode(true);
    error1.innerText = "请输入正确的作者名";
    var error2 = error.cloneNode(true);
    error2.innerText = "请输入正确的价格";
    //
    // user.onblur = function () {
    //
    //     if (!isNaN(user.value) || user.value.length > 10 || user.value.length < 2) {
    //
    //         if (!this.nextElementSibling) {
    //             this.parentNode.appendChild(error)
    //         }
    //     }
    //     else {
    //         if (this.nextElementSibling) {
    //             this.parentNode.removeChild(this.nextElementSibling)
    //         }
    //     }
    //
    // };
    //
    // author.onblur = function () {
    //
    //     if (!isNaN(author.value) || author.value.length > 10 || author.value.length < 2) {
    //         if (!this.nextElementSibling) {
    //             this.parentNode.appendChild(error1)
    //         }
    //     }
    //     else {
    //         if (this.nextElementSibling) {
    //             this.parentNode.removeChild(this.nextElementSibling)
    //         }
    //     }
    // };
    //
    // price.onblur = function () {
    //     if (isNaN(price.value) || price.value.length == 0) {
    //
    //         if (!this.nextElementSibling) {
    //             this.parentNode.appendChild(error2)
    //         }
    //     }
    //     else {
    //         if (this.nextElementSibling) {
    //             this.parentNode.removeChild(this.nextElementSibling)
    //         }
    //     }
    // };

    operate.onmouseover = function () {
        this.firstElementChild.classList.remove("hide")
    }

    operate.onmouseout = function () {
        this.firstElementChild.classList.add("hide")
    }

</script>
</body>

</html>
