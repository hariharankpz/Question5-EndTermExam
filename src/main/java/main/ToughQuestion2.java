package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        int m;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	int f =(cal.calculateCalories(bread));
                        	 double o = calculateEnergy(f);
                        	 System.out.println(o +"kJ of energy generated from "+ f+" calories");
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	int f1 = (cal.calculateCalories(bread,jam));
                         	double o1 = calculateEnergy(f1);
                       	    System.out.println(o1 +"kJ of energy generated from "+ f1+" calories");
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                            cal.calculateCalories(bread,jam,butter);
                            int f2 =(cal.calculateCalories(bread));
                   	        double o2 = calculateEnergy(f2);
                   	 System.out.println(o2 +"kJ of energy generated from "+ f2+" calories");
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.println();
                        	break;
                        }
                       }
                        //System.out.println(o);
                      // System.out.println(" kJ of energy generated from "+ca1.returnCalories()+" calories");
            

			private static double calculateEnergy(int f) {
				// TODO Auto-generated method stub
				 double g = f*4.1868 ;
                 return g;
			}
}
class Calories {
            int calculateCalories(int bread) {
            	int l = returnCalories(bread);
            	return l;
            }
            int calculateCalories(int bread,int jam) {
            	int hari =bread*74+jam*26;
            	return hari;
                }
            int calculateCalories(int bread,int jam,int butter) {
                
            	int hari =bread*74+jam*26+butter*102;
            	return hari;
                }
      int  returnCalories(int bread){
    	  System.out.println(bread);
        	int k =bread*74;
        	return k;
        }
            
}