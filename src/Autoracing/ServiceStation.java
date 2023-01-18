package Autoracing;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    public void addTransportToQueue(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в ТО.");
        } else {
            transportQueue.add(transport);
        }
    }
    public void doMaintenance() {
        Transport transport = transportQueue.poll();
        for (Transport transport1 : transportQueue)
        if (transport != null) {
            transport.getMechanics().get(0).doMaintenance();
        }
    }
}


