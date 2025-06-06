package ie.atu.sw;

public class CaesarCipher {

	private int key = 0;

	public CaesarCipher(int key) {
		this.key = key;
	}
	
	// Johns solution - I was not far off!
	private String transform(String s, boolean encrypt) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if(encrypt) {
				sb.append((char)(s.codePointAt(i) + key));
			}else {
				sb.append((char)(s.codePointAt(i) - key));
			}
		}
		
		return sb.toString();
	}
	
	public String encrypt(String plainText) {
		return transform(plainText, true);
	}
	
	public String decrypt(String cypherText) {
		return transform(cypherText, false);
	}
	
	/*
	private String transform(String s, boolean encrypt) {
		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {
			if (encrypt) {
				char ch = (char) (s.codePointAt(i) + key);
				sb.append(ch);
			}else {
				char ch = (char) (s.codePointAt(i) - key);
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public String encrypt(String s) {
		return transform(s, true);
	}
	
	public String decrypt(String s) {
		return transform(s, false);
	}
	*/
}
