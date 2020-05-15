grammar helloWorld;

prog:    (expr NEWLINE)*;

expr:    'Hello World ' NAME
          {
            System.out.println("Hello there, " + $NAME.text);
          };

NAME:    'bob' | 'joe' | 'fred';
NEWLINE: [\r\n]+;