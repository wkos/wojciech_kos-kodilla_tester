package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {
    Map<Location, Set<Client>> clients = new HashMap<>();

    public void sendToAll(WeatherMessage message) {
        Set<Client> clientSet = new HashSet<>();
        for (Location location : this.clients.keySet()) {
            for (Client client : this.clients.get(location)) {
                clientSet.add(client);
            }
        }
        clientSet.stream().forEach(cl -> cl.receiveMessage(message));
    }

    ;

    public void sendToLocation(WeatherMessage message, Location location) {
        this.clients.entrySet().stream()
                .filter(cl -> cl.getKey().equals(location))
                .forEach(cl -> cl.getValue().forEach(client -> client.receiveMessage(message)));
    }

    public void addSubscriber(Location location, Client client) {
        Set<Client> clientsInLocation;
        if (this.clients.get(location) != null) {
            clientsInLocation = this.clients.get(location);
        } else {
            clientsInLocation = new HashSet<>();
        }
        clientsInLocation.add(client);
        this.clients.put(location, clientsInLocation);
    }

    public void removeSubscriber(Client client) {
        for (Location location : this.clients.keySet()) {
            this.clients.get(location).remove(client);
        }
    }

    public void removeSubscriptionFromClient(Client client, Location location) {
        if (clients.containsKey(location)) {
            clients.get(location).remove(client);
        }
    }

    public void removeLocation(Location location) {
        if (clients.containsKey(location)) {
            clients.remove(location);
        }
    }
}
