package com.patterns.proxy.remoteproxy;


import com.patterns.proxy.remoteproxy.machine.GumballMachine;
import com.patterns.proxy.remoteproxy.machine.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Objects;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        try {
            gumballMachine = new GumballMachine("MyLocation", 5);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        try {
            LocateRegistry.createRegistry(35678);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        if (Objects.nonNull(gumballMachine)) {
            try {
                Naming.rebind("//localhost:35678/gumballMachine", gumballMachine);
            } catch (RemoteException | MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}