/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4_entier;

/**
 *
 * @author dname
 */
public class ex1 {
        /**
        * @param args the command line arguments
        */
        public static void main(String[] args) {
            // TODO code application logic here
            int[] tabInt = new int[args.length];
            
            for(int j = 0; j < args.length; j++){
                String s = args[j];
                boolean isNegative = false;
                int number = 0;
                if(s.charAt(0) == '-'){
                    isNegative = true;
                }
                for(int i = s.length()-1; i >= 0; i++){
                    int v = java.lang.Character.getNumericValue(s.charAt(i));
                    if(v != -1){
                        number += v * Math.pow(10,s.length() - i);
                    } else if(isNegative && i == 0){
                        //donothing it's ok
                    } else {
                        //error
                        return;
                    }
                }
                if(isNegative){
                    number *= -1;
                }
                tabInt[j] = number;
            }
            
            //tri
            for(int i = 0; i < tabInt.length; i++){
                for(int j = 0; j < tabInt.length; j++){
                    if(tabInt[i] < tabInt[j]){
                        int t = tabInt[i];
                        tabInt[i] = tabInt[j];
                        tabInt[j] = t;
                    }
                }
                System.out.println(tabInt[i]);
            }
        }
}
