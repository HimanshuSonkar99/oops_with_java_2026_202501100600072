// Scenario: A cinema's online booking system allows two counters to sell tickets for the same show simultaneously, 
// represented as two threads. Only 3 tickets remain. If both counters read and update the ticket count at the same 
// time without protection, two customers could be sold the same last ticket. The system must ensure ticket allotment happens safely, 
// one customer at a time.
package usecaseofopps;

public class usecase5 {
        public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
 
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t2.setPriority(newPriority :10);
        t1.setname(name:"Counter1");
        t2.setName(name:"counter2");
        t1.start();
        t2.start();
 
        // TODO: set t1 priority to Thread.MAX_PRIORITY
        // TODO: start both threads
    }
}
class TicketCounter implements Runnable(){
    int availableTicket = 3;  
}
