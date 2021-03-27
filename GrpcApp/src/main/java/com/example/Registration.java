package com.example;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class Registration{


public static void main(String[] args) throws InterruptedException {

        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo serviceInfo = ServiceInfo.create(
                    "_http._tcp.local.",
                    "example",
                    50055,
                    "path=index.html");
            jmdns.registerService(serviceInfo);
            System.out.println("Registration Service Start ! ");
            System.out.println("This is for Github");
        } catch (IOException e) {
            System.out.println(e.getMessage());





        }
    }
}
