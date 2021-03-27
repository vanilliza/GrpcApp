package com.example.lights;

import com.example.utils.generated.lights.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class LightsServiceServer extends LightsServiceGrpc.LightsServiceImplBase implements ServiceListener {

    private static final Logger logger = Logger.getLogger(LightsServiceServer.class.getName());



        public void serviceAdded(ServiceEvent event) {
            System.out.println( event.getInfo().getPort());

        }


        public void serviceRemoved(ServiceEvent event) {
            System.out.println("resolved " +event.getInfo());
        }


        public void serviceResolved(ServiceEvent event) {
            System.out.println("resolved: " + event.getInfo());

            try {
                LightsServiceServer lightServer = new LightsServiceServer();

                int port = event.getInfo().getPort();


                // portNumber= 50055;
                Server server = ServerBuilder.forPort(port)
                        .addService(lightServer)
                        .build()
                        .start();

                logger.info("Lighting Server started, listening on " + port);


                server.awaitTermination();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        public static void main(String[] args) throws IOException, InterruptedException {
            try {
                // Create a JmDNS instance
                JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());


                // Add a service listener
                jmdns.addServiceListener("_http._tcp.local.", new LightsServiceServer());
                System.out.println("Listening");
                // Wait a bit
                Thread.sleep(30000);
            } catch (UnknownHostException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    public void showStatus(light_status_request request, StreamObserver<lightStatusResponse> rStreamObserver) {
        for(Lights light : LightData.getInstance()) {
            if(light.getLightId() == request.getLightId()) {
                lightStatusResponse response = lightStatusResponse.newBuilder().setLights(light).build();
                rStreamObserver.onNext(response);
                rStreamObserver.onCompleted();
                return;
            }
        }
    }
    public void lightsOn(lightToUpdateRequest request, StreamObserver<lightDetailResponse> rStreamObserver) {
        ArrayList<Lights> lightsList = LightData.getInstance();
        for(int i=0; i<lightsList.size(); i++) {
            if(lightsList.get(i).getLightId() == request.getLightId()) {
                Lights light_rec = (Lights) lightsList.get(i);
                LightData.lights.clear();
                LightData.lights.add(Lights.newBuilder().setLightId(light_rec.getLightId()).setLightLocation(light_rec.getLightLocation()).setLightStatus("On").build());
            }
        }
        for(Lights light : LightData.lights) {
            lightDetailResponse response = lightDetailResponse.newBuilder().setLights(light).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }
    public void lightsOff(lightToUpdateRequest request, StreamObserver<lightDetailResponse> rStreamObserver) {
        ArrayList<Lights> lightsList = LightData.getInstance();
        for(int i=0; i<lightsList.size(); i++) {
            if(lightsList.get(i).getLightId() == request.getLightId()) {
                Lights light_rec = (Lights) lightsList.get(i);
                LightData.lights.clear();
                LightData.lights.add(Lights.newBuilder().setLightId(light_rec.getLightId()).setLightLocation(light_rec.getLightLocation()).setLightStatus("OFF").build());
            }
        }
        for(Lights light : LightData.lights) {
            lightDetailResponse response = lightDetailResponse.newBuilder().setLights(light).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }




}
