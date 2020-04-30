public class exercise5{
    public static void main(String[] args){
        int[] x = {20, 30, 40, 50};
        
        int total = 0;
        for(int element : x){
            total += element;
        }  
        System.out.println("Total = "+total);
        
        int average = 0;
        if(x.length > 0){
            average = total / x.length;
        }
        System.out.println("Average = "+average);

        index.main(null);
    }
}