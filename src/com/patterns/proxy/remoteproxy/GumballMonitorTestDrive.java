package com.patterns.proxy.remoteproxy;


import com.patterns.proxy.remoteproxy.machine.GumballMachineRemote;
import com.patterns.proxy.remoteproxy.monitor.GumballMonitor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Objects;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {

        GumballMachineRemote gumballMachine = null;
        try {
            gumballMachine = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1:35678/gumballMachine");
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }

        if (Objects.nonNull(gumballMachine)) {
            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
            gumballMonitor.report();
        }
    }
}
