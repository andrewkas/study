package garage.parts;

import org.w3c.dom.ls.LSOutput;

public enum EngineSpecific {
    TFSI(2.0,200,7.3),FSI(3.2,250,8.1),
    N54(3.0,306,8.5), M57D(3.0, 231, 6.9),
    M274(2.0,184,6.3), OM651D(2.1,204,6.8);
    private double volume,consump;
    private int hpower;
   EngineSpecific(double volume, int hpower, double consump) {
    this.volume = volume;
    this.hpower = hpower;
    this.consump = consump;
}
  public double getVolume() {
      return volume;
  }

    public int getHpower() {
        return hpower;
    }

    public double getConsump() {
        return consump;
    }
    public void running(){
        System.out.println("Тр-тр-тр-тр");
    }
}




