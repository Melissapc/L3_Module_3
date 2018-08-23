package interfaces;

public class BackwardsString extends SpecialString {
	String f;

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String f= "";
		for (int i = 0; i < s.length(); i++) {
			
			char c= s.charAt(i);
			f=c+f;
		} System.out.println(f);
		return f;
	}


}
