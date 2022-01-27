import java.util.Scanner;

/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by
 *      '_'. For example, "The inventor of Java is _James Gosling_." The question should
 *      be displayed as: "The inventor of Java is ________."
 *
 * @author gcschmit
 * @version 27jan2022
 */

/*
 * The FillInQuestion class extends (i.e., is a subclass of, is derived from) the
 *      Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * DO NOT declare instance variables text and answer! The text and answer instance
     *      variables are inherited from the Question class!
     */
    
    
    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer.
     * 
     * @param question the specified question text with embedded answer
     */
    public FillInQuestion(String question)
    {
        /*
         * Explicitly call the Question class's constructor that takes a single parameter.
         *      Calling a superclass's constructor *must* be the first line of code in
         *      the subclass's constructor.
         *      
         *  If we don't explicitly call a superclass's constructor, Java with automatically
         *      call the superclass's default (i.e., no parameters) constructor.
         */
        super(question);
    }
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     *  Sets the question text and the answer.
     *  
     *  @param questionText the text of the question, including the answer
     */
    
    /*
     * Use the @Override annotation when overriding a method to help the compiler verify
     *      that you are in fact overriding and not overloading by mistake.
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();        // "The inventor of Java is "
        String answer = parser.next();          // "James Gosling"
        question += "________" + parser.next(); // "________."
        
        /*
         * The inherited instance variables are private; they cannot be directly accessed.
         *      We must use the mutator and access methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use the "super" reserved word to call the setText method as defined in
         *      the superclass (e.g., Question).
         */
        super.setText(question);
        
        /*
         * We should use the "this" reserved word to call the setAnswer method. If the
         *      subclass doesn't override the setAnswer method, the superclass's method
         *      will be called.
         *      
         *  We don't want to user the "super" reserved word in this case because if we
         *      later override setAnswer, the overriden method would not be called.
         */
        this.setAnswer(answer);
        
    }
}



