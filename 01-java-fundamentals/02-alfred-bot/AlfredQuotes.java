import java.util.Date
public class AlfredQuotes {
     /*
    * Inputs: None
    * Return Type: String
    * Description: Returns a generic greeting that Alfred will say to anyone.
    */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    /* 
    * Inputs: String name, String dayPeriod 
    *                      Assume "morning", "afternoon" or "evening".
    * Return Type: String
    * Description: Returns a greeting that includes the person's name
    *         as well as the day period. For example:
    *        "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
    public String guestGreeting(String name, String dayPeriod) {
        String GuestGreeting= String.format("Good %s , %s . Lovely to see you", dayPeriod, name);
        // the following would also work-- String GuestGreeting="Good "+dayPeriod+", "+name+". Lovely to see you.";
        return GuestGreeting;
    }
    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    import java.util.Date;
    public String dateAnnouncement() {
        public String getCurrentDate() {
            Date date = new Date();
}
        return date;
    String DateAnnounce="Greetings. The date today is "+date;
        return DateAnnounce;
    }
    
    /*********************************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation. 
    If "Alexis" appears in the conversation return a snarky response, such as:
    "Right away, sir. She certainly isn't sophisticated enough for that." 
    
    If "Alfred" is in the conversation return an obliging response, for example: 
    "At your service. As you wish, naturally." 
    
    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire." 
    **********************************************/
    /*
    * Inputs: String (A conversation)
    * Return Type: String (Something Alfred would say in response)
    * 
    * Tip: Use the indexOf String method
    */
    public String respondBeforeAlexis(String conversation) {
        int AlexisIndex= conversation.indexOf("Alexis");
        if (AlexisIndex>-1){
            String Repsonce="Well actually, I may be better suited to answer that";
        }
        else{
            String Responce="...";
        }
        return Responce;
    }
    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    //input: conversation, return type:string
    public String RespondCleaning(String conversation) {
        int SpiderIndex= conversation.indexOf("spider");
        if (SpiderIndex>-1){
            String Respond = "Maybe it's time to dust the bat-cave";
        }
        else{
            String Respond="..."
        }
        return Respond;
    }
}

