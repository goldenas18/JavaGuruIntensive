package io.github.javaGruIntensive;



public class PrimeNumbers {
    public static void main(String[] args) {
        int primeNumberSum=0;
        int primeNumbersCount=0;
        int i ;
        int num ;
        String primeNumbers = "";
for (i=1;i<=500;i++){
    int counter=0;
       for (num=i; num>=1; num--){

         if(i%num==0||i==17||i==71){
          counter =counter+1;
    }
}
       if (counter==2){
        primeNumbers=primeNumbers+i+" ";
        primeNumbersCount=primeNumbersCount++;
        primeNumberSum = primeNumberSum+i;

        }

       if (primeNumbersCount==50){
          break;
       }

    }
            System.out.println("First 50 prime numbers from 1 to 500 are :");
            System.out.println(primeNumbers);
            System.out.println("Sum of prime numbers above is " + primeNumberSum);
    }
}