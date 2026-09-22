public class Course {

    String name;

    int course_number;

    int credit;

    private String classroom;

    //Students
    // Instructor

    Course(){
        name = "";
        course_number = 0;
        credit = 0;
    }

    Course( int course_number, int credit, String name){
        this.course_number = course_number;
        this.credit = credit;
        this.name = name;

    }
    // Setters and getters are similar to methods
    // Method signatures: Access_modifier Return_type Method_name (param_type Param_name) {}
    // Return types: void, string, int,

    public void Set_Classroom(String classroom){
        this.classroom = classroom;
    }

    public String get_classroom (){
        return this.classroom;
    }

    //Method for displaying attribute values

    public void display_course_information (){
        System.out.println("Course name:" + this.name +" Course number: " + this.course_number);
    }
}
