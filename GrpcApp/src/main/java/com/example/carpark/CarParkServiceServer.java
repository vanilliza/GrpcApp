package com.example.carpark;

import com.example.utils.fakeData.CarData;
import com.example.utils.generated.carpark.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Logger;

public class CarParkServiceServer extends carParkServiceGrpc.carParkServiceImplBase implements ServiceListener {
    private static final Logger logger = Logger.getLogger(CarParkServiceServer.class.getName());



        public void serviceAdded(ServiceEvent event) {
            System.out.println(event.getInfo().getPort());

        }


        public void serviceRemoved(ServiceEvent event) {
            System.out.println("resolved " + event.getInfo());
        }


        public void serviceResolved(ServiceEvent event) {
            System.out.println("resolved: " + event.getInfo());

            try {
                CarParkServiceServer carParkService = new CarParkServiceServer();

                int port = 50053;


                // portNumber= 50055;
                Server server = ServerBuilder.forPort(port)
                        .addService(carParkService)
                        .build()
                        .start();

                logger.info("Lighting Server started, listening on " + port);


                server.awaitTermination();

            } catch (IOException | InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public static void main(String[] args) throws IOException, InterruptedException {
            try {
                // Create a JmDNS instance
                JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());


                // Add a service listener
                jmdns.addServiceListener("_http._tcp.local.", new CarParkServiceServer());
                System.out.println("Listening");
                // Wait a bit
                Thread.sleep(30000);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    public void showStatus(carparkRequest request, StreamObserver<carParkResponse> rStreamObserver) {
        for (CarPark c : CarData.getInstance()) {
            if (c.getCarParkId() == request.getCarParkId()) {
                carParkResponse response = carParkResponse.newBuilder().setCarPark(c).build();
                rStreamObserver.onNext(response);
                rStreamObserver.onCompleted();
                return;
            }
        }
    }


    public void setFull(CarParkToUpdateRequest request, StreamObserver<carParkResponse> rStreamObserver) {
        ArrayList<CarPark> carList = CarData.getInstance();
        for (CarPark carPark : carList) {
            if (carPark.getCarParkId() == request.getDeviceId()) {
                CarData.carparkCar.clear();
                CarData.carparkCar.add(CarPark.newBuilder().setCarParkId(carPark.getCarParkId()).setLocation(carPark.getLocation()).setStatus("Full").build());
            }
        }
        for (CarPark heater : CarData.carparkCar) {
            carParkResponse response = carParkResponse.newBuilder().setCarPark(heater).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    public void setSpaces(CarParkToUpdateRequest request, StreamObserver<carParkResponse> rStreamObserver) {
        ArrayList<CarPark> carList = CarData.getInstance();
        for (CarPark carPark : carList) {
            if (carPark.getCarParkId() == request.getDeviceId()) {
                CarData.carparkCar.clear();
                CarData.carparkCar.add(CarPark.newBuilder().setCarParkId(carPark.getCarParkId()).setLocation(((CarPark) carPark).getLocation()).setStatus("Spaces").build());
            }
        }
        for (CarPark heater : CarData.carparkCar) {
            carParkResponse response = carParkResponse.newBuilder().setCarPark(heater).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    @Override
    public void allCarParks(allCarp rAllCarp, StreamObserver<carParkResponse> rStreamObserver) {
        ArrayList<CarPark> carList = CarData.getInstance();
        try {
            for (int i = 0; i < carList.size(); i++) {
                for (CarPark c : carList) {
                    if (c.getStatus().equals(rAllCarp.getStatus())) {
                        carParkResponse response = carParkResponse.newBuilder().setCarPark(c).build();

                        rStreamObserver.onNext(response);
                        Thread.sleep(1000L);
                        rStreamObserver.onCompleted();
                        return;
                    }

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rStreamObserver.onCompleted();
        }

    }


}
