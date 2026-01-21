package condicionales;

public class Condicionales {
    static void main(String[] args) {
        int age = 19;
        double average = 7.5;

        boolean isAdult = age>18;
        boolean hasPassingGrade = average>7;

        if (isAdult && hasPassingGrade) {
            IO.println("Cumple los requisitos");
        }

//        int day = 3;
//        switch (day) {
//            case 1:
//                IO.println("Lunes");
//                break;
//            case 2:
//                IO.println("Martes");
//                break;
//            case 3:
//                IO.println("Miercoles");
//                break;
//            case 4:
//                IO.println("Jueves");
//                break;
//            case 5:
//                IO.println("Lunes");
//                break;
//            case 6:
//                IO.println("Lunes");
//                break;
//            case 7:
//                IO.println("Lunes");
//                break;
//            default:
//                IO.println("No existe el dia");
//        }
    }
}
