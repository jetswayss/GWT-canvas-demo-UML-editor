package org.twbbs.peak.uml.connection;

import org.twbbs.peak.uml.object.UMLObject;

public class GeneralizationConnection extends UMLAbstractConnection{
	public GeneralizationConnection(UMLObject head, UMLObject tail,int headPostition,int tailPostition) {
		super(head, tail, headPostition, tailPostition,GENERALIZATION);
	}
}
