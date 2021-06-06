/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramerWorkk;

import java.util.Comparator;

/**
 *
 * @author Feri Winarta
 */

public class CustomerComparator implements Comparator<Customer>{

    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }

}

