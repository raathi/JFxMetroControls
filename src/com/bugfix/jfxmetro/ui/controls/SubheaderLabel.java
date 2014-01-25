package com.bugfix.jfxmetro.ui.controls;

import com.bugfix.jfxmetro.ui.enums.SubheaderType;

import javafx.scene.Node;
import javafx.scene.control.Label;

public class SubheaderLabel extends Label{
	private SubheaderType type;

	/**
	 * @param subheaderType
	 */
	public SubheaderLabel(SubheaderType subheaderType) {
		super();
		this.type = subheaderType;
				
	}
	
	/**
	 * @param text
	 * @param subheaderType
	 */
	public SubheaderLabel(String text, SubheaderType subheaderType) {
		super(text);
		this.type = subheaderType;
	}
	
	/**
	 * @param text
	 * @param graphic
	 * @param subheaderType
	 */
	public SubheaderLabel(String text, Node graphic, SubheaderType subheaderType) {
		super(text, graphic);
		this.type = subheaderType;		
	}
	
	
	/**
	 * @return
	 */
	public SubheaderType getType() {
		return type;
	}

	/**
	 * @param subheaderType
	 */
	public void setType(SubheaderType subheaderType) {
		this.type = subheaderType;
	}
	
}
