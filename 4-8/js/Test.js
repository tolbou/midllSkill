const zoom = document.querySelectorAll(".zoom");
const zoomback = document.getElementById("zoomback");
const zoomimg = document.getElementById("zoomimg");


zoom.forEach(function (value) {
  value.addEventListener("click", kakudai);
});

function kakudai(e) {


  zoomback.style.display = "flex";

  zoomimg.setAttribute("src", e.target.getAttribute("src"));
}


zoomback.addEventListener("click", modosu);


function modosu() {

  zoomback.style.display = "none";
}

$('.slider').slick({
  autoplay: true,
  autoplaySpeed: 2000,
  speed: 800,
  dots: true,
  arrows: true,
  infinite: true,
});
