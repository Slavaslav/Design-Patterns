package com.patterns.proxy.remoteproxy.monitor;


import com.patterns.proxy.remoteproxy.machine.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}