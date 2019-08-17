/**
 * Created by brittniwatkins on 11/28/16.
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HelloWorldRunner {

    public static void main(String[] args) throws Exception {
        String inputFile = null;

        if (args.length > 0) {
            inputFile = args[0];
        }

        InputStream inputStream = System.in;

        if (inputFile != null) {
            inputStream = new FileInputStream(inputFile);
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String expression = bufferedReader.readLine();
        int line = 1;

        HelloWorldParser parser = new HelloWorldParser(null);
        parser.setBuildParseTree(false);

        while (expression != null) {
            ANTLRInputStream input = new ANTLRInputStream(expression + "\n");
            HelloWorldLexer lexer = new HelloWorldLexer(input);
            lexer.setLine(line);
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser.setInputStream(tokens);
            parser.prog();
            expression = bufferedReader.readLine();
            line++;
        }
    }
}
