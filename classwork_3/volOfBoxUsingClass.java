package classwork_3;

public class volOfBoxUsingClass {

    int l, b, w;

    public double volOfBox(){
        return l * b * w;
    }

    void assign(int len, int bre, int width){
        l = len;
        b = bre;
        w = width;
    }

    public static void main(String[] args) {
        volOfBoxUsingClass v1 = new volOfBoxUsingClass();
        v1.assign(10, 20, 30);
        double vol = v1.volOfBox();
        System.out.println(vol);
    }


}
