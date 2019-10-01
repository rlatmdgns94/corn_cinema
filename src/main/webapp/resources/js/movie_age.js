window.onload = function () {
    function age() {
        var age = document.querySelectorAll(".age_ico");
        age.forEach(function (age) {
        	if (age.innerHTML === "전체 관람가") {
                age.classList.add('age_all');
            }
        	else if (age.innerHTML === "12세 이상 관람가") {
                age.classList.add('age_12');
            }
            else if (age.innerHTML === "15세 이상 관람가") {
                age.classList.add('age_15');
            }
            else{
                age.classList.add('age_19');
            }
        })
    }
    age();
}
