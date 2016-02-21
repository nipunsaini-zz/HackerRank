package com.hacker.rank;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

class Output{
	public double main(int a) throws NumberFormatException{
        if(a > 0)
            return (double)a*a*a;
        else
            throw new NumberFormatException("All the values must be positive");
	}
	public double main(int l, int b, int h) throws NumberFormatException{
        if(l > 0 && b > 0 && h > 0)
            return (double) l*b*h;
		else
            throw new NumberFormatException("All the values must be positive");
	}
	public double main(double r) throws NumberFormatException{
        if(r > 0)
            return (2*Math.PI*r*r*r)/3;
        else
            throw new NumberFormatException("All the values must be positive");
	}
	public double main(double r, double h) throws NumberFormatException{
        if(r > 0 && h > 0)
            return (Math.PI*r*r*h);
        else
            throw new NumberFormatException("All the values must be positive");
	}
	public void display(double volume){
		DecimalFormat df = new DecimalFormat("#.000");
		System.out.println(df.format(volume));
	}
    
}

class Calculate {
	
	private static Scanner scan;
	public static Output output;
	
	static {
		scan = new Scanner(System.in);
        output = new Output();
	}
	
	public int getINTVal() throws IOException{
		return scan.nextInt();
	}
	public double getDoubleVal() throws IOException{
		return scan.nextDouble();
	}
	
	public static Output get_Vol(){
		return output;
	}
	
	public static void main(String[] args){
		new Calculate().output.display(Calculate.get_Vol().main(6.787d,7.898));
		
		
	}
	
		
}
