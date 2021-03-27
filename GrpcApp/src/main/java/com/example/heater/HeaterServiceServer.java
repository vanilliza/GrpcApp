package com.example.heater;


import com.example.utils.fakeData.HeatData;
import com.example.utils.generated.heater.*;
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


public class HeaterServiceServer extends HeaterServiceGrpc.HeaterServiceImplBase implements ServiceListener {
    private static final Logger logger = Logger.getLogger(HeaterServiceServer.class.getName());



        public void serviceAdded(ServiceEvent event) {
            System.out.println(event.getInfo().getPort());

        }


        public void serviceRemoved(ServiceEvent event) {
            System.out.println("resolved " + event.getInfo());
        }


        public void serviceResolved(ServiceEvent event) {
            System.out.println("resolved: " + event.getInfo());

            try {
                HeaterServiceServer heaterService = new HeaterServiceServer();

                int port = event.getInfo().getPort();


                // portNumber= 50055;
                Server server = ServerBuilder.forPort(port)
                        .addService(heaterService)
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
                jmdns.addServiceListener("_http._tcp.local.", new HeaterServiceServer());
                System.out.println("Listening");
                // Wait a bit
                Thread.sleep(30000);
            } catch (UnknownHostException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    public void showStatus(HeaterStatusRequest request, StreamObserver<HeaterStatusResponse> rStreamObserver) {
        for (Heater heater : HeatData.getInstance()) {
            if (heater.getHeaterId() == request.getHeaterId()) {
                HeaterStatusResponse response = HeaterStatusResponse.newBuilder().setHeater(heater).build();
                rStreamObserver.onNext(response);
                rStreamObserver.onCompleted();
                return;
            }
        }
    }

    public void setTempatureHigh(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
        ArrayList<Heater> heatList = HeatData.getInstance();
        for (int i = 0; i < heatList.size(); i++) {
            if (heatList.get(i).getHeaterId() == request.getDeviceId()) {
                Heater heater_rec = (Heater) heatList.get(i);
                HeatData.heat.clear();
                HeatData.heat.add(Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice(heater_rec.getDevice()).setDeviceLocation(heater_rec.getDeviceLocation()).setStatus("High").setExactTemp(heater_rec.getExactTemp()).build());
            }
        }
        for (Heater heater : HeatData.heat) {
            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    public void setTempaturelow(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
        ArrayList<Heater> heatList = HeatData.getInstance();
        for (int i = 0; i < heatList.size(); i++) {
            if (heatList.get(i).getHeaterId() == request.getDeviceId()) {
                Heater heater_rec = (Heater) heatList.get(i);
                HeatData.heat.clear();
                HeatData.heat.add(Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice(heater_rec.getDevice()).setDeviceLocation(heater_rec.getDeviceLocation()).setStatus("Low").setExactTemp(heater_rec.getExactTemp()).build());
            }
        }
        for (Heater heater : HeatData.heat) {
            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    public void setOff(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
        ArrayList<Heater> heatList = HeatData.getInstance();
        for (int i = 0; i < heatList.size(); i++) {
            if (heatList.get(i).getHeaterId() == request.getDeviceId()) {
                Heater heater_rec = (Heater) heatList.get(i);
                HeatData.heat.clear();
                HeatData.heat.add(Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice("Off").setDeviceLocation(heater_rec.getDeviceLocation()).setStatus(heater_rec.getStatus()).setExactTemp(heater_rec.getExactTemp()).build());
            }
        }
        for (Heater heater : HeatData.heat) {
            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    public void setOn(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
        ArrayList<Heater> heatList = HeatData.getInstance();
        for (int i = 0; i < heatList.size(); i++) {
            if (heatList.get(i).getHeaterId() == request.getDeviceId()) {
                Heater heater_rec = (Heater) heatList.get(i);
                HeatData.heat.clear();
                HeatData.heat.add(Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice("On").setDeviceLocation(heater_rec.getDeviceLocation()).setStatus(heater_rec.getStatus()).setExactTemp(heater_rec.getExactTemp()).build());
            }
        }
        for (Heater heater : HeatData.heat) {
            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    public void setExactTemp(exact_temp requestExact_update, StreamObserver<HeaterDetailResponse> rStreamObserver) {
        ArrayList<Heater> heatList = HeatData.getInstance();
        for (int i = 0; i < heatList.size(); i++) {
            if (heatList.get(i).getHeaterId() == requestExact_update.getHeaterId()) {
                Heater heater_rec = (Heater) heatList.get(i);
                HeatData.heat.clear();
                int exact = requestExact_update.getExactTemp();
                HeatData.heat.add(Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice(heater_rec.getDevice()).setDeviceLocation(heater_rec.getDeviceLocation()).setStatus(heater_rec.getStatus()).setExactTemp(exact).build());

            }


        }
        for (Heater heater : HeatData.heat) {
            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }


    }

}
