package command;

import java.util.Scanner;

public class Main {
	private static Boolean cont = true;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while (cont) {
			String command = scan.nextLine();
			if (command.startsWith("hello")) {
				if (command.replaceAll("\\s","").toLowerCase().equals("hello")) {
					helloWorld();
				}  else {
					helloWorld(command.substring(5));
				}
			} else if (command.toLowerCase().startsWith("help")) {
				help();
			} else if (command.toLowerCase().startsWith("exit")||command.toLowerCase().startsWith("quit ")) {
				exit();
			} else {
				error();
			}
		}
		System.out.println("Exiting.");
		scan.close();
	}
	
	private static void exit() {
		cont = false;	
	}

	private static void helloWorld() {
		System.out.println("Hello, world!");
	}
	
	private static void helloWorld(String string) {
		System.out.println("Hello," + string + "!"); 
	}
	
	private static void error() {
		System.out.println("Unrecognised command, help for help");
	}
	
	private static void help() {
		System.out.printf("Commands: \nhelp - sends this message \nhello - returns Hello, World; any modifiers to it replace World with the modifier \nexit/quit - exits the program\n");
	}

}
