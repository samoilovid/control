public class Salary implements Send<Integer> {
    private String from;
    private String to;
    private int salary;

    public Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public Integer getContent() {
        return getSalary();
    }

    @Override
    public String toString() {
        return "SalaryService{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", salary=" + salary +
                '}';
    }
}