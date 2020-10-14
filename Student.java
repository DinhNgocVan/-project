public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor.
     * @param name n
     * @param address a
     * @param program p
     * @param year y
     * @param fee f
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Java str.
     * @return str
     */
    public String toString() {
        return "Student[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],program=" + program
                + ",year=" + year
                + ",fee=" + fee + "]";
    }
}
 