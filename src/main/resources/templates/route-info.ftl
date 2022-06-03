<!doctype html>
<html>
<head>
    <title>Route</title>
</head>
<body>
<h1>Маршрут</h1><hr>
<h4>Подробная информация о маршруте</h4>
<b>Номер маршрута: </b>${route.numberRoute}<br>
<b>Начальная точка: </b>${route.startPoint}<br>
<b>Конечная точка: </b>${route.endPoint}<br>
<b>Количество остановок: </b>${route.numberOfStops}<br>
<b>Интервал: </b>${route.interval}<br>
<b>Дата создания: </b>${route.dateTime}<br>
<hr>
<form action="/route/delete/${route.numberRoute}" method="post">
    <input type="submit" value="Удалить маршрут"/>
</form>
</body>
</html>