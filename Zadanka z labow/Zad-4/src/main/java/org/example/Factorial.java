package org.example;

public class Factorial
{
    public static int factional(int x) //może zostać rzucony w dowolnym miejscu, ale nie musisz go obsługiwać (możesz, ale nie jest to wymagane)
    {
            if (x == 0)
                return 1;
            else if (x<0)
            {
               // throw new IllegalArgumentException("Silnia z ujemnej liczny");
                IllegalArgumentException exception = new IllegalArgumentException("Silnia z ujemnej liczby");
                exception.printStackTrace();
                throw exception;
            }
            else return x * factional(x - 1);
    }
    public static int factional1(int x) throws MyException //deklarujesz, że może być rzucony MyException, co zobowiązuje cię do obsłużenia go lub propagacji dalej (używając throws).
    {
        if (x<0)
        {
            //throw new MyException("Silnia z ujemnej liczny");
            MyException exception = new MyException("Silnia z ujemnej liczby");
            exception.printStackTrace();
            throw exception;
        } else if (x==0) return 1;
        else  return x * factional1(x - 1);
    }


}





/*
public class MathUtil {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
Możemy jej używać bez tworzenia instancji klasy,
np. int result = MathUtil.factorial(5);

////////////////////////////////////////////////////////////
private static int count = 0; // pole statyczne

Pola statyczne są współdzielone przez wszystkie obiekty klasy
 i są inicjowane tylko raz, gdy klasa jest ładowana przez maszynę wirtualną.
  W przeciwieństwie do pól niestatycznych, pola statyczne mogą być odczytywane
  i modyfikowane bez tworzenia instancji klasy. Są one często używane do przechowywania
  danych, które są wspólne dla wszystkich obiektów klasy, np. stałych lub liczników.



*/