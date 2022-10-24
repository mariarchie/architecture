public abstract class Flash {
    public int Location;
    public int Angle;
    public String Colour;
    public int Power;


    protected Flash(int Point3D, int Angle3D, String Colour, int Float ) {
        this.Location = Point3D;
        this.Angle = Angle3D;
        this.Colour = Colour;
        this.Power = Float;
    }

    public void Rotate(int Angle3D){
        return;
    } 

    public void Move(int Point3D){
        return;
    } 
}

    
    