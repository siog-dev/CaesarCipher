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
		String enc = ""; // 1. Create a string builder up here
		
		for (int i = 0; i < plainText.length(); i++) {
			char ch = (char) (plainText.codePointAt(i) + key);
			/*
			 * enc = enc + ch; is inefficient
			 * it looks for enc in the string pool
			 * it won't find it and can't change it
			 * creates a new object and appends ch to the end
			 * 
			 * Use a string builder for building strings inside loops
			 */
			
			enc = enc + ch; // Call builder.append
		}
		
		return enc; // Return builder.toString()
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
