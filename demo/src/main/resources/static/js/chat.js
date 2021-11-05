var ws;
var messages=document.getElementById("messages");

function openSocket(){
    if(ws!==undefined && ws.readyState!==WebSocket.CLOSED){
        writeResponse("WebSocket is already opened.");
        return;
    }
    //웹소켓 객체 만드는 코드
    ws=new WebSocket("ws://localhost:8080/websocket");

    ws.onopen=function(event){
        if(event.data===undefined) return;
        console.log(event.data);
        writeResponse(event.data);
    };
    ws.onmessage=function(event){
        writeResponse(event.data);
        var jsonObject = JSON.parse(event.data);
        console.log(jsonObject);
    };
    ws.onclose=function(event){
        writeResponse("Connection closed");
    }
}

openSocket();

function send(){
    var text=document.getElementById("messageinput").value+","+document.getElementById("sender").value;
    ws.send(text);
    text="";
}

function closeSocket(){
    ws.close();
}
function writeResponse(text){
    messages.innerHTML+="<br/>"+text;
}
$(function(){
    $('#test').on('click', function(){

        document.frm.submit();

    });
});