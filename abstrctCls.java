abstract class kid{
    String  name ;
    int Licensno;
     public void setName(name)
     {
         this.name= name;
     }
    public String getName()
    {
        return name;
    }
    public abstract void getLiceno();
}
class parent extends kid{
    public void getLiceno(){
       System.out.println("this is under parent"); 
    }
}

public class abstrctCls{
  public static void main(String args[]){
  
    kid obj = new parent();
      obj.setName("JAYANTH");
    obj.getLiceno();
    
    
  }
}

