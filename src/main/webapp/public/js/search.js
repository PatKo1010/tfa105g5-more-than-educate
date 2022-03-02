 document.querySelector(".personbar1").addEventListener("click", function (e) {
        var favorimg1= document.querySelector(".favorimg1");
 if(favorimg1.src=="https://pic.sucaibar.com/pic/201307/08/028acf7310.png"){
     favorimg1.src="/test2/search/images/love.png";
 }
 else{
     favorimg1.src="https://pic.sucaibar.com/pic/201307/08/028acf7310.png";
 }
     });