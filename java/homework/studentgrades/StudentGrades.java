package homework.studentgrades;

public class StudentGrades{

    double[] grades;
    //конструктор приймає масив оцінок при створені обєктів
    public StudentGrades(double[]grades){

        this.grades=grades;
    }

    public double getAverege(){
        double sum=0;
        for (int i=0; i< grades.length; i++){sum += grades[i];
    }
        return sum / grades.length;

}
    //метод який знаходить найвищу оцінку
    public double getMaxGrade(){
        double max=grades[0];//припускаємо що перша оцінк найвища
        //перевіряємо кожну оцінку
        for(int i=1;i<grades.length;i++){
            if (grades[1]>max){
                max=grades[i];//зберігаємо нову найвищу оцінку
            }
        }
        return max;
    }
    //метод для знаходження найнищої оцінки
    public double getMinGrade(){
        double min=grades[0];
                //перевіряємо кожну оцінку
        for(int i=1;i< grades.length;i++){
            if (grades[i]<min) {
                min=grades[i];
            }
        }
        return min;
    }
    // Метод, який перевіряє, чи є хоч одна оцінка вище заданого порогу
    public boolean hasGradeAbove(double threshold) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > threshold) {
                return true; // Якщо знайшли — повертаємо true
            }
        }
        return false; // Якщо жодна оцінка не перевищує поріг
    }
}

