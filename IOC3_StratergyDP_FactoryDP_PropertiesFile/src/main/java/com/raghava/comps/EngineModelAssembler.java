// TARGET CLASS
package com.raghava.comps;

public class EngineModelAssembler {
	
	@SuppressWarnings("unused")
	private Vehicle vehicle;


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void EngineAssemble(Vehicle veh) {
		veh.Engine();
	}

}
