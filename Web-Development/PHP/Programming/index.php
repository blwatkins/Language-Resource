<!DOCTYPE html>
<html>
    <head>
        <title>Programming in PHP</title>
     </head>
    <body>
        <?php
            // single line comment
            # single line comment
            /*
            multi
            line
            comment
            */

            // Output to HTML
            echo("<h1>Programming in PHP</h1>");

            // Variables
            $integer = 45;
            $float = 3.14159;

            var_dump($float);
            echo("<br/>");
            var_dump($integer);
            echo("<br/>");

            // Output to HTML
            echo("This is text");
            echo("<br/>");
            echo("This is more text");
            echo("<br/>");

            // Strings
            $mystring1 = "This is my string";
            $myString2 = 'This is also my string';

            // String Concatenation
            $name = 'Bob';
            $hello = 'Hello, ' . $name;
            echo($hello);
            echo("<br/>");

            // Booleans
            $boolean = true;
            $boolean = false;

            $isRaining = true;
            $isWindy = false;
            $bringUmbrella = $isRaining and !$isWindy;
            var_dump($bringUmbrella);
            echo("<br/>");

            $notEqual = 75 != 89;
            var_dump($notEqual);
            echo("<br/>");
            $notEqual = 84 <> 34;
            var_dump($notEqual);
            echo("<br/>");

            // Conditionals
            $value = 96;
            if ($value < 0) {
                echo("<p>value is negative</p>");
            } elseif ($value == 0) {
                echo("<p>value is zero</p>");
            } else {
                echo("<p>value is positive</p>");
            }

            // Loops
            echo("<ul>");

            for ($i = 0; $i < 5; $i++) {
                echo("<li>" . $i . "</li>");
            }

            echo("</ul>");

            // Functions
            function sayHello($name) {
                echo("<p>Hello, " . $name . "</p>");
            }

            sayHello("Harry");

            function add($a, $b, $c) {
                $sum = $a + $b + $c;
                return $sum;
            }

            echo(add(56, 78, 1023));
            echo("<br/>");

            // Arrays
            $myArray = array(); // empty array
            $array = array(10, 20, 30, 40);
            var_dump($array);
            echo("<br/>");

            // adding elements to an array
            array_push($array, 50);
            array_push($array, 60);
            var_dump($array);
            echo("<br/>");

            // removing elements from an array
            array_pop($array);
            var_dump($array);
            echo("<br/>");
            echo("<br/>");

            // Associative Array
            $pets = array('dog' => 2, 'cat' => 5, 'bird' => 3);
            var_dump($pets);
            echo("<br/>");

            // adding a value to an associative array
            $pets['hamster'] = 2;
            var_dump($pets);
            echo("<br/>");

            // removing a value from an associative array
            unset($pets['cat']);
            var_dump($pets);
            echo("<br/>");

            // access a value from an associative array
            echo($pets['dog']);
            echo("<br/>");

            // iterating through an associative array
            echo("<ul>");

            foreach($pets as $key => $value) {
                echo("<li>" . $key . ": " . $value . "</li>");
            }

            echo("</ul>");

            // Classes and Objects
            class Person {
                private $name;
                private $age;
                private $idNumber;

                function __construct($name, $age, $idNumber) {
                    $this->name = $name;
                    $this->age = $age;
                    $this->idNumber = $idNumber;
                }

                function printInfo() {
                    echo("<p>");
                    echo("name: " . $this->name . ", ");
                    echo("age: " . $this->age . ", ");
                    echo("idNumber: " . $this->idNumber . "." );
                    echo("</p>");
                }
            }

            $bob = new Person("Bob", 78, 100);
            var_dump($bob);
            $bob->printInfo();

            $harry = new Person("Harry", 25, 101);
            $harry->printInfo();

            $fred = new Person("Fred", 28, 102);
            $fred->printInfo();
        ?>
    </body>
</html>
