package homework;

public class Home1 {
    public static void main(String[] args) {
        int a=42,b=15,c=-42, d=-15;

        System.out.println(a&b);//00101010 & 00001111 = 00001010 (10) заполняет совпадающие биты
        System.out.println(a|b);//00101010 | 00001111 = 00101111 (47) заполняет все занятые из двух
        System.out.println(a^b);//00101010 ^ 00001111 = 00100101 (37) заполняет не совпадающие
        System.out.println(a&=b);//a = 00101010 & 00001111 = 00100101 (10)
        a=42;//присваеваем переменной a значение 42 т.к. после последней операции ей присвоено значение 10
        System.out.println(a|=b);//a = 00101010 | 00001111 = 00101111 (47)
        a=42;//присваеваем переменной a значение 42 т.к. после последней операции ей присвоено значение 47
        System.out.println(a^=b);//a = 00101010 ^ 00001111 = 00100101 (37)
        a=42;//присваеваем переменной a значение 42 т.к. после последней операции ей присвоено значение 37
        System.out.println(a>>2);//00101010 >> 2 = 00001010 (10) смещает на 2 бита вправо
        System.out.println(b<<3);//00001111<<3 = 01111000 (120) смещает на 3 бита влево
        System.out.println(a>>>3);//00101010 >>> 3 = 00000101 (5) смещает на 3 бита вправо c заполнением старших битов 0
        System.out.println(a>>=4);//a = 00101010 >> 4 = 00000010 (2) смещает на 4 бита вправо и присваевает переменной a
        System.out.println(b<<=4);//b = 00001111 << 4 = 11110000 (240) смещает на 4 бита влево и присваевает переменной b
        System.out.println(b>>>=5);// b = 11110000 >>>5 = 00000111 (7) смещает на 5 битов вправо c заполнением старших битов
        // 0 и присваевает переменной b
        a=42;
        b=15;
        System.out.println(~a); //~00101010 = 11010101 (-43)
        System.out.println(~b);//~00001111 = 11110000 (-16)


        System.out.println(c&d);//11010110 & 11110001 = 11010000 (-48) заполняет совпадающие биты
        System.out.println(c|d);//11010110 | 11110001 = 11110111 (-9) заполняет все занятые из двух
        System.out.println(c^d);//11010110 ^ 11110001 = 00100111 (39) заполняет не совпадающие
        System.out.println(c&=d);//a = 11010110 & 11110001 = 11010000 (-48)
        c=-42;//присваеваем переменной a значение -42 т.к. после последней операции ей присвоено значение -48
        System.out.println(c|=d);//a = 11010110 | 11110001 = 11110111 (-9)
        c=-42;//присваеваем переменной a значение -42 т.к. после последней операции ей присвоено значение -9
        System.out.println(c^=d);//a = 00101010 ^ 00001111 = 00100101 (39)
        c=-42;//присваеваем переменной a значение -42 т.к. после последней операции ей присвоено значение 39
        System.out.println(c>>2);//11010110 >> 2 = 11110101 (-11) смещает на 2 бита вправо
        System.out.println(d<<3);//11110001 <<3 = 10001000 (-120) смещает на 3 бита влево
        System.out.println(c >>> 2);//11010110 >>> 2 = 1111111110101 (1073741813)!!!!!! должен смещать на 2 бита вправо c заполнением старших битов 0 но почему-то не работает
        System.out.println(c>>=2);//с =  11010110 >> 2 = 11110101 (-11) смещает на 2 бита вправо и присваевает переменной a
        System.out.println(d<<=3);//b = 11110001 << 3 = 10001000 (-120) смещает на 3 бита влево и присваевает переменной b
        System.out.println(d>>>=2);// b = 10001000 >>>2 = 11111111100010 (1073741794) !!!!! должен смещает на 2 бита вправо c заполнением старших битов
        // 0 и присваевает переменной b, но что-то не работает!!!!
        c=-42;
        d=-15;
        System.out.println(~c); //~11010110 = 00101001 (41)
        System.out.println(~d);//~11110001 = 00001110 (14)









    }
}
