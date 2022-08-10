package org.sonnyjava.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service("rectangle")
public class RectangularPoints implements Shape {

	@Autowired
	@Qualifier("coordinate1")
	private CoordinatePoints coordinatesA;
	
	@Autowired
	@Qualifier("coordinate2")
	private CoordinatePoints coordinatesB;
	
	@Autowired
	@Qualifier("coordinate3")
	private CoordinatePoints coordinatesC;
	
	@Autowired
	private MessageSource messageSource;

	
	  public CoordinatePoints getCoordinatesA() { return coordinatesA; }
	  
	  public void setCoordinatesA(CoordinatePoints coordinatesA) {
	  this.coordinatesA = coordinatesA; }
	  
	  public CoordinatePoints getCoordinatesB() { return coordinatesB; }
	  
	  public void setCoordinatesB(CoordinatePoints coordinatesB) {
	  this.coordinatesB = coordinatesB; }
	  
	  public CoordinatePoints getCoordinatesC() { return coordinatesC; }
	  
	  public void setCoordinatesC(CoordinatePoints coordinatesC) {
	  this.coordinatesC = coordinatesC; }
	 
	@Override
	public void showCoordinates() {
		
		System.out.println(this.messageSource.getMessage("showCoordinates.rectangle", null,
				"Defaul Message", null));
		System.out.println(this.messageSource.getMessage("showCoordinates.pointsRecA", 
		new Object[] {getCoordinatesA().getX(),getCoordinatesA().getY()}, "Defaul Message", null));
		
		System.out.println(this.messageSource.getMessage("showCoordinates.pointsRecB", 
		new Object[] {getCoordinatesB().getX(),getCoordinatesB().getY()}, "Defaul Message", null));
		
		System.out.println(this.messageSource.getMessage("showCoordinates.pointsRecC", 
		new Object[] {getCoordinatesC().getX(),getCoordinatesC().getY()}, "Defaul Message", null));
		//System.out.println("Coordinate A = ("+getCoordinatesA().getX()+ ", "+getCoordinatesA().getY()+")");
		//System.out.println("Coordinate B = ("+getCoordinatesB().getX()+ ", "+getCoordinatesB().getY()+")");
		//System.out.println("Coordinate C = ("+getCoordinatesC().getX()+ ", "+getCoordinatesC().getY()+")");
		
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
