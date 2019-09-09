import java.util.Scanner;
public class a{
	public static void main(String[] args){
		System.out.println("Welcome! Please input some letters");
		System.err.println("I can convert between uppercase letters and lowercase letters (input 'end' to end)");
		Scanner scan = new Scanner(System.in);
		while(true){
			String s = scan.nextLine();
			StringBuilder sb = new StringBuilder();
			if(s.equals("end")){
				System.out.println("Bye...");
				System.exit(0);
			}else{
				for(int i = 0;i < s.length();i++){
					char temp = s.charAt(i);
					if(temp >= 'a' && temp <= 'z'){
						temp = (char)(temp - 32);
					}else if(temp >= 'A'&&temp <= 'Z'){
						temp = (char)(temp + 32);
					}else{
						temp = '*';
					}
					sb.append(temp);
				}
			}
			System.out.print(sb.toString());
		}
	}
}
