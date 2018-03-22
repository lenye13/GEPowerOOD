package com.gmopa.oodesign;

/**
 * @author Germain Mopa
 *
 */
public class Room implements IRoom {
	
	private String 	wallColor;
	private String 	wallTexture;
	private RoomFloor floor;
	private short 	numberOfTv;
	private boolean isHeated;

	private boolean isCooled;
	private String 	coolingMethod;
	private double 	floorLength;
	private double 	floorWidth;
	
	
	public Room(String wallColor, String wallTexture, String floorColor, 
			String floorMaterial, String floorCondition, Short numberOfTv, 
			String coolingMethod, double length, double width) {
		
		this.setWallColor(wallColor);
		this.setWallTexture(wallTexture);
		this.setNumberOfTv(numberOfTv);
		this.setFloorLength(length);
		this.floorWidth = width;
		this.floor = new RoomFloor(floorMaterial, floorColor, floorCondition);
		this.setCoolingMethod(coolingMethod);
	}
	
	/**
	 * @return the isHeated
	 */
	public boolean isHeated() {
		return isHeated;
	}

	/**
	 * @param isHeated the isHeated to set
	 */
	private void setHeated(boolean isHeated) {
		this.isHeated = isHeated;
	}
	
	/**
	 * @return the isCooled
	 */
	public boolean isCooled() {
		return isCooled;
	}

	/**
	 * @param isCooled the isCooled to set
	 */
	public void setCooled(boolean isCooled) {
		this.isCooled = isCooled;
	}

	/**
	 * @param floor condition the floor to set
	 */
	public void updateFloorCondition(String condition) {
		this.floor.condition = condition;
	}
	
	/**
	 * @param floor color the floor to set
	 */
	public void updateFloorColor(String color) {
		this.floor.color = color;
	}
	
	/**
	 * @param floor condition the floor to set
	 */
	public void updateFloorMaterial(String material) {
		this.floor.material = material;
	}

	/**
	 * @return the coolingMethod
	 */
	public String getCoolingMethod() {
		return coolingMethod;
	}

	/**
	 * @param coolingMethod the coolingMethod to set
	 */
	public void setCoolingMethod(String coolingMethod) {
		
		// set isHeated, isCooled, and coolingMethod
		// if we pass in a cooling method, then the room is cooled and has a cooling 
		// method, otherwise the rooom is heated
		if(coolingMethod==null || coolingMethod.equals("")){
			this.setHeated(true);
			this.setCooled(false);
			this.coolingMethod = null;
		}
		else{
			this.setHeated(false);
			this.setCooled(true);
			this.coolingMethod = coolingMethod;
		}
	}

	/**
	 * @return the floorWidth
	 */
	public double getFloorWidth() {
		return floorWidth;
	}

	/**
	 * @param floorWidth the floorWidth to set
	 */
	public void setFloorWidth(double floorWidth) {
		this.floorWidth = floorWidth;
	}

	/**
	 * @return the floorLength
	 */
	public double getFloorLength() {
		return floorLength;
	}

	/**
	 * @param floorLength the floorLength to set
	 */
	public void setFloorLength(double floorLength) {
		this.floorLength = floorLength;
	}

	/**
	 * @return the numberOfTv
	 */
	public short getNumberOfTv() {
		return numberOfTv;
	}

	/**
	 * @param numberOfTv the numberOfTv to set
	 */
	public void setNumberOfTv(short numberOfTv) {
		this.numberOfTv = numberOfTv;
	}

	/**
	 * @return the wallColor
	 */
	public String getWallColor() {
		return wallColor;
	}

	/**
	 * @param wallColor the wallColor to set
	 */
	public void setWallColor(String wallColor) {
		this.wallColor = wallColor;
	}

	/* (non-Javadoc)
	 * @see com.gmopa.oodesign.IRoom#getRoomArea
	 */
	@Override
	public double getRoomArea() {
		return (this.getFloorLength() * this.getFloorWidth());
	}
	
	/* 
	 * return the details on the flooring of the room
	 */
	public String getFloorDetails(){
		return this.floor.toString();
	}
	
	/* 
	 * return the details on the flooring of the room
	 */
	public String getRoomTemDetails(){
		
		if(isHeated)
			return "This room is heated";
		else 
			return "This is room is cooled with " + this.coolingMethod;
	}
	
	
	/**
	 * @return the wallTexture
	 */
	public String getWallTexture() {
		return wallTexture;
	}

	/**
	 * @param wallTexture the wallTexture to set
	 */
	public void setWallTexture(String wallTexture) {
		this.wallTexture = wallTexture;
	}


	/*
	 * Private inner method to hold information about the room floor
	 */
	private class RoomFloor {
		private String material;
		private String color;
		private String condition;

		public RoomFloor(String material, String color, String condition) {
			setMaterial(material);
			setColor(color);
			setCondition(condition);
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getCondition() {
			return condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Room floor detail: material=" + getMaterial() + ", color=" + getColor()
					+ ", condition=" + getCondition();
		}
		
	}
	
}
