package assisted;

abstract public class AnoymousInnerClass {	  
	public abstract void display();
}


public class innerClassAssisted3 {

public static void main(String[] args) {
AnoymousInnerClass i = new AnoymousInnerClass() {

         public void display() {
            System.out.println("Anonymous Inner Class");
         }
      };
      i.display();
   }


}
