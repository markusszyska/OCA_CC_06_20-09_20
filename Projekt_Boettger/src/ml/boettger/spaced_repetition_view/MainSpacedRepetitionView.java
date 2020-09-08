//#############################################################################
//
//	Due to the upcoming OCA examination, the project was limited to creating
//  the view.
//
//  Even the graphical user interface should be reconsidered and revised.
//
//	- the space repetion algorithm had still not been implemented, see also
//    the following links for further informations:
//
//	https://en.wikipedia.org/wiki/Spaced_repetition
//  https://stackoverflow.com/questions/7609056/open-source-implementation-of-a-spaced-repetition-algorithm-in-java 
//  https://stackoverflow.com/questions/49047159/spaced-repetition-algorithm-from-supermemo-sm-2/49047160#49047160
//	
//  The Anki-Android source code can be found here for example:
//
//  https://github.com/ankidroid/Anki-Android
//
//		Bernd Böttger, 2020-09-06
//
//#############################################################################

package ml.boettger.spaced_repetition_view;

import java.awt.EventQueue;

public class MainSpacedRepetitionView {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->new ControllerMain());
	}
}
