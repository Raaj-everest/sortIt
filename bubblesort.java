import java.util.Scanner;
public class bubblesort{
    public static void main(String[] args) {
        
    System.out.println("Enter the array size :");
    
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] arr = new int[size];
    for(int i =0; i<size; i++)
    {
        arr[i] = sc.nextInt();
    }
    sc.close();


    int count =0;
 
        while(count<size)
        {
            for (int i=0; i<size-1; i++)
            {
                if (arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                
            
            }
            count ++;
        }
        for(int j=0; j<size ; j++)
        {
            System.out.print(+arr[j] + " ");
        }
    }
}