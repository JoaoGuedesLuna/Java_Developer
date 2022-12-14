package me.dio.contador.exception;

public class InvalidArgumentsException extends Exception{

    public InvalidArgumentsException() {
        super("O segundo parâmetro deve ser maior\nque o primeiro.");
    }

}