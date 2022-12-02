import java.util.Scanner;
public class DynamicArrayExample1 {
    //string name;
    private int array[];
    private int count;
    private int sizeofarray;
    public DynamicArrayExample1()
    {
        array = new int[1];
        count = 0;
        sizeofarray = 1;
    }
    public void addElement(int a)
    {
        if (count == sizeofarray)
        {
            growSize();
        }
        array[count] = a;
        count++;
    }
    public void growSize()
    {
        int temp[] = null;
        if (count == sizeofarray)
        {
            temp = new int[sizeofarray * 2];
            {
                for (int i = 0; i < sizeofarray; i++)
                {
                    temp[i] = array[i];
                }
            }
        }
        array = temp;
        sizeofarray= sizeofarray * 2;
    }
    public void addElementAt(int index, int a)
    {
        if (count == sizeofarray)
        {
            growSize();
        }
        for (int i = count - 1; i >= index; i--)
        {
            array[i + 1] = array[i];
        }
        array[index] = a;
        count++;
    }




    public static void main(String[] args) {
        System.out.println("Hellow World!");
        int element;
        int counter;
        element=9;
        counter=0;
        Scanner scanner = new Scanner(System.in);


        DynamicArrayExample1 da = new DynamicArrayExample1();
        System.out.println("Продолжайте ввод новых элементов, для окончания ввода введите ,букву");
        while (true) {
            if (scanner.hasNextInt()) {
                element = scanner.nextInt();
                System.out.println(element);
            } else {
                break;
            }
            da.addElement(element);


        }
        int summ=0;
        int cc=0;
        int[] dainit={1,2,3,4,5,6,7,8,9,10};
        System.out.println("mas.For = 1,2,3,4,5,6,7,8,9,10");
        for (int i = 0; i < dainit.length; i++) {
            summ+=dainit[i];
            cc++;
        }
        System.out.println("For Сумма = "+summ);
        float z=(float)summ/(float)cc;
        System.out.println("Среднее арифм= "+z);
        summ=0;
        while (counter != da.array.length)
        {
            summ+=da.array[counter];
            counter++;
        }
        System.out.println("While Сумма = "+summ);
        summ=0;
        counter=0;
        int min=da.array[0];
        int max=min;
        do {
            summ+=da.array[counter];
            if (min>da.array[counter]) min=da.array[counter];
            if (max<da.array[counter]) max=da.array[counter];
            counter++;
        } while(counter != da.array.length);
        System.out.println("Until Сумма = "+summ);
        System.out.println("Max= "+ max + "   Min= "+min);
    }
}
