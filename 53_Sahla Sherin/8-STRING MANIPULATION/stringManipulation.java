package OOPSLAB;

public class stringManipulation {
	public static void main(String[] args) {
		char arrSample[]= {'R','O','S','E'};
		String strSample1= new String(arrSample);
		System.out.println("1."+strSample1+"\t");
		System.out.println("2.length of "+strSample1+" is: "+strSample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.println("3."+strSample2+"\t");
		String strSample3=strSample1.concat(strSample2);
		System.out.println("4."+strSample3+"\t");
		String strSample4=strSample1+strSample2;
		System.out.println("5."+strSample4+"\t");
		System.out.println("6.Third char of "+strSample4+" is: "+strSample4.charAt(2));
		char buf[]=new char[3];
		strSample4.getChars(2, 5, buf, 0);
		System.out.println("7.Extracted chars: "+strSample4+"  "+new String(buf));
		String strSample="ROCKSTAR";
		System.out.println("8."+strSample.compareTo("ROCKSTAR")+"\t");
		System.out.println("9."+strSample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("10."+strSample.equals("ROCK")+"\t");
		System.out.println("11.ROCKSTAR strats with 'RO': "+strSample.startsWith("RO"));
		System.out.println("12.ROCKSTAR ends with 'STAR': "+strSample.endsWith("STAR"));
		System.out.println("13.ROCKSTAR contains 'TAR': "+strSample.contains("TAR"));
		System.out.println("14.Index of 'T': "+strSample.indexOf("T"));
		System.out.println("15.Index of 'STAR': "+strSample.indexOf("STAR"));
		System.out.println("16.To LOWERCASE : "+strSample.toLowerCase());
		System.out.println("17.REPLACE : "+strSample.replace("STAR","ET"));
		
		String dVal="3.456";
		String iVal="6";
		System.out.println("18.Double value of dval is:"+Double.valueOf(dVal));
		System.out.println("19.Double value of dval is:"+Integer.valueOf(iVal));
		double a=Double.valueOf(dVal);
		int b=Integer.valueOf(iVal);
		System.out.println("20."+a+b);
	}
}
