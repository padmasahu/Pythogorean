class Pythogorean {
    static void pythogoreanTriplet(int N){
        long a,b,c=0;

        long m =2;

        while(c<N){
            for(int n=1;n<m;n++){
                a = m*m -n*n;
                b = 2*m*n;
                c = m*m+n*n;


               if(a+b+c ==N)
                   System.out.println(a +" "+b+" "+c);
            }
            m++;
        }
    }
    public static void main(String[] args){
        int N = 1000;
        pythogoreanTriplet(N);
    }
}
