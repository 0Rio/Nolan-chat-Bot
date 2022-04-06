
import java.util.Random;

public class emotion {

    protected int angryRig, sadRig, happyRig, anxiousRig;
    protected boolean angry, sad, happy, neutral;
   


    public emotion(){
        //boolean value
     angry= false;
     sad= false;
     happy=false;
     neutral = true;


     //integer values
     angryRig = 0;
     sadRig = 0;
     happyRig = 0;
     anxiousRig=0;
    
     Random rand = new Random();
     int emotic = (rand.nextInt(4));
    

    if (emotic == 1)
    {
     angry= false;
     sad= false;
     happy=false;
     neutral = true;
    }

    else if(emotic ==2)
    {
     angry= false;
     sad= true;
     happy=false;
     neutral = false;
    }

else if(emotic==3){
    angry= false;
     sad= false;
     happy=true;
     neutral = false;
}
    

else if(emotic ==4)
{
     angry= true;
     sad= false;
     happy=false;
     neutral = false;
}
    }




   }







