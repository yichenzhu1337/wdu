package com.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverMain {

    public static void main(String args[]) {
/*        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("Bryan");
        Client client2 = new Client("John");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();*/

        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message 1!");
        phoneClient.addMessage("Here is a new message 2!");
        phoneClient.addMessage("Here is a new message 3!");

        tabletClient.addMessage("Another new message 1!");
        tabletClient.addMessage("Another new message 2!");
        tabletClient.addMessage("Another new message 3!");
    }
}

class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }

}

class Client implements Observer {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name);
    }

}