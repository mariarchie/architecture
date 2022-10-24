public class ModelElements {
    public abstract class Scene {
        public int id;
        public PoligonalModel models;
        public Flash flash;
        public Camera camera;
    
        public Scene(PoligonalModel aPoligonalModel, Flash aFlash, Camera aCamera) {
            models = aPoligonalModel;
            flash = aFlash;
            camera = aCamera;
        }    
    
        public PoligonalModel Method1(PoligonalModel smth) {
            return smth;
        }
    }
}
