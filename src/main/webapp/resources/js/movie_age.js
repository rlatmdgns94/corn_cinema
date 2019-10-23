window.onload = function () {
    function age() {
        var age = document.querySelectorAll(".age-ico");
        age.forEach(function (age) {
        	if (age.innerHTML === "전체 관람가") {
                age.classList.add('age-all');
            }
        	else if (age.innerHTML === "12세 이상 관람가") {
                age.classList.add('age-12');
            }
            else if (age.innerHTML === "15세 이상 관람가") {
                age.classList.add('age-15');
            }
            else{
                age.classList.add('age-19');
            }
        })
    }
    age();
}
