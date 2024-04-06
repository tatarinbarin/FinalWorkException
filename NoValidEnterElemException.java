package FinalWork;

/**
 * Неволидный ввод данных (подкласс исключения)
 */
public class NoValidEnterElemException extends RuntimeException{

    public NoValidEnterElemException(String s) {
        super(s);
    }
    
}

