public class garmonica {
    public static double[] array= new double[10];
    public double summ;
    public garmonica()
    {
        //int i=1;
        double cc=0;
        for(int j=0;j<=9;j++)
        {
            array[j]=1/(cc+1);
            cc=cc+1;
        }

    }


    public static void main(String[] args) {
        garmonica gg = new garmonica();
        double summ =0.0 ;
        for(int j=0;j<=9;j++)
        {
            double value = gg.array[j];
            String result = String.format("%.2f",value);
            System.out.println();
            summ+=gg.array[j];

            System.out.print(result);
        }
        String resum = String.format("%.2f",summ);
        System.out.println();
        System.out.print("summ= " + resum);
    }


}
