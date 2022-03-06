
function direct(id){
    

   window.location.href = `http://localhost:7080/tfa105g5-more-than-educate/search.controller?id=${id}`;

}
document.querySelector(".personbar1").addEventListener("click", function(e) {
	console.log(12345);
	var favorimg1 = document.querySelector(".favorimg1");
	if (favorimg1.src == "https://pic.sucaibar.com/pic/201307/08/028acf7310.png") {
		favorimg1.src = "http://localhost:7080/tfa105g5-more-than-educate/public/images/love.png";		
	}
	else {
		favorimg1.src = "https://pic.sucaibar.com/pic/201307/08/028acf7310.png";
	}
});









