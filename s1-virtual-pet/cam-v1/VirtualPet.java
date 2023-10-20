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

} // end Virtual Pet
