class PiTest{
    public static void main(String[] args){
        double pi=0,a=2,i,j;
        long n=1;
        for(i=1,j=1;n<1001L;i=Math.pow(j,a),pi=pi+(1/i),j++,n++);
            System.out.println(Math.sqrt(6*pi));
            System.out.println(n);
    }
}