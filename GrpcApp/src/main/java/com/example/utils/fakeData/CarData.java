package com.example.utils.fakeData;

import com.example.utils.generated.carpark.CarPark;

import java.util.ArrayList;


public class CarData extends ArrayList<CarPark>{

	public static CarData carparkCar;

	public static CarData getInstance() {
		if(carparkCar == null) {
			carparkCar = new CarData();
		}
		return carparkCar;

	}
	public CarData() {
		this.add(CarPark.newBuilder().setCarParkId(1).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarPark.newBuilder().setCarParkId(2).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarPark.newBuilder().setCarParkId(3).setStatus("Full").setLocation("Behind Building 4").build());
		this.add(CarPark.newBuilder().setCarParkId(4).setStatus("Full").setLocation("Behind Building 3").build());
		this.add(CarPark.newBuilder().setCarParkId(5).setStatus("Full").setLocation("Behind Building 2").build());
		this.add(CarPark.newBuilder().setCarParkId(6).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarPark.newBuilder().setCarParkId(7).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarPark.newBuilder().setCarParkId(10).setStatus("Full").setLocation("Behind Building 6").build());
		this.add(CarPark.newBuilder().setCarParkId(11).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarPark.newBuilder().setCarParkId(12).setStatus("Spaces").setLocation("Behind Building 1").build());
		this.add(CarPark.newBuilder().setCarParkId(13).setStatus("Spaces").setLocation("Behind Building 1").build());
		this.add(CarPark.newBuilder().setCarParkId(14).setStatus("Spaces").setLocation("Behind Building 1").build());
	}
}
