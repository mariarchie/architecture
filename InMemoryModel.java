public class InMemoryModel{


    public abstract class ModelStore {
        public String Models;
        public String Flashes;
        public String Cameras;
        private int Scene;


        protected ModelStore(String PoligonalModel, String Flash, String Camera) {
            this.Models = PoligonalModel;
            this.Flashes = Flash;
            this.Cameras = Camera;
        }

        public int GetScene(){
            return Scene;
        } 

        public int findingErrors(){
            return 200;
        }

        public void NotifyChange(String IModelChanger){
            System.out.println("Smth's changed");
        }
    }

    public interface IModelChanger {
        public boolean NotifyChange (IModelChanger sender);
    }
}