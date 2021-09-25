public class Rocket implements Spaceship{
    long cost;
    long weight;
    long max_weight;
    double chance_of_launch_exploding;
    double chance_of_landing_crash;
    Rocket(){}
    Rocket(long cost,long weight,long max_weight,double chance_of_launch_exploding,double chance_of_landing_crash){
        this.cost=cost;
        this.weight=weight;
        this.max_weight=max_weight;
        this.chance_of_launch_exploding=chance_of_launch_exploding;
        this.chance_of_landing_crash=chance_of_landing_crash;
    }
    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item i) {
        if(weight+i.weight<=max_weight)
            return true;
        else
            return false;
    }

    public void carry(Item i) {
        if(canCarry(i))
        {
            weight+=i.weight;
        }
    }

}
