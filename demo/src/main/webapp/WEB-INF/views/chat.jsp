<%--
  Created by IntelliJ IDEA.
  User: songn
  Date: 2021-11-05
  Time: 오후 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<div>
    <input type="text" id="sender" value="1">
    <input type="text" id="messageinput">
</div>
<div>
    <button type="button" onclick="openSocket();">Open</button>
    <button type="button" onclick="send();">Send</button>
    <button type="button" onclick="closeSocket();">Close</button>
    <button type="button" id="test">test</button>
    <form name="frm" action="/parkingEqu/webSocket.do">
        <input type="text" name="test" value="웹소켓 테스트 중">
    </form>
</div>
<!-- Server responses get written here -->
<div id="messages"></div>
<!-- websocket javascript -->
<script type="text/javascript" src="/js/chat.js">

</script>
</body>
</html>