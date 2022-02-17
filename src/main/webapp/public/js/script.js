"use strict";

const testBtn = document.querySelector(".test-button");

testBtn.addEventListener("click", function(){
    fetch(`/moreThanEducate2/reserv/selectById?id=1`)
    .then((body) => body.json())
    .then((reservation) => {
        console.log(reservation);
    })
})