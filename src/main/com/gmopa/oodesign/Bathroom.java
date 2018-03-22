/**
 * 
 */
package com.gmopa.oodesign;

/**
 * @author Germain Mopa
 *
 */
public class Bathroom extends Room {
	private boolean isFullBath;

	public Bathroom(String wallColor, String wallTexture, String floorColor, 
			String floorMaterial, String floorCondition, short numberOfTv, 
			String coolingMethod, double length, double width, boolean isFullBath){
		
		super(wallColor, wallTexture, floorColor, floorMaterial, floorCondition, numberOfTv, coolingMethod, length, width);
		this.setFullBath(isFullBath);
	}
	/**
	 * @return the isFullBath
	 */
	public boolean isFullBath() {
		return isFullBath;
	}

	/**
	 * @param isFullBath the isFullBath to set
	 */
	public void setFullBath(boolean isFullBath) {
		this.isFullBath = isFullBath;
	}
}
