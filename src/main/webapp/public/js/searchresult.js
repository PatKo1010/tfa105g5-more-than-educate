
function mouseover(e){
$(e.target).css("color","#02CAB9");
}

function mouseout(e){
$(e.target).css("color","black");
}




function direct(id){

   window.location.href = `http://localhost:7080/tfa105g5-more-than-educate/search.controller?id=${id}`;
}










