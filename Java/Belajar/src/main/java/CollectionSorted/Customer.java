/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Feri Winarta
 */
public class Customer {
    private int id;
    private List<String> email;
    
    // unmodifiable collection, collection dapat diakses oleh kelas lain
    // karena method mengembalikan sebuah kelas yang tentu memiliki
    // method built  in
//    public List<String> getEmail() {
//        return email;
//    }
    
    public List<String> getEmail(){
        if(email == null) {
            return email = new ArrayList<>();
        }
        return Collections.unmodifiableList(email);
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }
    
    public void addEmail(String email){
        if(email == null ){
            this.email = new ArrayList<String>();
        }
        this.email.add(email);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
