package com.example.demo;

public class SightTest {
    public static void main(String[] args) {
        KeelungSightsCrawler crawler = new KeelungSightsCrawler();
        Sight [] sights = crawler.getItems("");
        for (Sight s: sights) {
            System.out.println(s);
        }
    }
}
