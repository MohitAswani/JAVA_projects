import java.lang.*;
public class U1 extends Rocket{
    U1()
    {
        super(100000000,10000,18000,0.0,0.0);
    }

    @Override
    public boolean land() {
        chance_of_landing_crash=0.08*(this.weight/(double)this.max_weight);
        double r=Math.random();
        if(chance_of_landing_crash>r)
            return false;
        else
            return true;
    }
    public boolean launch() {
        chance_of_launch_exploding=0.04*(this.weight/(double)this.max_weight);
        double r=Math.random();
        if(chance_of_launch_exploding>r)
            return false;
        else
            return true;
    }

}
