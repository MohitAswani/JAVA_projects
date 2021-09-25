import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Simulation {
    public ArrayList<Item> loadItems(String fileLocation)
    {
        ArrayList<Item> list=new ArrayList<>();
        try {
            File file = new File(fileLocation);
            Scanner inp = new Scanner(file);
            while(inp.hasNextLine())
            {
                String line=inp.nextLine();
                String [] arr=line.split("=");
                Item i=new Item();
                i.name=arr[0];
                i.weight=Integer.parseInt(arr[1]);
                list.add(i);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FILE NOT FOUND");
        }
        return list;
    }
    public ArrayList<U1> loadU1(ArrayList<Item> ls)
    {
        Iterator<Item> it=ls.iterator();
        ArrayList<U1> rockets=new ArrayList<>();
        while(it.hasNext())
        {
            U1 r1=new U1();
            while(it.hasNext())
            {
                Item currIt=it.next();
                if(r1.canCarry(currIt))
                {
                    r1.carry(currIt);
                }
                else
                {
                    break;
                }
            }
            rockets.add(r1);
        }
        return rockets;
    }
    public ArrayList<U2> loadU2(ArrayList<Item> ls)
    {
        Iterator<Item> it=ls.iterator();
        ArrayList<U2> rockets=new ArrayList<>();
        while(it.hasNext())
        {
            U2 r1=new U2();
            while(it.hasNext())
            {
                Item currIt=it.next();
                if(r1.canCarry(currIt))
                {
                    r1.carry(currIt);
                }
                else
                {
                    break;
                }
            }
            rockets.add(r1);
        }
        return rockets;
    }
    public long runSimulation(ArrayList<U1> rkts)
    {
        long cost=0;
        for(Rocket r:rkts)
        {
            if(r.launch()&&r.land())
            {
                cost+=r.cost;
            }
            else
            {
                cost+=2*r.cost;
            }
        }
        return cost;
    }
}
