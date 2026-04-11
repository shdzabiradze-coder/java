void main() {
   reverceInteger(158);
}
void reverceInteger(int n){
    int sum = 0;
    while(n>0){
        sum =sum*10;
        sum = sum + n%10;
        n=n/10;

    }
    System.out.println(sum);
}