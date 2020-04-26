public class Subject {
    private String id;
    private String teacher;
    private String subjectName;
    private int lesson;
    private int numberOfTest;
    private int amountOfInfo;

    public Subject() {
    }

    public Subject(String id, String teacher, String subjectName, int lesson, int numberOfTest, int amountOfInfo) {
        this.id = id;
        this.teacher = teacher;
        this.subjectName = subjectName;
        this.lesson = lesson;
        this.numberOfTest = numberOfTest;
        this.amountOfInfo = amountOfInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public int getNumberOfTest() {
        return numberOfTest;
    }

    public void setNumberOfTest(int numberOfTest) {
        this.numberOfTest = numberOfTest;
    }

    public int getAmountOfInfo() {
        return amountOfInfo;
    }

    public void setAmountOfInfo(int amountOfInfo) {
        this.amountOfInfo = amountOfInfo;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", teacher='" + teacher + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", lesson=" + lesson +
                ", numberOfTest=" + numberOfTest +
                ", amountOfInfo=" + amountOfInfo +
                '}';
    }
}
