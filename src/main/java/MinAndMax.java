public class MinAndMax {
    
    
    public int max(int[]array){
        int max = 20;
        for(int i = 0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
                
            }
        }
        return max;
    }
    public int min(int[]array){
        int min = array[0];
        for(int i = 0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
        
    }
    public static void main(String arg[]){
        int[] myarray = { 23,78,78,98,56,888,9887,8776};
        MinAndMax m = new MinAndMax();
        System.out.println("maximum value in the array is ::"+m.max(myarray));
        System.out.println("minimum value in the array is ::" +m.min(myarray));
    }
}
