package OOPLAB;

public class stringmanipulation {
	public static void main(String[] args) {
		char arrsample[]={'R','O','S','E'};
		String strsample1=new String(arrsample);
		System.out.println(strsample1+"\t");
		System.out.println("length of"+strsample1+"is"+strsample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strsample2=new String(ascii);
		System.out.print(strsample2+"\t");
		String strsample3=strsample1.concat(strsample2);
		System.out.print(strsample3+"\t");
		String strsample4=strsample1+strsample2;
		System.out.print(strsample4+"\t");
		System.out.println("3rd char of "+strsample4+ "is: "+strsample4.charAt(2));
		char buf[]=new char[3];
		strsample4.getChars(2, 5, buf, 0);
		System.out.println("extracted chars: "+strsample4+" "+ new String(buf));
		String strsample="ROCKSTAR";
		System.out.print(strsample.compareTo("ROCKSTAR")+"\t");
		System.out.print(strsample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.print(strsample.equals("ROCKSTAR")+"\t");
		System.out.print(strsample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("Rockstar start with 'Ro': "+strsample.startsWith("Ro"));
		System.out.println("Rockstar ends with 'star': "+strsample.endsWith("star"));
		System.out.println("Rockstar contain 'tar': "+strsample.contains("tar"));
		System.out.println("index of 't' in Rockstar: "+strsample.indexOf("t"));
		System.out.println("index of 'star' in Rockstar: "+strsample.indexOf("star"));
		System.out.println("all caps-rockstar: "+strsample.toUpperCase());
		System.out.println("all small-rockstar: "+strsample.toLowerCase());
		System.out.println("replace 'star' with 'et': "+strsample.replace("stat","et"));
		String dVal="3.456";
		String iVal="6";
		System.out.println("doublr value od dval is: "+Double.valueOf(dVal));
		System.out.println("integer value of ival is: "+Integer.valueOf(iVal));
		double a=Double.valueOf(dVal);
		int b=Integer.valueOf(iVal);
		System.out.println(a+b);

}

}
