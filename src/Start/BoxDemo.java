package Start;

class Box {
    double width;
    double height;
    double depth;

    void volum(){
        System.out.print("Обьем равен ");
        System.out.println(width* height* depth);
    }
    double volume(){
        return width*height*depth;
    }
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width*mybox.depth*mybox.height;
        System.out.println("Обьем равен " + vol);
    }
}
