package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public enum Country implements ICountry {
    BELARUS(207.595, 9.508), UKRAINE(603.549, 42.030), POLAND(312.969, 38.413),
    LIETUVA(65.3, 2.791), RUSSIA(17098.246, 146.793), LATVIA(64.589, 1.919),
    SLOVAKIA(48.035, 5.450), GERMANY(357.386, 83.019), DENMARK(43.094, 5.811),
    GEORGIA(69.7, 3.723);
    private double area;
    private double popul;

    Country(double area, double popul) {
        this.area = area;
        this.popul = popul;
    }


    public void getArea() {
        System.out.println("Площадь : " + area + " тыс.км2");
    }


    public void getPopul() {
        System.out.println("Население : " + popul + " млн.чел.");
    }

    //public static Countrya (String str){
    //    return valueOf(str.toUpperCase());
    //}

   // @Override
    private void compare(Country count, Country count1) {

       if (count.area > count1.area)
        System.out.println(count.name()+", больше!");
       else if(count.area<count1.area)
           System.out.println(count1.name()+", больше!");
       else if (count.area==count1.area)
           System.out.println(count.name()+" и "+count1.name()+" равны!" );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название страны : ");
        String count = in.nextLine();

        Country country = Country.valueOf(count);

        country.getPopul();
        country.getArea();
        System.out.print("Проверка с объектом BELARUS через valueOf : ");
        System.out.println(Country.BELARUS == Country.valueOf(count));
        System.out.println(Country.BELARUS==Country.BELARUS);
        //System.out.println(Country.BELARUS==Country.valueOf("Belarus");
        System.out.println("Введите название страны для сравнения : ");
        String count1=in.nextLine();
        Country country1=Country.valueOf(count1);
        country.compare(country,country1);



        }
//  тут могут находится гетеры и методы типа compare





    }


