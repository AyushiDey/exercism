class PrimeCalculator {
    Boolean primeCheck(int n){
        if(n<=1)
            return false;
        if(n==2||n==3)
            return true;
        for(int i = 2; i <= n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    int nth(int nthNumber) {
        int c = 0;
        int n = 2;
        if(nthNumber==0)
            throw new IllegalArgumentException();
        while(c!=nthNumber){
            if(primeCheck(n)){
                c++;
            }
            n++;
        }
        return n-1;
    }

}
