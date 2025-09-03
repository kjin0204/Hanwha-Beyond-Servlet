<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>forward</h1>
<%--    table>(tr>td*3)*2--%>
    <form action="forward" method="post">
        <table>
            <tr>
                <td>아이디 : </td>
                <td><input type="text" placeholder="아이디를 입력 해 주세요" name="userId"></td>
                <td rowspan="2"><button style="height:50px">로그인</button></td>
            </tr>
            <tr>
                <td>비밀번호: </td>
                <td><input type="password" placeholder="암호를 입력 해 주세요" name="password"></td>
            </tr>
        </table>
    </form>
</body>
</html>