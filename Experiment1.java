 class Box{
    double width;
    double height;
    double length;


    // overloading
    //default 
    Box(){
        this.width = 0;
        this.height = 0;
        this.length =  0;
    }
    // box with one variable
    Box(double len){
        this.width  =0;
        this.height = 0;
        this.length = len;
    }

    // box with three variable
    Box(double len,double h,double w){
        this.width = w;
        this.height = h;
        this.length = len;
    }
    double volume(){
       return height*width*length;


    }
    double volume(double len,double width,double height){
        return len*width*height;
    }
    void display(){
        System.out.println("Box Dimensions "+ width + " * "+height+" * "+length);
    }

}
 class BoxWeight extends Box{
    double weight;
    //default contructor for Boxweight
    BoxWeight(){
        super();
        this.weight = 0;

    }
    //constructor with four parameters
    BoxWeight(double width,double height,double length, double weight){
        super(width,height,length);
        this.weight = weight;


    }
    void display(){
        super.display();
        System.out.println("Weight of Box "+weight);
    }

}
 public class Experiment1 {
    public static void main(String[] args) {
        Box box = new Box(3,4,5);
        System.out.println("Box Volume "+ box.volume());
        box.display();
        BoxWeight boxWeight = new BoxWeight(2,3,4,5.5);
        BoxWeight boxWeight2 = new BoxWeight();
        System.out.println("Boxweight2 volume "+ boxWeight2.volume(10,4,5));

        System.out.println("Boxweight volume "+ boxWeight.volume());
        boxWeight.display();



      

    }
}
//ssss