package hw9;

public class Main {
    static int SIZE = 4;
    public static void main(String[] args){
        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try{
            System.out.println(sum(array));
        } catch (MyArraySizeException exception) {
            exception.printStackTrace();
        } catch (MyArrayDataException exception) {
            exception.printStackTrace();

            System.out.println(exception.getRow() + " " + exception.getColumn());
            System.out.println(array[exception.getRow()][exception.getColumn()]);
        }

        System.out.println("End");
    }

    static int sum(String array[][])throws MyArrayDataException, MyArraySizeException {
        if (array.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception){
                    throw new MyArrayDataException("Format" + i + " " + j,i,j);
                }

            }
        }
        return sum;
    }
}
