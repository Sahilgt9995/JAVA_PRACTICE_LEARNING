package linear_DS_hashtable;

import java.util.List;
import java.util.ArrayList;


class Node
{
    int key;
    String value;

    Node(int key,String value)
    {
        this.key=key;
        this.value=value;
    }
}

//HASH TABLE Fuctions
class HashTable
{
    private int size;
    private List<List<Node>> table;

    HashTable(int size)
    {
        this.size=size;
        this.table=new ArrayList<> (size);
        for (int i=0;i<size;i++)
        {
            table.add(new ArrayList<> ());
        }

    }

    public int hashFunction(int key)
    { System.out.println("THE index for the key :"+key+ "is===>"+key%size);
        return key%size;

    }
    public void insert(int key,String value)
    {
        int index= hashFunction(key);
        List<Node> list=table.get(index);
        Node n=new Node(key, value);
        list.add(n);

    }

    String search(int key)
    {
        int index=hashFunction(key);
        List<Node> list =table.get(index);
        for(Node node:list)
        {
            if(node.key==key)
            {
                return node.value;
            }

        }
        return null;

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int tablesize=10;
        HashTable ht=new HashTable(tablesize);

        ht.insert(5,"gabbar");
        ht.insert(9,"bahubali");
        ht.insert(33,"kattapa");

//        if(ht.search(5)!=-1)
//        {
//            System.out.println("Key is found");
//        }
//        else
//        {
//            System.out.println("NOPE Bad luck key not found");
//        }
//

    }
}