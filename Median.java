void main() {
    medianOfTwoArray(new int[] {4,3,2,1} , new int[] {7,6,8,5,9});
}

void medianOfTwoArray(int [] arr1, int[] arr2 ){
    int [] arr= new int[arr1.length+arr2.length];
    int i = 0;
    float med = 0;


    for (int j = 0; j < arr1.length; j++) {
        arr[i]=arr1[j];
        i ++;
    }
    for (int j = 0; j < arr2.length; j++) {
        arr[i]=arr2[j];
        i++;

    }
    Arrays.sort(arr);
    if(arr.length % 2 == 0){
        med = (float) (arr[arr.length/2 -1]+arr[arr.length/2 ])/2;
    }else {
        med =  arr[arr.length/2 ];
    }

    System.out.println(med);
}