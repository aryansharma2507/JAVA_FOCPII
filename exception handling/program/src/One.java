import java.lang.*;
class One{
	int a;
	int b;
	One(int a, int b){
		this.a =a;
		this.b =b;
	}
	int Divide(){
		return a/b;
	}
	public static void main(String[] args){
		One o1 = new One(3,4);
		One o2 = new One(5,0);
		try{
			if (o2.b==0){
				throw new ArithmeticException("value of b cannot be shown");
			}
			System.out.println(o2.Divide());
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println(o1.Divide());
		}
		System.out.println("ERROR");
	}

}