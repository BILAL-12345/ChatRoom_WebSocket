var stompClient = null;

function connect(){
    let socket = new SocketJS("/server1")
    stompClient = Stomp.over(socket)
    stompClient.connect({},function(frame){
        console.log("Connected : "+ frame)
    })
}

$(document).ready(e=>{
    alert("test");
});


$("#login").click(()=>{

    let name = $("#name-value").val();
    localStorage.setItem("name", name);

    connect();

})