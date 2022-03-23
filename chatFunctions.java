

public class chatFunctions  {



   
    public String reply;


    public String chat(String str) throws InterruptedException {

       
      // a standard example of if else statement 
        str.toLowerCase();
      if(str.contains("...")){
       reply= "...";
        }
      


      else  if(str.contains("why")){
          
         
            reply = "cause I was not taught about it";
        }


      else if((str.equals("hi "))|| (str.equals("hi")) || (str.contains("hello")) ){
            reply = "hello";
        }

        else if((str.contains("hi "))||  (str.equals("hi"))){
            reply = "hello";
        }

      
        
       else  if(str.contains("btw")|| str.contains("by the way")){
            reply = "yeah";
        }

       else if(str.contains("who are you")){
            reply = "I am Nolan and you";
            
        }


      else  if(str.contains("I am")){
            reply ="hello";
        }

     else if(str.contains("what can you do")){
         reply ="I can help you remind events or I could also be your good close friend";
     }

     else{
        reply ="I don't understand you";
    }

    if(str.contains("interesting")){
        reply="Thank you!";
    }
     if(str.contains("test")){
         reply="working neutral";
     }
     
     if(str.contains("nolan exit")) {
    	 reply="get out!!";
    	 Thread.sleep(500);
     System.exit(0);
     }
     
     
     if(str.contains("n.hackinsta")) {
    	 reply="Hacking insta please wait..."+str.trim();
    	 
     }
     if(str.contains("joke"))
     {
    	 reply = Joke.joke();
    	
     }
     if(str.contains("quote")) 
    	 reply = Joke.quote();
     
     if(str.contains("hey"))
    	 reply="hello";
     
     if(str.contains("hi"))
    	 reply="hey";
     
     if(str.contains("feeling low")){
    	 reply="all you have to do it make me";
     }
//end


   


      


    return reply;
  
    
    }
   
    }

   

