package garage.parts.Wheel;

import garage.parts.api.IWheel;
import garage.parts.engine.api.FuelType;

import java.io.StringBufferInputStream;

public class Wheels implements IWheel {
    private WheelSpec wheelSpec;
    private int diameter;
  public Wheels(WheelSpec wheelSpec, int diameter){
      this.wheelSpec=wheelSpec;
      this.diameter=diameter;

  }

    @Override
    public int getDiametr() {
      return diameter;

    }

    @Override
    public WheelSpec getwheelSpec() {
      return wheelSpec;
    }
    public void setWheelSpec(WheelSpec wheelSpec) {
        this.wheelSpec = wheelSpec;
    }

}

