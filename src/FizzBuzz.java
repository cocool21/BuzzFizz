
public class FizzBuzz {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			String str="";
			if(i%3==0)
			{
				str+="Fizz";
				if(i%5==0)
				{
					str+="Buzz";
				}else
				{
					str+="";
				}
				System.out.println(str);
			}else if(i%5==0)
			{
				str+="Buzz";
				System.out.println(str);
			}else
			{
				System.out.println(i);
			}
			
			
		}
	}

}
