class Mother{
		int x;
		void show(){
		    x = 5;
		   System.out.println(x);
		}
}

class Child extends Mother{
 
}

class Application{
    public static void main(String args[]){
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();
    }
}