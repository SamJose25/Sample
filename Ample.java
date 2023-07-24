class Ample
{
    public static void main(String arh[])
    {

        int a=120;
        boolean bool=true;
        
        
        if(a==2)
        {
            System.out.println("The given numnber prime:"+a);
            bool=false;
        }
        else
        {

            for(int i=3;i<a;i+=2)
            {
                if(a%2==0)
                {
                    System.out.println("The given numnber not prime:"+a);
                    bool=false;
                    break;
                }

                if(a%i==0)
                {
                    System.out.println("The given numnber not prime:"+a);
                    bool=false;
                    break;
                }
            }
        }

        if(bool==true)
        {
        
            System.out.println("The given numnber prime:"+a);
            
        }
    }
}
