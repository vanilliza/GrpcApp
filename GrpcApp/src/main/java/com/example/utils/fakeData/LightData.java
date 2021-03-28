package com.example.utils.fakeData;

import com.example.utils.generated.lights.Lights;

import java.util.ArrayList;

public class LightData extends ArrayList<Lights>{
public static LightData lights;

	public static LightData getInstance() {
		if(lights == null) {
			lights = new LightData();
		}
		return lights;
	}

	public LightData() {
		this.add(Lights.newBuilder().setLightId(1).setLightLocation("Behind Building 1").setLightStatus("On").build());
		this.add(Lights.newBuilder().setLightId(2).setLightLocation("Behind Building 2").setLightStatus("On").build());
		this.add(Lights.newBuilder().setLightId(3).setLightLocation("Behind Building 3").setLightStatus("On").build());
		this.add(Lights.newBuilder().setLightId(4).setLightLocation("Behind Building 4").setLightStatus("On").build());
		this.add(Lights.newBuilder().setLightId(5).setLightLocation("Behind Building 5").setLightStatus("On").build());
		this.add(Lights.newBuilder().setLightId(6).setLightLocation("Room 1").setLightStatus("off").build());
		this.add(Lights.newBuilder().setLightId(7).setLightLocation("Room 2").setLightStatus("Off").build());
		this.add(Lights.newBuilder().setLightId(8).setLightLocation("Behind Building 1").setLightStatus("On").build());
		this.add(Lights.newBuilder().setLightId(9).setLightLocation("Behind Building 1").setLightStatus("Off").build());
		this.add(Lights.newBuilder().setLightId(10).setLightLocation("Behind Building 1").setLightStatus("On").build());
		this.add(Lights.newBuilder().setLightId(11).setLightLocation("Behind Building 1").setLightStatus("On").build());
	}

}
