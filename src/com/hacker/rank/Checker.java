package com.hacker.rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Player
{
	String name;
	int score;
}

public class Checker {
	
	public Comparator<Player> desc = new Comparator<Player>(){

		public int compare(Player o1, Player o2) {
			// TODO Auto-generated method stub
			
			int cmp =((Integer)o2.score).compareTo((Integer)o1.score);
			if(cmp == 0){
				return o2.name.compareTo(o1.name);
			}
			return cmp;
		}
		
	};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       
		  int N=Integer.parseInt(br.readLine().trim());
		  String s;
		  StringTokenizer st;
		  Player Player[]=new Player[N];
		  Checker check=new Checker();
		  for(int i=0;i<N;i++)
		  {
			  s=br.readLine().trim();
			  st=new StringTokenizer(s);
			  Player[i]=new Player();
			  Player[i].name=st.nextToken();
			  Player[i].score=Integer.parseInt(st.nextToken());
		  }
		 
		  Arrays.sort(Player,check.desc);
		  for(int i=0;i<Player.length;i++)
		  {
				System.out.printf("%s %s\n",Player[i].name,Player[i].score);
		  }

			
	    }

	
}

