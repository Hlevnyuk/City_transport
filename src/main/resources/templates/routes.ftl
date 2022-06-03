<!doctype html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/styles.css"/>
    <title>Route</title>
</head>
<body>
    Всі маршрути
<#-- это тот же список for each -->
<#list route as elroute>
    <div>
        <p>
            ${elroute.numberRoute} ${elroute.startPoint} | <a href="/routes/${elroute.numberRoute}">Подробнее...</a>
        </p>
    </div>
    <#else>
    <h1>Маршрутов нет</h1>
</#list>
<hr>
<h3>Создать новый маршрут</h3>
<form action="/route/create" method="post" enctype="multipart/form-data">
    Номер маршрута: <input type="number" name="numberRoute"/><br><br>
    Начальная точка: <input type="text" name="startPoint"/><br><br>
    Конечная точка: <input type="text" name="endPoint"/><br><br>
    Количество остановок: <input type="text" name="numberOfStops"/><br><br>
    Интервал: <input type="text" name="interval"/><br><br>
    Дата создания: <input type="date" name="dateTime"/><br><br>
    <input type="submit" value="Добавить маршрут"/>
</form>
</body>
</html>