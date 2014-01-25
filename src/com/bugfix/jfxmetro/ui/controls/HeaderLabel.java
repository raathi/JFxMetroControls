package com.bugfix.jfxmetro.ui.controls;

import com.bugfix.jfxmetro.ui.constants.IStyleClass;

import javafx.scene.Node;
import javafx.scene.control.Label;

/**
 * @author Thirumalaivasan Rajasekaran
 *
 */
public class HeaderLabel extends Label{
	
	
	/**
	 * 
	 */
	public HeaderLabel() {
		super();
		this.getStyleClass().add(IStyleClass.HEADER_LABEL);
	}
	
	/**
	 * @param text
	 */
	public HeaderLabel(String text) {
		super(text);
		this.getStyleClass().add(IStyleClass.HEADER_LABEL);
	}
	
	/**
	 * @param text
	 * @param graphic
	 */
	public HeaderLabel(String text, Node graphic) {
		super(text, graphic);
		this.getStyleClass().add(IStyleClass.HEADER_LABEL);
	}
	
}
