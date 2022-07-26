package mdrims;

public class SugangVO {
    private int id;
    private int max_id;
    private int code;
    private int professor_id;
    private int student_id;
    private String state;
    private String extra;

    public int getId() {
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getMax_id() {
        return this.max_id;
    }
    public void setMax_id(int max_id){
        this.max_id = max_id;
    }
    public int getCode(){
        return this.code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getProfessor_id() {
        return professor_id;
    }
    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }
    public int getStudent_id() {
        return student_id;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "SugangVO{" +
                "id=" + id +
                ", max_id=" + max_id +
                ", code=" + code +
                ", professor_id=" + professor_id +
                ", student_id=" + student_id +
                ", state='" + state + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
