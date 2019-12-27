package garage.parts;

import garage.parts.api.IWheel;
import org.w3c.dom.ls.LSOutput;

public enum Wheel implements IWheel {CONTINENTAL(17,"winter"),
    MICHELIN(19,"summer"),
    PIRELLI(18,"all-weather");
private int diametr;
private String season;
Wheel(int diametr,String season){
    this.diametr=diametr;
    this.season=season;
}
    public int getDiametr(){
      return diametr;
    }
    public String getSeason(){
    return season;
    }

    @Override
    public void wheelSpin() {
        System.out.println("Колеса крутятся, машина едет!");
    }

    @Override
    public void wheelInstalled() {
        System.out.println("Колеса установлены");
    }

    @Override
    public void wheelRemoved() {
        System.out.println("Колеса сняты");

    }
}
