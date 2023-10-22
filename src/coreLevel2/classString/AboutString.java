package coreLevel2.classString;

public class AboutString {
    public static void main(String[] args) {
        long startTame = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            value.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time:" + (endTime - startTame));

    }

}






//    --------------------------------------------------------------------------------------------------
// написать функцию, разбивающюю строку на равные части по n символов и сохраняющую отдельные части масива.
// вывести этот массив
//    public static void main(String[] args) {
//        String value = "34567890";
//        int n = 3;
//        String[] result = split(value, n);
//        System.out.println(Arrays.toString(result));
//    }
//
//    public static String[] split(String value,int n){
//        int arraySize = (int)Math.ceil(value.length() / (double) n);
//        String[] result = new String[arraySize];
//        int couter = 0;
//        for (int i = 0; i < value.length(); i += n) {
//            int endIndex = Math.min(value.length(), i + n);
//            String substring = value.substring(i, endIndex);
//            result[couter] = substring;
//            couter++;
//        }
//        return result;

//    }


//    ---------------------------------------------------------------------------------------------
//// посчитать количество всех точек, запятых и восклицательных знаков в строке
//    public static void main(String[] args) {
//        String value = "sdfsf .,! fdsf,.! sdfds,.! fsf";
//        System.out.println(count(value));
//    }
//
//    public static int count(String value){
//        String result = value
//                .replace(".", "")
//                .replace(",", "")
//                .replace("!", "");
//        return value.length() - result.length();
//    }






////    -------------------------------------------------------------------------------------------
//// Написать функцию принимающею в качестве параметров имя фамилию и отчество и возвращающую инициалы
//// в формате И.Ф.О .Учесть что входные параметры могут быть в любом регистре. А результирующая
//// строчка должна быть в верхнем регистре
//    public static void main(String[] args) {
//        String result = format("ivan", "Petrov", "SADKFJ");
//        System.out.println(result);
//
//    }
//
//    public static String format(String firstName,String lastName,String patronymicName){
////        char firstNameChar = firstName.toUpperCase().charAt(0);
////        char lastNameChar = lastName.toUpperCase().charAt(0);
////        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);
//
//        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
//        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
//        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
//
////        return firstNameChar + " . " + lastNameChar + ". " + patronymicNameChar ;
//        return String.format("%s.%s.%s",firstNameChar,lastNameChar,patronymicNameChar);
//
//
//
//    }



//    -----------------------------------------------------------------------------------------------
//    написать функцию. принимающюю 2 параметра: строку и слово и возврашаюшуюю true, если строка начинаеться и заканчиваеться этим словом
//    public static void main(String[] args) {
//        String value ="123 dsafa dsfd 123";
//        String word = "123";
//        System.out.println(isStartAndEnd(value,word));
//
//    }
//    private static boolean isStartAndEnd(String target,String word){
//        return target.startsWith(word) && target.endsWith(word);
//    }

//-----------------------------------------------------------------------------------------------------
////    заменить все грустные смыйлы в строке на веселые
//    public static void main(String[] args) {
//        String value = "asfasdf :( sfdsdf :) asfasdf :( sfdsdf :) asfasdf :( sfdsdf :)";
//        String result = replace(value);
//        System.out.println(result);
//    }
//
//    public static String replace(String value){
//        return value.replace(":(",":)");
//
//    }

