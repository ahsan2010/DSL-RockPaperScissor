package model.rockPaperScissor;
import urml.runtime.*;
import java.util.*;
/**
 * Protocol with name: askChoiceProtocol
 * @generated
 */
public class _P_askChoiceProtocol extends Protocol {
	public _P_askChoiceProtocol() {
		incomingSignals = Arrays.asList();
		outgoingSignals = Arrays.asList(_s_askToShow);
	}
	public static Signal _s_askToShow = new Signal();
}
