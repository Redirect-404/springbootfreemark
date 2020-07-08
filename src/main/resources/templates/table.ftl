<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>年龄</th>
        <th>性别</th>
        <th>成绩</th>
    </tr>
    <#list list as user>
    <tr>
        <td>${user.age}</td>
        <td>${user.sex}</td>
        <td>${user.fel}</td>
    </tr>
    </#list>

</table>

</body>
</html>