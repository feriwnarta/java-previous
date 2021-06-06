package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class Cust {
    private int id;
    
    public Cust(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
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
        final Cust other = (Cust) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}

public class SetApp {
    public static void main(String[] args) {
        Set<Cust> collection = new HashSet<>();
        Cust c1 = new Cust(10);
        Cust c2 = new Cust(20);
        Cust c3 = new Cust(30);
        Cust c4 = new Cust(10);
        Cust c5 = new Cust(10);
        
        collection.add(c1);
        collection.add(c2);
        collection.add(c3);
        collection.add(c4);
        collection.add(c5);
        
        Iterator<Cust> i = collection.iterator();
        while(i.hasNext()) {
            Cust c = i.next();
            System.out.println("keranjang no - " + c.hashCode() + 
                    " Idnya - " + c.getId());
        }
        
    }
}
