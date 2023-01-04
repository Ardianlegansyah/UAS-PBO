
    public class Lingkaran{
        float r;
        float diameter;

       
        public Lingkaran(float r,float diameter) {
            this.r = r;
            this.diameter = diameter;
        
        }

   
    void display() {
        float Luas = (float)(Math.PI*r*r) ;
        float Keliling = (float)(Math.PI*2*3.14*r) ;
        System.out.println("keliling lingkarang" + Luas);
        System.out.println("luas lingkarang" + Keliling);
    }
  
        }

public class App {
    public static void main(String[] args) throws Exception {
   Lingkaran lingkaran = new Lingkaran(20, 40);
   System.out.println("Jari-jari : " + lingkaran);
   System.out.println("diameter : " + lingkaran.diameter); 
   lingkaran.display();  
    }
}
