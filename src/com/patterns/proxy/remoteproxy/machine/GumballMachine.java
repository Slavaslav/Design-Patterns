package com.patterns.proxy.remoteproxy.machine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private final String location;
    private final int numberGumballs;
    private State state;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        this.location = location;
        this.numberGumballs = numberGumballs;
        state = new NoQuarterState(this);
    }

    @Override
    public int getCount() {
        return numberGumballs;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public State getState() {
        return state;
    }
}