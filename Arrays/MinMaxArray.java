class Compute
{
    static pair getMinMax(long a[], long n)
    {
        //Write your code here
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;

        for(long i:a){
            if(i>=max)
                max=i;
            if(i<=min)
                min=i;
        }

        pair res=new pair(min,max);
        return res;
    }
}