/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }



    public void over(boolean over){
        if(over){
            face.setImage("chud");
            face.setMessage("It's so over");
        }
    }


    
    public int chud(String p, String o){
            return (o.indexOf(p));
    }

    public boolean Mogus(String m){
        return (m.toLowerCase()+" ").contains("among") || (m.toLowerCase()+" ").contains("us");
    }

    public void Sus(){
            System.out.println("SUSSY");
            face.setMessage("AMONG US");
            face.setImage("sus");
    }
    
    public void ecstatic(){
        face.setImage("ecstatic");
    }

    public void low(){
        face.setMessage("Too low, try again");
    }

    public void high(){
        face.setMessage("Too high, try again");
    }
    public void win(int c, int x) {
        face.setMessage("Congradulations, you got the number " + x + " after " + c + " tries");
        face.setImage("astonished");
    }
    public void enraged(){
        face.setImage("enraged");
    }

    public void joyful(){
        face.setImage("joyful");
    }
    public void happy(){
        face.setImage("happy");
    }
    public void normal(){
        face.setImage("normal");
    }
    public void sad(){
        face.setImage("sad");
    }
    public void pe(){
        face.setImage("pe");
    }
    public void vsad(){
        face.setImage("verysad");
    }
    public void depressed(){
        face.setImage("depressed");
    }
    public void skeleton(){
        face.setImage("skeleton");
    }
    public void pushingdaisies(){
        face.setImage("pushingdaisies");
    }
    public void angel(){
        face.setImage("angel");
    }

    public void changeFace(VirtualPet x, int c){
        if (c == 1) x.joyful();
        if (c == 2) x.happy();
        if (c == 3) x.normal();
        if (c == 4) x.sad();
        if (c == 5) x.pe();
        if (c == 6) x.vsad();
        if (c == 7) x.depressed();
        if (c == 8) x.skeleton();
        if (c == 9) x.pushingdaisies();
        if (c == 10) x.angel();
    }
    
}
 // end Virtual Pet
