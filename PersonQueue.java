//After a successful debut of your application as described
//in the previous part, a critic notices that there isn't any way
//to identify people who are ready to leave quarantine. Because 
//quarantines are only meant to last 14 days, you have been asked
//to add a feature that identifies the next person who can be 
//removed from quarantine (assuming they haven't developed
//symptoms). Multiple attempts to add someone do not affect their 
//removal order; a person is eligible for removal 14 days after
//they entered quarantine.

import java.util.*;
public class PersonQueue{
  private Queue<Person> queue = new LinkedList<Person>();
  
  public void addPerson(Person p){
    if (queue.contains(p) == false){
      queue.add(p);
    }
  }

  public Person getNextRemove(){
    return queue.poll();
  }
}