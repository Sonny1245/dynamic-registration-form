package org.sonnyjava.springframework;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component("center")
public class CenterPoints implements Shape {

	@Resource(name="coordinate2")
	private CoordinatePoints centerPoint;

	@Autowired
	private MessageSource messageSource;

	public CoordinatePoints getCenterPoint() {
		return centerPoint;
	}

	public void setCenterPoint(CoordinatePoints centerPoint) {
		this.centerPoint = centerPoint;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void showCoordinates() {

		System.out.println(this.messageSource.getMessage("showCoordinates.circle",
				null, "Default Message", null));
		System.out.print(this.messageSource.getMessage("showCoordinates.points", new Object[] 
				{getCenterPoint().getX(),getCenterPoint().getY()}, 
				"Default Message", null));
		System.out.println();
		//System.out.println("(" + getCenterPoint().getX() + ", " + getCenterPoint().getY() + ")");

	}

}
