package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String f= "";
		for (int i = 0; i < s.length(); i++) {
			
			char c= s.charAt(i);
			if(i%2==0) {
				c=Character.toLowerCase(c);
				
			}else {
				c=Character.toUpperCase(c);
			}
			
			f=f+c;
			
		} System.out.println(f);
		return f;
		
	}

}
