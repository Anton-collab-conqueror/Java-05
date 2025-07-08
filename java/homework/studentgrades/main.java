package homework.studentgrades;

public class main {
    public static void main(String[] args) {
        //створюємо масив оцінок
        double[] myGrades={34.5,56.0,23.5,90.00};
        //cтворюємо обєкт student grades
        StudentGrades student=new StudentGrades(myGrades);
        //викликаємо методи та виводимо результати
        System.out.println("середня оцінка " +student.getAverege());
        System.out.println("максимальна оцінка " +student.getMaxGrade());
        System.out.println("мінімальна оцінка " +student.getMinGrade());
        System.out.println("є оцінка > 85:"+student.hasGradeAbove(85));

    }
}
