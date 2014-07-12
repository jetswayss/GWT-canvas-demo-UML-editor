package org.twbbs.peak.uml.modes;

import org.twbbs.peak.uml.object.UMLObject;
import org.twbbs.peak.uml.object.UMLObjectManager;

public abstract class LinesMode implements UmlMode{
	protected UMLObjectManager umlObjectManager;
	private UMLObject nowObject;

	public void startDrag(int x, int y) {
		nowObject=umlObjectManager.getUMLObject(x, y);	
	}

	public void stopDrag(int x, int y) {
		UMLObject object=umlObjectManager.getUMLObject(x, y);
		if(nowObject!=null && object!=null && nowObject!=object){
			createLine(nowObject,object);
		}
		nowObject=null;
	}
	public void onClick(int x, int y) {}
	public void onDrag(int x, int y) {}
	public void modeChanged(){}
	protected abstract void createLine(UMLObject objectA,UMLObject objectB);
}
