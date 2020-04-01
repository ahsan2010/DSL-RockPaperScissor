package model.rockPaperScissor;
import urml.runtime.*;
import java.util.*;
/**
 * Protocol with name: mainGameProtocol
 * @generated
 */
public class _P_mainGameProtocol extends Protocol {
	public _P_mainGameProtocol() {
		incomingSignals = Arrays.asList();
		outgoingSignals = Arrays.asList(_s_go, _s_sendChoice);
	}
	public static Signal _s_go = new Signal();
	public static Signal _s_sendChoice = new Signal();
}
