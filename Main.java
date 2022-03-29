//After a successful debut of your application as described
//in the previous part, a critic notices that there isn't any way
//to identify people who are ready to leave quarantine. Because 
//quarantines are only meant to last 14 days, you have been asked
//to add a feature that identifies the next person who can be 
//removed from quarantine (assuming they haven't developed
//symptoms). Multiple attempts to add someone do not affect their 
//removal order; a person is eligible for removal 14 days after
//they entered quarantine.

class Main {
  public static void main(String[] args) {
    Person p1 = new Person(220);
    Person p2 = new Person(205);
    Person p3 = new Person(292);

    PersonQueue q = new PersonQueue();

    //although p1 is add 2 times, it does not affect the order of p1
    q.addPerson(p1);
    q.addPerson(p1);
    q.addPerson(p3);
    //although p1 is add 1 more time, it does not affect the order of p1
    q.addPerson(p1);
    q.addPerson(p2);

    System.out.println(q.getNextRemove());
    System.out.println(q.getNextRemove());
    System.out.println(q.getNextRemove());
    //no person left in the queue
    System.out.println(q.getNextRemove());
  }
}