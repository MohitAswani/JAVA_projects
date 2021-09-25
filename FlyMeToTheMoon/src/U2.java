import java.lang.*;
public class U2 extends Rocket{
    U2()
    {
        super(120000000,18000,29000,0.0,0.0);
    }

    @Override
    public boolean land() {
        chance_of_landing_crash=0.04*(this.weight/(double)this.max_weight);
        double r=Math.random();
        if(chance_of_landing_crash>r)
            return false;
        else
            return true;
    }
    public boolean launch() {
        chance_of_launch_exploding=0.08*(this.weight/(double)this.max_weight);
        double r=Math.random();
        if(chance_of_launch_exploding>r)
            return false;
        else
            return true;
    }
}
