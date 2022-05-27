import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dist, age , type;

        System.out.print("Yolculuk mesafesini giriniz : ");
        dist = inp.nextInt();
        if(dist<0) {
            System.out.println("Hatalı veri girdiniz!");
        }else {
            System.out.print("Yasinizi giriniz : ");
            age = inp.nextInt();
            if(age<0) {
                System.out.println("Hatalı veri girdiniz!");

            }else {
                System.out.print("1 => Tek Yön \n2 => Gidiş-DÖnüş : ");
                type = inp.nextInt();

                if(type<0 || type >2) {
                    System.out.println("Hatalı veri girdiniz!");
                } else {
                    double total = dist*0.1;
                    total = age<12 ? total*=0.5 : age<24 ? total*=0.9 : age>65? total*=0.7 : total;

                    System.out.println("Toplam Tutar : " + (type==2? total*0.8*2:total) + " TL");

                }
            }
                }




    }
}
