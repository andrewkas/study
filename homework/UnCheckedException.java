package homework;
public class UnCheckedException {
    public static void main(String[] args) throws Throwable {
       try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("перехвачена ошибка компиляции");
            try {
                Throwable t1 = new Error();
                throw t1;
            } catch (Error ex) {
                errorexc();
            } finally {
                runtime();//обрабатываем ошибку компиляции, Error, и выходим на RunTimeException
                 }
        }
    }
    private static void runtime() throws RuntimeException {
        throw new RuntimeException("Что-то пошло не так!!! Много ошибок!!");
    }
    private static void errorexc() throws Error {
        throw new Error("Эрор!! Приложение аварийно завершилось!!!");
    }
}






