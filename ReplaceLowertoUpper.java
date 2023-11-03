package com.uno.carrer;

public class ReplaceLowertoUpper {

	public static void main(String[] args) {
		
				// A-Z-- 65-90
				// a-z---97-122
				String data = "i am from hyderabad."
						+ " i completed My graduation in Hyderabad."
						+ "I am working at hyderabad";
				data = data.replace('.', ':');
				String[] lines = data.split(":");
				String[] words;
				char firstChar;
				String newLine="";
				String updatedData = "";
				for(int i=0;i<lines.length;i++) {//
					lines[i] = lines[i].trim();
					words = lines[i].split(" ");//"i am from hyderabad." 
					newLine="";
					for(int j=0;j<words.length;j++) {
						if( (j==0) && (words[j].length() > 0) ) {//"i"
							firstChar=words[j].charAt(0);//i
							firstChar = toUpperChar(firstChar);// i
							words[j] = firstChar + words[j].substring(1);
						}
						else if( words[j].length() > 0 ){
							firstChar=words[j].charAt(0);
							firstChar = toLowerChar(firstChar);
							words[j] = firstChar + words[j].substring(1);
							
						}
						if(( words[j].length() > 0 ) &&(words[j].equalsIgnoreCase("hyderabad")) ) {
							words[j] = "America";
						}
						updatedData = updatedData+" "+words[j];
					}// for every line
					updatedData = updatedData +".";
					//System.out.println(newLine);
					
				}// for loop
				System.out.println("Original Data...");
				System.out.println(data.replace(':', '.'));
				
				System.out.println("Updated Data...");
				System.out.println(updatedData);
				
				
			}// main
			
			public static char toUpperChar(char ch) {
				char res=' ';
				if( (ch>=97) &&(ch<=122)){
					res = (char)(ch -32);
					
				}
				else if( (ch>=65) &&(ch<=90)){
					res = ch;
				} 
				return res;
			}
			
			
			public static char toLowerChar(char ch) {
				char res=' ';
				// a-z---97-122
				// A-Z---65-90
				if( (ch>=97) &&(ch<=122)){
					res = ch;
					
				}
				else if( (ch>=65) &&(ch<=90)){
					res = (char)(ch + 32);
				} 
				return res;
			}
	
	}


