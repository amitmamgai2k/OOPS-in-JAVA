class A{
    int a;
    String b;
   A(){
    a= 10;
    b="hello";
   

   }
   A(A ref){
    a = ref.a;
    b = ref.b;
    
   }
   void displaY(){
    System.out.println(a+" "+b);
   }


}
public class copyconstructor {
    public static void main(String[] args) {
        A r = new A();
        r.displaY();

     
        A r2 = new A(r);
        r2.displaY();
        r.a  =15;
        r.displaY();
        r2.displaY();
        
    }
}
//sss