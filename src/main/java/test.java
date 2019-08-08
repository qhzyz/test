import java.util.Date;

class TestClass {
    public int [] numbers = {10, 20, 30, 40, 50};
   public void foo(){
       long b=new Date().getTime();
   }
    public void  illegal() {
        for(int x:numbers ){
            int a = x+1;
            a=x+2;
            while(x!=a)
            {
                if(x==3) {
                    while (x == a) {
                        for (int i = 0; i < 4; i++) {
                            x += (2 + a) * 3;
                        }
                    }
                }
            }
        }
    }
}
