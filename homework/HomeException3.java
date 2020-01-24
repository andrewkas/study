package homework;

import java.io.IOException;

public class HomeException3  {
    public static void ioException() throws IOException {
        throw new IOException("Введен недопустимый символ!!! Необходимо вводить только цифры!");
    }
}
