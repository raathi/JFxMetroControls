package com.bugfix.jfxmetro.ui.skins;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import com.bugfix.jfxmetro.ui.constants.IFontFamily;
import com.bugfix.jfxmetro.ui.controls.HeaderLabel;
import com.bugfix.jfxmetro.ui.controls.SubheaderLabel;

public class JFxMetroLabelSkin extends com.sun.javafx.scene.control.skin.LabelSkin{

	public JFxMetroLabelSkin(Label label) {
		super(label);
		if(label instanceof HeaderLabel){
			label.setFont(Font.font(IFontFamily.SEGOE_UI_LIGHT, FontWeight.EXTRA_LIGHT, 42));
		}else if(label instanceof SubheaderLabel){
			SubheaderLabel subheaderLabel = (SubheaderLabel)label;
			switch(subheaderLabel.getType()){
			case PRIMARY:
				subheaderLabel.setFont(Font.font(IFontFamily.SEGOE_UI_LIGHT, FontWeight.EXTRA_LIGHT, 20));
				break;
			case SECONDARY:
				subheaderLabel.setFont(Font.font(IFontFamily.SEGOE_UI_SEMIBOLD, FontWeight.EXTRA_LIGHT, 11));
				break;
			case TERTIARY:
				subheaderLabel.setFont(Font.font(IFontFamily.SEGOE_UI_SEMIBOLD, FontWeight.EXTRA_LIGHT, 11));
				break;
			case CUSTOM: 
				break;
			}
		}else{
			//do nothing
		}
		
	}

}
