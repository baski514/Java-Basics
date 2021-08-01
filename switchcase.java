
public class switchcase
{
	public static void main(String[] args) {
	    
		int a = 20;
		int b = 10;
		
		int answer=0;
		
		// +,-,x,/
		
		char c = '+';
	
		switch(c){
		    case '+':
		        answer = a+b;
		        break;
		    case '-':
		        answer = a-b;
		        break;
		    case 'x':
		        answer = a*b;
		        break;      
		    case '/':
		        answer = a/b;
		        break;      
		    default:System.out.println("Invalid options given");
		}
		
		System.out.println("Answer "+answer);
	}
}
