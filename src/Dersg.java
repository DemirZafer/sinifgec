import java.util.Scanner;

public class Dersg {
    public static void main(String[] args) {
        Scanner vr = new Scanner(System.in);
        float m , k , f , t , muz,ort;
        System.out.println("m notunu girin : ");
        m = vr.nextFloat();
        System.out.println("k notunu girin : ");
        k = vr.nextFloat();
        System.out.println("f notunu girin : ");
        f = vr.nextFloat();
        System.out.println("t notunu girin : ");
        t = vr.nextFloat();
        System.out.println("muz notunu girin : ");
        muz = vr.nextFloat();
        if ((m<0f)||(m>100f) ){
            m = 0f;
        }
        if ((k<0f)||(k>100f) ){
            k = 0f;
        }
        if ((f<0f)||(f>100f) ){
            f = 0f;
        }
        if ((t<0f)||(t>100f) ){
            t = 0f;
        }
        if ((muz<0f)||(muz>100f) ){
            muz = 0f;
        }
        ort = (m + k + f + t + muz) / 5;
        if(ort<55f){
            System.out.println("Sınıfta Kaldın!");
            System.out.println("Ortalamanız : "+ort);
        }else{
            System.out.println("Sınıfı Başarıyla Geçtiniz");
            System.out.println("Ortalamanız : "+ort);}






    }
}
