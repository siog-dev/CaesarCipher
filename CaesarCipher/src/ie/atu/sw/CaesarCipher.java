package ie.atu.sw;

public class CaesarCipher {
	/*
	 * A ceasar cipher is a simple symmetric/substitution cipher
	 * Uses the same key to encrypt and decrypt
	 */
	private int key = 0; // Int key -> the number is the key/letter shift

	public CaesarCipher(int key) {
		// super();
		this.key = key;
	}
	
	public String encrypt(String plainText) { // Text anyone can read
		// Loop over each char in the string, and offset it by the key
		String enc = "";
		
		for (int i = 0; i < plainText.length(); i++) {
			// Use charAt(int index) to get a char string
			// Use codePointAt(int index) to get an int (unicode int)
			plainText.codePointAt(i) + key;
		}
		return null;
	}
	
	public String decrypt(String cipherText) { // Encrypted text
		return null;
	}
}
