package ie.atu.sw;

public class CaesarCipher {

	private int key = 0;

	public CaesarCipher(int key) {
		this.key = key;
	}
	
	/*
	 * 2. REMOVE REPITITION
	 * 
	 * Create a private method to call once
	 * Keep signature "public String encrypt(String plainText)"
	 * Call builder as a the new method and pass it true or false
	 * True - encrypt, false - decrypt
	 */
	
	// private String transform(String s, boolean encrypt)
	private String transform(String s, boolean encrypt) {
		StringBuilder sb = new StringBuilder("");
		boolean enc = true;
		
		for (int i = 0; i < sb.length(); i++) {
			if (enc) {
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
	
	/*
	public String encrypt(String plainText) {
		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < plainText.length(); i++) {
			char ch = (char) (plainText.codePointAt(i) + key);
			
			sb.append(ch);
		}
		
		return sb.toString();
	}
	
	public String decrypt(String cipherText) {
		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < cipherText.length(); i++) {
			char ch = (char) (cipherText.codePointAt(i) - key);
			sb.append(ch);
		}
		
		return sb.toString();
		
	}
	*/
}
