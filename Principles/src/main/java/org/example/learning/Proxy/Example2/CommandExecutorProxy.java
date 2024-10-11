package org.example.learning.Proxy.Example2;

public class CommandExecutorProxy implements CommandExecutor{

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if("jibran".equals(user) && "987#@10".equals(pwd)) isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
