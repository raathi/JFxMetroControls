package com.bugfix.jfxmetro.ui.controls;

import com.bugfix.jfxmetro.ui.constants.IStyleClass;

import javafx.scene.Node;

public class Button extends javafx.scene.control.Button{

	public Button(){
		super();
		this.getStyleClass().add(IStyleClass.BUTTON);
	}
	
	public Button(String text){
		super(text);
		this.getStyleClass().add(IStyleClass.BUTTON);
	}
	
	public Button(String text, Node graphic){
		super(text, graphic);
		this.getStyleClass().add(IStyleClass.BUTTON);
	}

}
