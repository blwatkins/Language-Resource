<!DOCTYPE html>
<html>
    <head>
        <title>Form Response</title>
    </head>
    <body>
        <h1>Form Response</h1>
        <?php
            $name = $_POST['name'];
            $number = $_POST['number'];

            if (empty($name) || empty($number)) {
                echo('<p>Missing Data. Resubmit Home Page form</p>');
            } else {
                echo('<p>Hello, ' . $name . '</p>');
                echo('<p>Your favorite number is ' . $number . '</p>');
            }
        ?>
        <a href="index.php">Home Page</a>
    </body>
</html>
