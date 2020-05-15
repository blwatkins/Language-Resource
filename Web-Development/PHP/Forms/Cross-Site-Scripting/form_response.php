<!DOCTYPE html>
<html>
    <head>
        <title>Form Response</title>
    </head>
    <body>
        <h1>Form Response</h1>
        <?php
            $name = htmlentities($_POST['name']);
            $number = htmlentities($_POST['number']);

            if (empty($name) || empty($number)) {
                echo('<p>Missing Data. Resubmit Home Page form</p>');
            } else {
                echo('<p>Hello, ' . $name . '</p>');
                echo('<p>Your favorite number is ' . $number . '</p>');
                echo('<p>&ltcode&gtint x = 0;&lt/code&gt</p>');
                echo('<p><code>int x = 0;</code></p>');
            }
        ?>
        <a href="index.php">Home Page</a>
    </body>
</html>
