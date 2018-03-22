/**
 * 
 */
package com.gmopa.oodesign;

/**
 * @author Germain Mopa
 *
 */
public class Kitchen extends Room {
	private short numberOfAppliances;
	
	public Kitchen(String wallColor, String wallTexture, String floorColor, 
			String floorMaterial, String floorCondition, Short numberOfTv, 
			String coolingMethod, double length, double width, short numAppliances) {
		
		super(wallColor, wallTexture, floorColor, floorMaterial, floorCondition, 
				numberOfTv, coolingMethod, length, width);
		this.setNumberOfAppliances(numAppliances);
	}

	/**
	 * @return the numberOfAppliances
	 */
	public short getNumberOfAppliances() {
		return numberOfAppliances;
	}

	/**
	 * @param numberOfAppliances the numberOfAppliances to set
	 */
	public void setNumberOfAppliances(short numberOfAppliances) {
		this.numberOfAppliances = numberOfAppliances;
	}
}
