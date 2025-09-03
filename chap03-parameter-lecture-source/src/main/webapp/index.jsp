<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Request Parameter</h1>
<h3>GET 방식의 요청</h3>
<form action="querystring" method="get">
    <%--label+input  +는 동급 태그로 생성 --%>
    <label for="name1">이름: </label><input id="name1" type="text" name="name">
    <br>
    <label for="">나이: </label><input type="text" name="age">
    <br>
    <label for="">생일: </label><input type="date" name="birthday">
    <br>
    <labe>성별:</labe>
    <%--        input[type='radio' name='gender' id='male' value='M']--%>
    <input type="radio" name="gender" id="male" value="M">
    <labe for="male">남자</labe>
    <input type="radio" name="gender" id="female" value="F">
    <label for="female">여자</label>
    <br>
    <label>국적: </label>
    <select name="national">
        <%--            option*4--%>
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select>
    <br>
    <label>취미</label>
    <input type="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화보기</label>
    <input type="checkbox" name="hobbies" id="music" value="music"><label for="music">음악감상</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">잠자기</label>
    <br>
    <button type="submit">GET 요청</button>
</form>

<h4>a태그의 href 속성에 직접 파라미터를 쿼리스트링 형태로 작성하고 get요청을 할 수도 있다.</h4>
<a href="querystring?name=강형규&age=34&birthday=1992-04-12&gender=M&national=ko&hobbies=movie&hobbies=music">
    a태그 활용
</a>

<h3>POST 방식의 요청</h3>
<h4>form 태그를 이용한 post 방식 요청</h4>
<form action="payload" method="post">
    <%--label+input  +는 동급 태그로 생성 --%>
    <label for="name1">이름: </label><input id="name1" type="text" name="name">
    <br>
    <label for="">나이: </label><input type="text" name="age">
    <br>
    <label for="">생일: </label><input type="date" name="birthday">
    <br>
    <labe>성별:</labe>
    <%--        input[type='radio' name='gender' id='male' value='M']--%>
    <input type="radio" name="gender" id="male" value="M">
    <labe for="male">남자</labe>
    <input type="radio" name="gender" id="female" value="F">
    <label for="female">여자</label>
    <br>
    <label>국적: </label>
    <select name="national">
        <%--            option*4--%>
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select>
    <br>
    <label>취미</label>
    <input type="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화보기</label>
    <input type="checkbox" name="hobbies" id="music" value="music"><label for="music">음악감상</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">잠자기</label>
    <br>
    <button type="submit">POST 요청</button>
</form>

</body>
</html>