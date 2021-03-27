package com.example.utils.fakeData;

import com.example.utils.generated.aircon.AirConditioning;

import java.util.ArrayList;

public class AirData extends ArrayList<AirConditioning>{

	public static AirData airConditioning;

	public static AirData getInstance() {
		if(airConditioning == null) {
			airConditioning = new AirData();
		}
		return airConditioning;

	}
	public AirData() {
		this.add(AirConditioning.newBuilder().setDeviceId(1).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(2).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(3).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(4).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(5).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(6).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(7).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(8).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(9).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(10).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(11).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(12).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(13).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(14).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AirConditioning.newBuilder().setDeviceId(15).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
	}
	

}
