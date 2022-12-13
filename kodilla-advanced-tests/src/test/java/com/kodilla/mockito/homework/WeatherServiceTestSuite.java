package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.when;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);
    Location location4 = Mockito.mock(Location.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Client client4 = Mockito.mock(Client.class);
    WeatherMessage message = Mockito.mock(WeatherMessage.class);

    @BeforeEach
    public void intializeSubscribersAndLocations(){
        weatherService.addSubscriber(location1, client1);
        weatherService.addSubscriber(location1, client2);
        weatherService.addSubscriber(location2, client1);
        weatherService.addSubscriber(location2, client2);
        weatherService.addSubscriber(location3, client1);
        weatherService.addSubscriber(location3, client3);
    }

    @Test
    public void subscriberShouldReceiveMessagesFromHisLocation(){
        weatherService.sendToLocation(message, location1);
        Mockito.verify(client1, Mockito.times(1)).receiveMessage(message);
        Mockito.verify(client2, Mockito.times(1)).receiveMessage(message);
    }

    @Test
    public void subscriberNotSubscribingLocationShouldNotReceiveMessageFromThisLocationa(){
        weatherService.sendToLocation(message, location1);
        Mockito.verify(client3, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void shouldNotReceiveMessagesFromLocationAfterUnsubscribing(){
        weatherService.removeSubscriptionFromClient(client1, location2);
        weatherService.sendToLocation(message, location2);
        Mockito.verify(client1, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void eachSubscriberShouldReceiveMessegeSentToAllSubscribers(){
        weatherService.sendToAll(message);
        Mockito.verify(client1, Mockito.times(1)).receiveMessage(message);
        Mockito.verify(client2, Mockito.times(1)).receiveMessage(message);
        Mockito.verify(client3, Mockito.times(1)).receiveMessage(message);
    }

    @Test
    public void shouldNotReceiveMessagesFromAllLocationsAfterRemovingSubscriber(){
        weatherService.removeSubscriber(client1);
        weatherService.sendToAll(message);
        Mockito.verify(client1, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void shouldNotReceiveMessagesFromUnsubscribedLocation(){
        weatherService.removeSubscriptionFromClient(client1, location2);
        weatherService.sendToLocation(message, location2);
        Mockito.verify(client1, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void shouldNotReceiveMessagesFromNotSubscribedLocation(){
        weatherService.sendToLocation(message, location1);
        Mockito.verify(client3, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void locationSubscribersShouldNotReceiveMessagesFromRemovedLocation(){
        weatherService.removeLocation(location1);
        weatherService.sendToLocation(message, location1);
        Mockito.verify(client1, Mockito.never()).receiveMessage(message);
        Mockito.verify(client2, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void clientWithNoSubscriptionShouldNotReceiveMessagesFromLocation(){
        weatherService.sendToLocation(message, location2);
        Mockito.verify(client4, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void clientWithNoSubscriptionShouldNotReceiveMessagesSentToAllLocations(){
        weatherService.sendToAll(message);
        Mockito.verify(client4, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void clientShouldNotReceiveMessagesFromEmptyLocation(){
        weatherService.sendToLocation(message, location4);
        Mockito.verify(client1, Mockito.never()).receiveMessage(message);
        Mockito.verify(client2, Mockito.never()).receiveMessage(message);
        Mockito.verify(client3, Mockito.never()).receiveMessage(message);
        Mockito.verify(client4, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void clientShouldReceiveTwoMessagesSentToAllLocationsTwice(){
        weatherService.sendToAll(message);
        weatherService.sendToAll(message);
        Mockito.verify(client1, Mockito.times(2)).receiveMessage(message);
    }

    @Test
    public void clientShouldReceiveTwoMessagesWhenSentToTwoClientsLocations(){
        weatherService.sendToLocation(message, location1);
        weatherService.sendToLocation(message, location2);
        Mockito.verify(client1, Mockito.times(2)).receiveMessage(message);
    }

    @Test
    public void clientShouldNotReceiveMessagesSentToNotHisLocations(){
        weatherService.sendToLocation(message, location3);
        weatherService.sendToLocation(message, location4);
        Mockito.verify(client2, Mockito.never()).receiveMessage(message);
    }

    @Test
    public void clientShouldReceiveThreeMessagesSentThreeTimesFromHisLocation(){
        for(int i = 0; i < 3; i++){
            weatherService.sendToLocation(message, location1);
        }
        Mockito.verify(client1, Mockito.times(3)).receiveMessage(message);
    }

    @Test
    public void removingSubscriptionFromLocationNotPresentInMapShouldPass(){
        weatherService.removeSubscriptionFromClient(client1, location4);
    }

    @Test
    public void removingSubscriptionFromClientWithoutLocationShouldPass(){
        weatherService.removeSubscriptionFromClient(client2, location3);
    }
}
