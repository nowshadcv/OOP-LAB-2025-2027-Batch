package OOPLAB;

public class Stringmanipulation {
	public static void main(String[] args) {
		char arrSample[]= {'R','O','S','E'};
		String strSample1=new String(arrSample);
		System.out.println(strSample1+"\t");
		System.out.println("length of" + strSample1+"is:"+strSample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.print(strSample2+"\t");
		String strSample3=strSample1.concat(strSample2);
		System.out.print(strSample3+"\t");
		String strSample4=strSample1+strSample2;
		System.out.println("3rd char of"+strSample4+"is:"+strSample4.charAt(2));
		char buf[]=new char[3];
		strSample4.getChars(2,5,buf,0);
		System.out.println("Extracted chard:"+strSample4+""+new String(buf));
		String strSample="Rockstar";
		System.out.print(strSample.compareTo("Rockstar")+"\t");
		System.out.println(strSample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.print(strSample.equals("Rockstar")+"\t");
		System.out.print(strSample.equalsIgnoreCase("Rockstar")+"\t");
		System.out.println("roclksatr srat eyth Ro"+strSample.startsWith("Ro"));
		System.out.print("rocls ends with star"+strSample.contains("tar"));
		System.out.print("roclstar comtains tar"+strSample.contains("tar"));
		System.out.println("inex f t"+strSample.indexOf("T"));
		System.out.print("index of star"+strSample.indexOf("star"));
		System.out.print("no caps-Rockstar:"+strSample.toLowerCase());
		System.out.print("All caps-Rockstar:"+strSample.toUpperCase());
		System.out.print("replcae star with et"+strSample.replace("star","et"));
		String dval="3.456";
		String ival="7";
		System.out.println("Double value of dval is:"+Double.valueOf(dval));
		System.out.println("integer value of ival is:"+Integer.valueOf(ival));
		double a=Double.valueOf(dval);
		int b=Integer.valueOf(ival);
		System.out.println(a+b);
	}

}
