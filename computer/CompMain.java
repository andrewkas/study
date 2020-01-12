package computer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CompMain {
    public static void main(String[] args) {
        System.out.println("Какой компьютер Вы хотите получить: ");
        System.out.println("1.Нерабочий \n2.Рабочий");
        Direktor direktor=new Direktor();
        CompConstructor compConstructor=new CompConstructor();
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        switch (i) {
            case 1:

                //   IParts[]parts=new IParts[3];
                //   IStandart[]standarts =new IStandart[3];

                //  parts[0]=new CPU(CPUStandart.ZEN);
                //  parts[1]=new RAM(RAMStandart.DDR2);
                //  parts[2]=new HDD(HDDStandart.SATA);
                //  standarts[0]=CPUStandart.ZEN;
                //  standarts[1]=RAMStandart.DDR2;
                //  standarts[2]=HDDStandart.SATA;

                direktor.compSuperConst(compConstructor);
                Comp comp = compConstructor.getComp();
                resultStart(comp);
                break;
            case 2:
                direktor.compSimplyConst(compConstructor);
                Comp comp2 = compConstructor.getComp();
                resultStart(comp2);
                break;
        }}

public static void resultStart(Comp comp){
        System.out.println("Проверка совместимости комплектующих.....");
        if(comp.start()) {
            System.out.println("..........\nЗагружаюсь \n..........\nРаботаю!!!");
        }
        else System.out.println("Комплектующие не подходят!!!");

    }
}
