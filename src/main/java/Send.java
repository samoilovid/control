public interface Send<T> {
    String getTo();
    String getFrom();
    T getContent();
}
