package com.startdima.test.chapter3.container;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
 
/**
 * 
 * https://blog.csdn.net/yo_bc/article/details/79316724
 *
 */
public class TreeMapTest {
    
    public static void main(String[] args) {
       
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "aa");
        map.put(2, "bb");
        map.put(4, "cc");
        map.put(1, "dd");
        map.put(5, "dd");
        map.put(6, "ee");
        System.out.print("original: ");
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            int key = (Integer)e.getKey();
            String val = (String)e.getValue();
            System.out.print(key + " " + val + (it.hasNext() ? ", " : "."));
        }
        System.out.println();
        System.out.println("-------------------------------");
        map.remove(6);
        System.out.print("after remove: ");
        it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            int key = (Integer)e.getKey();
            String val = (String)e.getValue();
            System.out.print(key + " " + val + (it.hasNext() ? ", " : "."));
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println(3 + "'s val: " + map.get(3));
        System.out.println(3 + "'s higherKey: " + map.higherKey(3));
        Map.Entry tmp1 = map.higherEntry(3);
        System.out.println(3 + "'s higherEntry: " + (Integer)tmp1.getKey() + " " + (String)tmp1.getValue());
 
        System.out.println(3 + "'s lowerKey: " + map.lowerKey(3));
        Map.Entry tmp2 = map.lowerEntry(3);
        System.out.println(3 + "'s lowerEntry: " + (Integer)tmp2.getKey() + " " + (String)tmp2.getValue());
        
        System.out.println("firstKey: " + map.firstKey() + ", " + "lastKey: " + map.lastKey());
        System.out.println();
        
        TestUserDefined();
        
        TestTwoDimensional();
        
    }
    
    private static class Node implements Comparable<Node> {
        int a, b;
        public Node(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Node o) {
            // TODO Auto-generated method stub
            if(this.a == o.a) {
                return (this.b < o.b) ? 1 : -1;
            }
            else {
                return (this.a > o.a) ? 1 : -1;
            }
        }
        public String toString() {
            return "{ " + this.a + "," + this.b + " }";
        }
    }
    
    private static class mycmp implements Comparator<Node> {
 
        @Override
        public int compare(Node o1, Node o2) {
            // TODO Auto-generated method stub
            if(o1.a == o2.a) {
                return o1.b - o2.b;
            }
            return o2.a - o1.a;
        }
        
    }
    
    private static void TestUserDefined() {
        // By Comparable接口
        TreeMap<Node, String> map1 = new TreeMap<>();
        map1.put(new Node(3, 2), "aa");
        map1.put(new Node(3, 4), "bb");
        map1.put(new Node(5, 8), "cc");
        map1.put(new Node(5, 7), "dd");
        map1.put(new Node(6, 9), "ee");
        Iterator it1 = map1.entrySet().iterator();
        while(it1.hasNext()) {
            Map.Entry e = (Map.Entry)it1.next();
            System.out.println((Node)e.getKey() + ": " + (String)e.getValue());
        }
        
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        
        // By Comparator接口
        TreeMap<Node, String> map2 = new TreeMap<>(new mycmp());
        map2.put(new Node(3, 2), "aa");
        map2.put(new Node(3, 4), "bb");
        map2.put(new Node(5, 8), "cc");
        map2.put(new Node(5, 7), "dd");
        map2.put(new Node(6, 9), "ee");
        Iterator it2 = map2.entrySet().iterator();
        while(it2.hasNext()) {
            Map.Entry e = (Map.Entry)it2.next();
            System.out.println((Node)e.getKey() + ": " + (String)e.getValue());
        }
        System.out.println();
    }
    
    private static void TestTwoDimensional() {
        TreeMap<Integer, TreeMap<Integer, String>> mmp = new TreeMap<>();
        TreeMap<Integer, String> tmpMap = new TreeMap<>();
        tmpMap.put(1, "a");
        tmpMap.put(3, "b");
        tmpMap.put(2, "c");
        mmp.put(1, tmpMap);
        mmp.put(3, tmpMap);
        mmp.put(2, tmpMap);
        Iterator it = mmp.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            int key = (Integer)e.getKey();
            tmpMap = (TreeMap<Integer, String>)e.getValue();
            System.out.print(key + "-> { ");
            
            Iterator tmpIt = tmpMap.entrySet().iterator();
            while(tmpIt.hasNext()) {
                Map.Entry tmpe = (Map.Entry)tmpIt.next();
                int tmpkey = (Integer)tmpe.getKey();
                String tmpval = (String)tmpe.getValue();
                System.out.print(tmpkey + " " + tmpval + (tmpIt.hasNext() ? ", " : ""));
            }
            System.out.println(" }");
        }
    }
    
}
