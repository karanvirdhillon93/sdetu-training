package Warmup;

public class SetOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println(notString("candy"));
		//System.out.println(notString("x"));
		//System.out.println(notString("not bad"));
		
		String name="Karanvir";
		System.out.println("name is:"+"\n"+"length is:"+name.length());
		System.out.println("last 4 letters:"+name.substring(name.length()-4));
		//ara
		String firstTwo=name.substring(0,2);
		String lastTwo=name.substring(name.length()-2);
		System.out.println("first two:"+firstTwo+"\n last two"+lastTwo);

	}
	
	public static String notString(String str) {
/*Given a string, return a new string where "not " has been added to the front. 
 * However, if the string already begins with "not", return the string unchanged. 
 * Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"*/
		
		//1. check if string beings with not
		//1.a check length
		
		
		if(str.length()>=3) {
			if(str.substring(0, 3).equals("not")) {
				return str;
			}
			//if doesnt contain append not
			else {
				str="not "+str;
			}
		}else {
			str="not "+str;
		}
		
	
		return str;
		}
	
	

}
