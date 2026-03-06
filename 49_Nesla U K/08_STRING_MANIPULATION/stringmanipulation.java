package ooplab;

public class stringmanipulation {
	public static void main(String[] args) {
		char arrSample[]= {'R','O','S','E'};
		String strSample1=new String (arrSample);
		System.out.print(strSample1+"\n");
		System.out.println("Length of"+strSample1+"is:"+strSample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.print(strSample2+"\n");
		String strSample3=strSample1.concat(strSample2);
		System.out.print(strSample3+"\n");
		String strSample4=strSample1+strSample2;
		System.out.print(strSample4+"\n");
		System.out.println("3 rd char of"+strSample4+"is :"+strSample4.charAt(2));
		char but[]=new char[3];
		strSample4.getChars(2,5,but,0);
		System.out.println("Extracted chars:"+strSample4+""+new String(but));
		String strSample="Rockstar";
		System.out.println(strSample.compareTo("ROCKSTAR")+"\t");
		System.out.println(strSample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.println(strSample.equals("ROCKSTAR")+"\t");
		System.out.println(strSample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("Rockstar start with 'RO'"+strSample.startsWith("RO"));
		System.out.println("Rockstar end with 'star'"+strSample.endsWith("star"));
		System.out.println("Rockstar contain 'tar'"+strSample.startsWith("tar"));
		System.out.println("Index of 't' Rockstar:"+strSample.indexOf("t"));
		System.out.println("Index of 'star' Rockstar:"+strSample.startsWith("star"));
		System.out.println("All caps-Rockstar:"+strSample.toUpperCase());
		System.out.println("All small-Rockstar:"+strSample.toLowerCase());
		System.out.println("Replace start with 'et':"+strSample.replace("star","et"));
		String dval="3.456";
		String ival="6";
		System.out.print("Doble value of ival is:"+Integer.valueOf(ival));
		double a=Double.valueOf(dval);
		int b=Integer.valueOf(ival);
		System.out.println(a+b);	
	}

}
