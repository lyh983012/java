package problem5;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class StringEncryptor {

	static public void main(String arg[]) {
		
		String arg1="We will break out of prison at dawn";
		StringEncryptor Map = new StringEncryptor();
		System.out.println("encode1=");
		Map.encode(arg1);
		System.out.println("decode1=");
		Map.decode(Map.encoded.toString());
		
		System.out.println("encode2:");
		System.out.println("password=");
		Map.encode2(arg1);
		System.out.println("decode2:");
		System.out.println("password=");
		Map.decode2(Map.encoded.toString());
	}
	
	private StringBuffer decoded;
	private StringBuffer encoded;
	private String input;
	private int seed;
	
	private char[] alphablets= {'v','e','k','n','o',
			'h','z','f','i','l',
			'j','x','d','m','y','g','b','r',
			'c','s','w','q','u','p','t','a'};
	private char[] alphablets2= {'V','E','K','N','O',
			'H','Z','F','I','L',
			'J','X','D','M','Y','G','B','R',
			'C','S','W','Q','U','P','T','A'};
	public void encode(String input) {
		StringBuffer unencoded;
		StringBuffer encoded;
		unencoded=new StringBuffer(input);
		encoded=new StringBuffer(unencoded.length());
		for(int i=0;i<=unencoded.length()-1;i++) {
			if('a'<=unencoded.charAt(i) && unencoded.charAt(i)<='z') {
				encoded.insert(i,alphablets[unencoded.charAt(i)-'a']);
			}else if('A'<=unencoded.charAt(i) && unencoded.charAt(i)<='Z') {
				encoded.insert(i,alphablets2[unencoded.charAt(i)-'A']);
			}else if(' '==unencoded.charAt(i)) {
				encoded.insert(i,'_');
			}else {
				System.out.println("a character in index="+i+"is in wrong format");
			}
		}
		System.out.println(encoded);
		this.encoded=new StringBuffer(encoded);
	}
	
	public void decode(String input) {
		StringBuffer encoded;
		StringBuffer decoded;
		encoded=new StringBuffer(input);
		decoded=new StringBuffer(encoded.length());
		for(int i=0;i<=encoded.length()-1;i++) {
			for(int j=0;j<=25;j++) {
				if(encoded.charAt(i)==alphablets[j]) {
					decoded.append((char)('a'+j));
					break;
				}else if(encoded.charAt(i)==alphablets2[j]) {
					decoded.append((char)('A'+j));
					break;
				}else if(encoded.charAt(i)=='_') {
					decoded.append(' ');
					break;
				}
			}
		}
		System.out.println(decoded.toString());
		this.decoded=new StringBuffer(decoded);
	}

	
	public void encode2(String input) {
		
		Scanner sc = new Scanner(System.in);
		long password = sc.nextLong();
		Random rand=new Random();
		rand.setSeed(password);
		
		StringBuffer unencoded=new StringBuffer(input);
		StringBuffer encoded=new StringBuffer(unencoded.length());

		for(int i=0;i<=unencoded.length()-1;i++) {
				encoded.insert(i,(char)(unencoded.charAt(i)+rand.nextInt(64)));
		}
		System.out.println(encoded);
		this.encoded=new StringBuffer(encoded);
	}
	
	void decode2(String input) {
		StringBuffer encoded=new StringBuffer(input);
		StringBuffer decoded=new StringBuffer(encoded.length());
		Scanner sc = new Scanner(System.in);
		long password = sc.nextLong();
		Random rand=new Random();
		rand.setSeed(password);
		
		for(int i=0;i<=encoded.length()-1;i++) {
				decoded.insert(i,(char)(encoded.charAt(i)-rand.nextInt(64)));
		}
		this.decoded=new StringBuffer(decoded);
		System.out.println(decoded.toString());
	}
	

}
