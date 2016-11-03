/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author chris
 */
public class StartUp {
    public static void main(String[] args) {
        Map favoriteCars = new HashMap();

        List favFords = new ArrayList();
        favFords.add("Ford GT");
        favFords.add("Shelby GT350");
        
        List favChevy = new ArrayList();
        favChevy.add("Corvette");
        favChevy.add("Camarro");
        
        favoriteCars.put("Ford" , favChevy);
        favoriteCars.put("Chevy", favFords);

        Set keys = favoriteCars.keySet();
        
        for(Object key : keys){
            String k = (String)key;
            System.out.println(k);
        }
        
        Collection values = favoriteCars.values();
        for(Object value : values){
		List v = (List) value;
		System.out.println(v);
        }
    }
}
