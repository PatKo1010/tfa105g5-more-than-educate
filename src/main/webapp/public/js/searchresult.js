console.log(123);
var count = 0;
document.querySelector(".personbar1").addEventListener("click", function(e) {
	console.log(12345);
	var favorimg1 = document.querySelector(".favorimg1");
	if (favorimg1.src == "https://pic.sucaibar.com/pic/201307/08/028acf7310.png") {
		favorimg1.src = "http://localhost:7080/tfa105g5-more-than-educate/public/images/love.png";
		
		
		count = 1;
	}
	else {
		favorimg1.src = "https://pic.sucaibar.com/pic/201307/08/028acf7310.png";
		count = 0;
	}
});
var  reserve1=document.querySelector(".reserve1");
reserve1.addEventListener("click",function(e) {
ㄚ
console.log(1);
});

var  contact1=document.querySelector(".contact1");
contact1.addEventListener("click",function(e) {
	console.log(2);
});
var  favorpriority=document.querySelector(".favorpriority");
favorpriority.addEventListener("click",function(e) {
	console.log(3);
	
});

var  newpriority=document.querySelector(".newpriority");
newpriority.addEventListener("click",function(e) {
	console.log(4);
});


var membertitle=document.querySelector(".membertitle");
membertitle.addEventListener("click",function(e) {
	console.log(4);
});






