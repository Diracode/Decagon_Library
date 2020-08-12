package utility;

import com.decagon.BookRequest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * custom priortyQueue to sort order of lending out books.
 * boolean field specifies when to lend book in First in First Out order (false)
 * and when to lend book in Role sorted order (true).
 * @param <B>
 */
public class PriorityList<B> {
    private List<BookRequest> priorityQueue = new ArrayList<BookRequest>();
    private boolean priority;

    public PriorityList() {
        this(true);
    }

    public PriorityList(boolean priority) {
        this.priority = priority;
    }

    /**
     * method implement request sorting order behaviour.
     * @param request
     * @return
     */
   public boolean offer(BookRequest request) {
        // if its second implementation, then add users by
       // first come first serve
       if (!priority) return priorityQueue.add(request);
       boolean flag = true;
       if (size() == 0) priorityQueue.add(request);
       else {
           for (int i = 0; i < size(); i++) {
               if (priorityQueue.get(i).getBookName().equals(request.getBookName())) {
                   if (request.getPerson().getRole().compareTo(priorityQueue.get(i).getPerson().getRole()) < 0) {
                       priorityQueue.add(i, request);
                       flag = false;
                       break;
                   } else {
                       continue;
                   }
               }
           }
           if (flag) priorityQueue.add(request);
       }
       return !flag;
   }

   public BookRequest poll() {
       return priorityQueue.remove(0);
   }
   public BookRequest peek() {
       return priorityQueue.get(0);
   }
   public int size () {
        return priorityQueue.size();
   }

    @Override
    public String toString() {
        return priorityQueue.toString();
    }
}
