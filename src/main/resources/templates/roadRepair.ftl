<!doctype html>
<html>
<head>
    <title>Route</title>
</head>
<body>
<h4>Всі ремонти доріг</h4>
<#-- это тот же список for each -->
<#list roadRepair as iRoadRepair>
    <div>
        <p>
            ${iRoadRepair.id} ${iRoadRepair.dateStartRoad} ${iRoadRepair.dateEndRoad}
            <form action="/roadRepair/delete/${iRoadRepair.id}" method="post">
                <input type="submit" value="Видалити ремонт доріг"/>
            </form>
        </p>
    </div>
    <#else>
</#list>
<hr>
<h3>Створити новий ремонт доріг</h3>
<form action="/roadRepair/create" method="post" enctype="multipart/form-data">
    id: <input type="number" name="id"/><br><br>
    Дата початку: <input type="date" name="dateStartRoad"/><br><br>
    Дата кінця: <input type="date" name="dateEndRoad"/><br><br>
    <input type="submit" value="Створити ремонт доріг"/>
</form>
</body>
</html>