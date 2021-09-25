public interface Spaceship {
    public boolean launch();
    public boolean land();
    public boolean canCarry(Item i);
    public void carry(Item i);
}
