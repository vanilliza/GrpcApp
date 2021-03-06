package com.example.tv;


import com.example.utils.fakeData.*;
import com.example.utils.generated.tv.*;
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


public class TvServiceServer extends TVServiceGrpc.TVServiceImplBase implements ServiceListener {

    private static final Logger logger = Logger.getLogger(TvServiceServer.class.getName());



        public void serviceAdded(ServiceEvent event) {
            System.out.println(event.getInfo().getPort());
        }


        public void serviceRemoved(ServiceEvent event) {
            System.out.println("resolved " + event.getInfo());
        }


        public void serviceResolved(ServiceEvent event) {
            System.out.println("resolved: " + event.getInfo());

            try {
                TvServiceServer tvService = new TvServiceServer();

                int port = event.getInfo().getPort();


                // portNumber= 50055;
                Server server = ServerBuilder.forPort(port)
                        .addService(tvService)
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
                jmdns.addServiceListener("_http._tcp.local.", new TvServiceServer());
                System.out.println("Listening");
                // Wait a bit
                Thread.sleep(30000);
            } catch (UnknownHostException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    public void showStatus(TVStatusRequest request, StreamObserver<TVStatusResponse> rStreamObserver) {
        for (TV tele : TvData.getInstance()) {
            if (tele.getTvId() == request.getTvId()) {
                TVStatusResponse response = TVStatusResponse.newBuilder().setTv(tele).build();
                rStreamObserver.onNext(response);
                rStreamObserver.onCompleted();
                return;
            }
        }
    }

    public void tVOn(update_request request, StreamObserver<TVDetailResponse> rStreamObserver) {
        ArrayList<TV> tvList = TvData.getInstance();
        for (int i = 0; i < tvList.size(); i++) {
            if (tvList.get(i).getTvId() == request.getTvId()) {
                TV Tv_rec = (TV) tvList.get(i);
                TvData.tvdata.clear();
                TvData.tvdata.add(TV.newBuilder().setTvId(Tv_rec.getTvId()).setDeviceLocation(Tv_rec.getDeviceLocation()).setStatus("On").setExact(Tv_rec.getExact()).build());
            }
        }
        for (TV tv : TvData.tvdata) {
            TVDetailResponse response = TVDetailResponse.newBuilder().setTv(tv).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    public void tVOff(update_request request, StreamObserver<TVDetailResponse> rStreamObserver) {
        ArrayList<TV> tvList = TvData.getInstance();
        for (int i = 0; i < tvList.size(); i++) {
            if (tvList.get(i).getTvId() == request.getTvId()) {
                TV Tv_rec = (TV) tvList.get(i);
                TvData.tvdata.clear();
                TvData.tvdata.add(TV.newBuilder().setTvId(Tv_rec.getTvId()).setDeviceLocation(Tv_rec.getDeviceLocation()).setStatus("Off").setExact(Tv_rec.getExact()).build());
            }
        }
        for (TV tv : TvData.tvdata) {
            TVDetailResponse response = TVDetailResponse.newBuilder().setTv(tv).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }
    }

    public void setExactVolume(exact_update requestExact_update, StreamObserver<TVDetailResponse> rStreamObserver) {
        ArrayList<TV> tvList = TvData.getInstance();
        for (int i = 0; i < tvList.size(); i++) {
            if (tvList.get(i).getTvId() == requestExact_update.getTvId()) {
                TV Tv_rec = (TV) tvList.get(i);
                TvData.tvdata.clear();
                int exact = requestExact_update.getExactRequest();
                TvData.tvdata.add(TV.newBuilder().setTvId(Tv_rec.getTvId()).setDeviceLocation(Tv_rec.getDeviceLocation()).setStatus(Tv_rec.getDeviceLocation()).setExact(exact).build());

            }


        }
        for (TV tv : TvData.tvdata) {
            TVDetailResponse response = TVDetailResponse.newBuilder().setTv(tv).build();
            rStreamObserver.onNext(response);
            rStreamObserver.onCompleted();
            return;
        }


    }


}
