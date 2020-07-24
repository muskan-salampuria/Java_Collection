package task.collections.customCollection;

public class App 
{
    public static void main( String[] args )
    {
        ArrayListCustom<Integer> myList = new ArrayListCustom<Integer>();
        myList.createCustomArrayList(myList);
        myList.remove(9);
        myList.add(52);
        myList.add(53);
        myList.add(54);
        myList.add(55);
        myList.add(98);
        myList.print(myList);
        myList.remove(3);
        myList.print(myList);
        myList.set(3, 55);
        myList.print(myList);
        myList.fetchElement(10, myList);
    }
}