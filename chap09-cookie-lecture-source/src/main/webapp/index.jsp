<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Cooke Handling</h1>
    <form action="cookie" method="post">
        <table>
            <tr>
                <td>firstName:</td>
                <td><input type="text" name="firstName" placeholder="이름을 입력 해 주세요"></td>
            </tr>
            <tr>
                <td>lastName:</td>
                <td><input type="text" name="lstName" placeholder="성을 입력 해 주세요"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button style="width:100px">전송</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>