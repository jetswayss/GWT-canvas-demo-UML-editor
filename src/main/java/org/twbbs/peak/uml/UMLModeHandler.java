package org.twbbs.peak.uml;

public interface UMLModeHandler {
	int SELECTION_MODE=0;
	int ASSOCAITION_Mode=1;
	int GENERALIZATION_MODE=2;
	int COMPOSTION_MODE=3;
	int CLASS_MODE=4;
	int USECASE_MODE=5;
	void changeMode(int mode);
}