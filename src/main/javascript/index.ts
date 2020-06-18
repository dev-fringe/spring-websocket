import * as SockJsClient from 'sockjs-client';
import {Stomp} from '@stomp/stompjs';

const sockJs = new SockJsClient('connectWS')
const stomp = Stomp.over(sockJs);

stomp.connect({}, function(frame) {
    stomp.subscribe('/topic/response', function(res) {
        document.getElementById("res").innerHTML = JSON.parse(res.body).result;
    });
});

const button = document.querySelector("button");
button.addEventListener("click", handleClick);

function handleClick() {
    stomp.send("/app/add", {}, JSON.stringify({
        'one' : document.getElementById("one")["value"],
        'two' : document.getElementById("two")["value"]
    }));
}