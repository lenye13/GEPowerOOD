/**
 * 
 */
package com.gmopa.oodesign;

/**
 * @author Germain Mopa
 *
 */
public class Bedroom extends Room {
	private short numberOfBeds;
	private Bathroom bathroom;
	
	public Bedroom(String wallColor, String wallTexture, String floorColor, 
			String floorMaterial, String floorCondition, short numberOfTv, 
			String coolingMethod, double length, double width, short numberOfBeds, Bathroom bathroom){
		
		super(wallColor, wallTexture, floorColor, floorMaterial, floorCondition, 
				numberOfTv, coolingMethod, length, width);
		this.setNumberOfBeds(numberOfBeds);
		this.setBathroom(bathroom);
		
	}

	/**
	 * @return the numberOfBeds
	 */
	public short getNumberOfBeds() {
		return numberOfBeds;
	}

	/**
	 * @param numberOfBeds the numberOfBeds to set
	 */
	public void setNumberOfBeds(short numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	/**
	 * @return the bathroom
	 */
	public Bathroom getBathroom() {
		return bathroom;
	}

	/**
	 * @param bathroom the bathroom to set
	 */
	public void setBathroom(Bathroom bathroom) {
		this.bathroom = bathroom;
	}
	
	/**
	 * @return the bathroom
	 */
	public boolean hasBathroomAttached(){
		
		if(getBathroom() != null)
			return true;
		else
			return false;
	}
}
