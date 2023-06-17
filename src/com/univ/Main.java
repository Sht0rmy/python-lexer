package com.univ;

import com.univ.lexer.Lexer;
import com.univ.lexer.token.Token;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filepath = "src/com/univ/test.py";

        Lexer lexer = new Lexer();
        try {
            List<Token> tokens = lexer.tokenize(filepath);
            for (Token token : tokens) {
                System.out.println(token.toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
