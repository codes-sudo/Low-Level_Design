package org.example.learning.Proxy.Example2;

public class Main {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("jibran", "wrong_pwd");
        try {

            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rfa");
        } catch (Exception e) {
            System.out.println("Exception message: "+ e.getMessage());
        }
    }
}
