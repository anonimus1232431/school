<?php
function polacz()
{
$login="root";
$haslo="";
$adres="localhost";
$baza="sklepik";
$polaczenie = mysqli_connect($adres,$login,$haslo,$baza);

return $polaczenie;
}

?>

