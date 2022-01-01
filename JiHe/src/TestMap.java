import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        //Map<String,String> map=new HashMap<String,String>();//key唯一，无序,value不唯一
        //Map<String,String> map=new LinkedHashMap<String,String>();//key唯一，有序(添加顺序),value不唯一
        Map<String,String> map=new TreeMap<String,String>();//key唯一，有序(自然顺序),value不唯一


        map.put("cn","China");
        map.put("jp","Japan");
        map.put("us","the United States");
        map.put("fr","France");
        map.put("us","America");
        map.put("uk","the United Kingdom");
        map.put("en","the United Kingdom");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("us"));
        System.out.println(map.get("haha"));
        System.out.println(map.keySet());//key
        System.out.println(map.values());//value

        Set<String> keySet=map.keySet();
        Iterator<String> it=keySet.iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.println(key+"--------->"+map.get(key));
        }

        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }
    }
}
