package chapter6.ceiling;

import chapter6.Command;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;

    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (this.prevSpeed) {
            case CeilingFan.HIGH -> this.ceilingFan.high();
            case CeilingFan.MEDIUM -> this.ceilingFan.medium();
            case CeilingFan.LOW -> this.ceilingFan.low();
            default -> throw new IllegalStateException("Unsupported speed type");
        }
    }
}
