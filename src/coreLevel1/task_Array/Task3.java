package coreLevel1.task_Array;

/**
 * 3. Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 *    2-х двумерных массивов.
 */

public class Task3 {

    public static void main(String[] args) {
        int[][] array2d = {
                {1,2,4},
                {2,3,4},
                {6,7,8}
        };int[][] array = {
                {1,2,4},
                {2,3,4},
                {6,7,8}
        };
        System.out.println(equals(array2d,array));

    }

    public static boolean equals(int[][] value,int[][] value2) {
        if (value.length != value2.length) {
            return false;
        }
        for (int i = 0; i < value.length; i++) {
            int[] row1 = value[i];
            int[] row2 = value2[i];
            if (row1.length != row2.length) {
                return false;
            }
            for (int j = 0; j < row1.length; j++) {
                if (row1[j] != row2[j]) {
                    return false;

                }
            }
        }
        return true;
    }


}
