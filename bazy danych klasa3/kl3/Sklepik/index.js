order = () => {
    let number = document.getElementById("numer").value;

    let weight = document.getElementById("waga").value;

    let price = 0;

    x = "zł";

    if (number == 1) {
        price = weight * 5;
    } else if (number == 2) {
        price = weight * 7;
    } else if (number == 3) {
        price = weight * 6;
    } else if (number == 4) {
        price = "(Kawa niedostępna!) 0"
    } else {
        price = 0;
    }

    document.getElementById("wynik").innerHTML = `Koszt zamówienia wynosi: ${price} ${x}`;

}
