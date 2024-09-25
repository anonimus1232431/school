<!doctype html>

<html lang="en"> 

 <head> 

  <meta charset="UTF-8"> 

  <title>Login</title> 

  <link rel="stylesheet" href="./edycja.css"> 

 </head> 

 <body>

  <section> 

   <div class="signin"> 

    <div class="content"> 

     <h2>Dodaj</h2> 

     <div class="form"> 
     <form action="login.php" method="POST">

      <div class="inputBox"> 

       <input type="text" id="login" name="login" required> <i>Username</i> 

      </div> 

      <div class="inputBox"> 

       <input type="password" id="password" name="password" required> <i>Password</i> 

      </div> 

      <div class="inputBox"> 

       <input type="submit" value="Login"> 
       <?php
if (isset($_POST['login']) && isset($_POST['password'])) {
    $login = $_POST['login'];
    $password = $_POST['password'];
 
    $_SESSION['login'] = $login;
    $polaczenie = @mysqli_connect('localhost', 'root', '', 'sklepik') or die('Błąd połączenia');
    $zap1 = "select * from user where username='$login' and password='$password';";
    $wyn1 = mysqli_query($polaczenie, $zap1);
    if (mysqli_num_rows($wyn1) == 1) {
        echo "Zalogowano $login";
        header('location:index.html');
    } else {
        header("location:page404.html");
    }
 
    mysqli_close($polacz);
}
?>
       </form>

      </div> 

     </div> 

    </div> 

   </div> 

  </section> 

 </body>

</html>