window.addEventListener('load', function() {

    if (window.location.href.endsWith("/")) {
        window.location.replace(window.location.href + "index.html");
    }

    if (window.location.href.includes("/index.html")) {

        var mybutton = document.getElementById("gumbIndexGor");

        window.onscroll = function() {scrollFunction()};

        function scrollFunction() {
            if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 250) {
                mybutton.style.display = "block";
            } else {
                mybutton.style.display = "none";
            }
        }

    }
});

function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}
  