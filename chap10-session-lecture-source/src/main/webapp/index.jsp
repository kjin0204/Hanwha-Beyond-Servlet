<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Session Handling</h1>
    <form action="session" method="post">
        <table>
            <tr>
                <td>firstName:</td>
                <td><input type="text" name="firstName" placeholder="이름을 입력 해 주세요"></td>
            </tr>
            <tr>
                <td>lastName:</td>
                <td><input type="text" name="lastName" placeholder="성을 입력 해 주세요"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button style="width:100px">전송</button>
                </td>
            </tr>
        </table>
    </form>
    <br>
    <a href="delete">세션 데이터 지우기</a>
</body>
</html>