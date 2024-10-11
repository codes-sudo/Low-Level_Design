package org.example.learning.Proxy.Example2;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws Exception {
        // some heavy Tasks
        Runtime.getRuntime().exec(cmd);
        System.out.println("Runtime Command Executed");
    }
}
