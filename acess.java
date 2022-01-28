

public class acess {
	PUBLIC:
		//4. using public access specifiers
	

		public class pubaccessspecifiers {

			public void display() 
		    { 
		        System.out.println("This is Public Access Specifiers"); 
		    } 
		}

		//create another package
		
		

		public class accessSpecifiers4 {

			public static void main(String[] args) {
				
				pubaccessspecifiers obj = new pubaccessspecifiers(); 
		        obj.display();  
				
			}
		}


		:PRIVATE:
		//2. using private access specifiers
		class priaccessspecifier 
		{ 	
		   private void display() 
		    { 
		        System.out.println("You are using private access specifier"); 
		    } 
		} 

		public class accessSpecifiers2 {

			public static void main(String[] args) {
				//private
				System.out.println("Private Access Specifier");
				priaccessspecifier  obj = new priaccessspecifier(); 
		        //trying to access private method of another class 
		        //obj.display();

			}
		}

		
		//1. Class is having Default access modifier 
		class defAccessSpecifier
		{ 
		  void display() 
		     { 
		         System.out.println("You are using defalut access specifier"); 
		     } 
		} 

		public class accessSpecifiers1 {

			public static void main(String[] args) {
				//default
				System.out.println("Dafault Access Specifier");
				defAccessSpecifier obj = new defAccessSpecifier(); 		  
		        obj.display(); 

			}
		}


		//3. using protected access specifiers
		

		public class proaccessspecifiers {

			protected void display() 
		    { 
		        System.out.println("This is protected access specifier"); 
		    } 
		}

		//create another package
	

		public class accessSpecifiers3 extends proaccessspecifiers {

			public static void main(String[] args) {
				accessSpecifiers3 obj = new accessSpecifiers3 ();   
			       obj.display();  
			}
		}
}


