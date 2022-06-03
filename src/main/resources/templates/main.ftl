<!doctype html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/styles.css"/>
    <title>Главная страница</title>
</head>
<body>
    <header class = "header">
            <div>
                <img src="images/logo.png" alt="">
            </div>
            <div class="header-btn-conteiner">
                <a href="/loging" class = "btn">Вхід</a>
                <a href="/reg" class = "btn">Реєстрація</a>
            </div>
        </header>
        <div class="slider">
            <input type="radio" name="switch" id="btn1" checked>
            <input type="radio" name="switch" id="btn2">
            <input type="radio" name="switch" id="btn3">
            <div class="switch">
              <label for="btn1"></label>
              <label for="btn2"></label>
              <label for="btn3"></label>
            </div>
            <div class="slider-inner">
              <div class="slides">
                <img src="images/Автобус.jpg"/>
                <img src="images/Троллейбус.jpg"/>
                <img src="images/Трамвай.jpg"/>
              </div>
            </div>
          </div>
          <br>
            <div class="nav-container">
                <nav class="nav">
                    <a href="/routes" class = "btn btnhelp">Всі маршрути</a>
                    <a href="/roadRepair" class = "btn btnhelp">Ремонти доріг</a>
                </nav>
            </div>
</body>
</html>