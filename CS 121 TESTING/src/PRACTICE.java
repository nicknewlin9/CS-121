/*
*******************************************************************
* Practice Program
* Name: Nicholas Newlin
* Date of Submission ()
* CS 121 Data Structures and Objects
******************** Program Documentation ************************
*
*
*
*
*******************************************************************
*/
import java.util.ArrayList;
public class PRACTICE
{
    private Node node;
    public void add (int value)
    {
        if (node == null)
        {
            node = new Node(value);
        }
        else
        {
            while (node.next==null)
            {
                node = node.next;
            }
        }
    }
    class Node{
        private int value;
        private Node next;
        Node (int value)
        {
            this.value=value;
        }
    }
}
