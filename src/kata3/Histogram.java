package kata3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Histogram<T> {
    private final HashMap<T,Integer> map;

    public Histogram(HashMap<T, Integer> map) {
        this.map = map;
    }
    
    public int get(T clave){
        return map.get(clave);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T clave){     
        if (map.containsKey(clave)){
            map.put(clave, map.get(clave) + 1);
        } else {
            map.put(clave, 1);
        }
    }
    
    
}
