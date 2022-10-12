package miniProjectPerfectNumbers;

public class Main {

    public static void main(String[] args) {
	int x = 6, sum = 0;
    for (int i=1; i<x; i++){
        if(x%i==0){
            sum+=i;
        }
    }
    if(x==sum){
        System.out.println(x+" is a perfect number.");
    }else{
        System.out.println(x+" is not a perfect number.");
    }
    }
}
