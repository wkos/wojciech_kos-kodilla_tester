package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new Book("John Stewart", "The last chance");
        System.out.println(book);
        BookHacked bookHacked = new BookHacked("Talkien", "King of the ring");
        System.out.println(bookHacked);

        bookHacked.modifyTitle("Mary");
        System.out.println(book);
        System.out.println(bookHacked);

        BookRecord bookRecord = new BookRecord("autor", "tytuł", 1999);
        System.out.println(bookRecord);
    }
}
