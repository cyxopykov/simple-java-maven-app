package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello Work!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());

	for(int i=1;i<=10;i++){
        	System.out.println(i);
    	}
    }

    private final String getMessage() {
        return message;
    }

}
