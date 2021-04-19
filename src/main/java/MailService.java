import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Send<T>> {

    private Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {

            return super.getOrDefault(key, new LinkedList<T>());
        }
    };


    public Map<String, List<T>> getMailBox() {

        return mailBox;
    }


    @Override
    public void accept(Send<T> send) {

        mailBox.put(send.getTo(), Arrays.asList(send.getContent()));
    }
}
