package org.sonnyjava.springframework;

import java.util.List;

public class ListCoordinates implements Shape {

	private List<CoordinatePoints> lists;

	public List<CoordinatePoints> getLists() {
		return lists;
	}

	public void setLists(List<CoordinatePoints> lists) {
		this.lists = lists;
	}

	@Override
	public void showCoordinates() {
		
		System.out.println("List of Coordinates:");
		
		for(CoordinatePoints list: lists) {
			System.out.println("("+ list.getX()+ ", "+list.getY()+")" );
		}

	}

}
