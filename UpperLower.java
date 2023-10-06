package com.uno.carrer;

public class UpperLower {

	public static void main(String[] args) {
		
				// A-Z-- 65-90
				// a-z---97-122
				String data = "hii everyone."
						+ " lets start the class."
						+ "good morning";
				data = data.replace('.', ':');
				String[] lines = data.split(":");
				String[] words;
				char firstChar;
				String newLine="";
				for(int i=0;i<lines.length;i++) {//
					lines[i] = lines[i].trim();
					words = lines[i].split(" ");//"welcome to india" 
					newLine="";
					for(int j=0;j<words.length;j++) {
						if( (j==0) && (words[j].length() > 0) ) {//"welcome"
							firstChar=words[j].charAt(0);//w
							firstChar = toUpperChar(firstChar);// W
							words[j] = firstChar + words[j].substring(1);// W+elcome--- Welcome
						}
						else if( words[j].length() > 0 ){
							firstChar=words[j].charAt(0);//w
							firstChar = toLowerChar(firstChar);// W
							words[j] = firstChar + words[j].substring(1);// W+elcome--- Welcome
							
						}
						newLine = newLine+" "+words[j];
					}// for every line
					System.out.println(newLine);
					
				}
				
				
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
