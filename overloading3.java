class overloading3{
   void show(int x,long y){
        System.out.println("int x "+x+" long y "+y);
	}
	   
	   void show(Long x,int y){
		   System.out.println("Long x "+x+" int y "+y);
   }
   public static void main(String ...s){
        System.out.println("main..");
 		overloading3 obj=new overloading3 ();
		
		obj.show(100,300L);
		obj.show(10000L,30000);
    }
}	
