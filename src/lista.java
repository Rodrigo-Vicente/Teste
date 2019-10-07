

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo
 */
public class lista {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2,5);
        
        System.out.println(list.size());
        
       
        for( int x : list){
            System.out.println(x);
        }
         
        System.out.println("----------------------------");
        System.out.println("localizar: "+ list.indexOf(2));
}
}