void main() {
        System.out.println("Hello and welcome!");
        int [] arr= {1,2,3,4};

sumFind(arr, 5);
}

void sumFind(int [] array , int target){
    for (int i = 0; i <array.length/2; i++) {
        for (int j = 0; j < array.length; j++) {
            if (array[i]+array[j]==target){
                System.out.println(i + "and" + j) ;

            }

        }

    }
}