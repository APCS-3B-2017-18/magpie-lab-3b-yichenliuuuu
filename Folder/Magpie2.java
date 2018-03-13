/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magpie2;

/**
 *
 * @author Yichen
 */
public class Magpie2 {
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf(" no ") >= 0)
		{
			response = "Why not?";
		}
		else if (statement.indexOf(" mother ") >= 0
				|| statement.indexOf(" father ") >= 0
				|| statement.indexOf(" sister ") >= 0
				|| statement.indexOf(" brother ") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if (statement.indexOf(" dog ") >= 0 
                                || statement.indexOf(" cat ") >=0 
                                || statement.indexOf(" fish ") >=0 
                                || statement.indexOf(" lizard ") >=0 )
                {
                        response = "Tell me more about your pets.";                       
                }
                else if (statement.indexOf(" Mr. ") >=0)    
                    response = "He sounds like a good teacher.";
                else if (statement.indexOf(" Mrs. ") >=0)    
                    response = "She sounds like a good teacher.";
                else if (statement.trim().equals("")) 
                    response = "Say something, please."; 
                else if (statement.indexOf("What") >=0 || statement.indexOf("what") >=0)      
                    response = "Why don't you tell me. I'm not that intellegent.";
                else if (statement.indexOf("?") >=0 )
                    response = "That is an interesting question.";
                else if (statement.indexOf("dumb")>=0 || statement.indexOf("hell") >=0
                          ||statement.indexOf("ass")>=0 || statement.indexOf("hate") >=0 )
                    response = "I do not appreciate what you are saying.";
                else 
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
                else if (whichResponse == 4)
		{
			response = "I guess so.";
		}
                else if (whichResponse == 5)
		{
			response = "You bore me.";
		}

		return response;
	}
}
