package rlbotexample.manoeuvre.sequence;

import rlbotexample.input.DataPacket;

public abstract class Step {

	public abstract StepResult tick(DataPacket packet);

}
