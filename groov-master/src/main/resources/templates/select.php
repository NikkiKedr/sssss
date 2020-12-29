<?php
$dsn = "pgsql:host=localhost;port=5432;dbname=groov;user=postgres;password=Disciples1";
$conn = new PDO($dsn);
$select_gps_tracker=$conn->query("SELECT humidity.id, humidity.date, humidity.humidity FROM humidity");
while ($r1 = $select_gps_tracker->fetch(PDO::FETCH_ASSOC)){
    echo "<div class='myClass'>id: $r1[id]</div>";
    echo "<div class='myClass'>время: $r1[date]</div>";
    echo "<div class='myClass'>влажность: $r1[humidity]</div>";
}
?>
