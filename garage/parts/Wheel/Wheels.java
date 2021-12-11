package garage.parts.Wheel;

import garage.parts.api.IWheel;

public abstract class Wheels implements IWheel {
    protected WheelSpec wheelSpec;
    protected int diameter;


    @Override
    public int getDiametr() {
        return diameter;

    }
    @Override
    public WheelSpec getwheelSpec() {
      return wheelSpec;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "wheelSpec=" + wheelSpec +
                ", diameter=" + diameter +
                '}';
    }
}

