package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import com.kodilla.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Not;

import java.lang.ref.Cleaner;

public class NotificationServiceTestSuite {
    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClienShouldNotReceiveNotification(){
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }
    @Test
    public void notificationShouldBeSentToAllSubscribedClients(){
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }
    @Test
    public void shouldSentOnlyOneNotificationToMultiTimeSubscriber(){
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }
    @Test
    public void unsubscribedClientShouldNotReceiveNotification(){
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}
