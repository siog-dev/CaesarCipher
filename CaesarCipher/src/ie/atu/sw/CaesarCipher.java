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
	
	public String encrypt(String plainText) {
		StringBuilder sb = new StringBuilder(""); // 1. Create a string builder up here
		
		for (int i = 0; i < plainText.length(); i++) {
			char ch = (char) (plainText.codePointAt(i) + key);
			
			sb.append(ch); // Call builder.append
		}
		
		return sb.toString(); // Return builder.toString()
	}
	
	public String decrypt(String cipherText) {
		String dec = "";
		
		for (int i = 0; i < cipherText.length(); i++) {
			char ch = (char) (cipherText.codePointAt(i) - key);
			dec = dec + ch;
		}
		
		return dec;
	}
}
