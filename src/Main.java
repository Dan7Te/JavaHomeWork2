import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        1. Функция для нахождения максимума
//        Напишите функцию, которая принимает два числа и возвращает максимальное из них.
//        Если числа равны, выбрасывайте исключение с сообщением об ошибке.
        System.out.println("Введите числа для сравнения");
        int a = in.nextInt();
        int b = in.nextInt();
        try{
            System.out.println(FindMax(a, b));
        } catch (EqualsError ee){
            System.out.println("Ошибка: " + ee.getMessage());
        }


//        2. Калькулятор деления
//        Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте
//        ArithmeticException с сообщением о недопустимости деления на ноль.
        System.out.println("Введите числа для деления");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        try{
            System.out.println(Devider(a1, b1));
        } catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());
        }



//        3. Конвертер строк в числа
//        Напишите функцию, которая принимает строку и пытается конвертировать её в целое число.
//        Если строка не может быть конвертирована, выбрасывайте NumberFormatException.
        System.out.println("Введите строку для конвертации в число");
        String str = in.next();
        try{
            System.out.println(ConvertStr(str));
        } catch (NumberFormatException e){
            System.out.println("Ошибка: " + e.getMessage());
        }


//        4. Проверка возраста
//        Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.
        System.out.println("Введите возраст");
        int age = in.nextInt();
        try{
            System.out.println(GetAge(age));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }


//        5. Нахождение корня
//        Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.
        System.out.println("Введите чило для получения корня");
        int root = in.nextInt();
        System.out.println("Введите степень корня");
        int rootPow = in.nextInt();
        try{
            System.out.println(GetRoot(root, rootPow));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        6. Факториал
//        Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.
        System.out.println("Введите чило для получения факториала");
        int fac = in.nextInt();
        try{
            System.out.println(GetFac(fac));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        7. Проверка массива на нули
//        Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы");
        for(int i = 0; i< size; i++){
            arr[i] = in.nextInt();
        }

        try{
            if(HaveZeros(arr)) System.out.println("Массив не содержит нули");
        } catch (IllegalArgumentException e){
            System.out.println("Массив содержит нули " + e.getMessage());
        }


//        8. Калькулятор возведения в степень
//        Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
        System.out.println("Введите чило для получения степени");
        int num = in.nextInt();
        System.out.println("Введите степень");
        int pow = in.nextInt();
        try{
            System.out.println(GetPow(num, pow));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        9. Обрезка строки
//        Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку,
//        обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение
        System.out.println("Введите строку для получения подстроки");
        String str1 = in.next();
        System.out.println("Введите число символов");
        int quan = in.nextInt();
        try{
            System.out.println(GetSub(str1, quan));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }


//        10. Поиск элемента в массиве
//        Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.
        System.out.println("Введите размер массива");
        int size1 = in.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Введите элементы");
        for(int i = 0; i< size1; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Введите элемент, который нужно найти");
        int find = in.nextInt();

        try{
            if(FindEl(arr1, find)) System.out.println("Массив содержит указанное число");
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        11. Конвертация в двоичную систему
//        Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.
        System.out.println("Введите число для перевода в двоичную систему");
        int binNum = in.nextInt();
        try{
            System.out.println(ConvertToBinary(binNum));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        12. Проверка делимости
//        Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе.
//        Если второе число равно нулю, выбрасывайте ArithmeticException.
        System.out.println("Введите делимое");
        int devisible = in.nextInt();
        System.out.println("Введите делитель");
        int devider = in.nextInt();

        try{
            System.out.println(CheckDivisibility(devisible, devider));
        } catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        13. Чтение элемента списка
//        Напишите функцию, которая возвращает элемент списка по индексу.
//        Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.
        System.out.println("Введите размер массива");
        int size2 = in.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Введите элементы");
        for(int i = 0; i< size2; i++){
            arr2[i] = in.nextInt();
        }
        System.out.println("Введите индекс элемента");
        int findInd = in.nextInt();

        try{
            System.out.println(FindElIndex(arr2, findInd));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Ошибка: " + e.getMessage());
        }


//        14. Парольная проверка
//        Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов,
//        выбрасывайте исключение WeakPasswordException.

        System.out.println("Введите пароль");
        String password = in.next();

        try{
            System.out.println(CheckPassStrongness(password));
        } catch (WeakPasswordException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        15. Проверка даты
//        Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
//        Если формат неверен, выбрасывайте DateTimeParseException.
        System.out.println("Введите дату для проверки");
        String date = in.next();

        try{
            System.out.println(CheckDateConvert(date));
        } catch (DateTimeParseException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        16. Конкатенация строк
//        Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.
        System.out.println("Введите первую строку");
        in.nextLine();
        String firstStr = in.nextLine();
        System.out.println("Введите вторую строку");
        String secondStr = in.nextLine();


        try{
            System.out.println(StringConcat(firstStr, secondStr));
        } catch (NullPointerException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        17. Остаток от деления
//        Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.
        System.out.println("Введите делимое");
        int devisible1 = in.nextInt();
        System.out.println("Введите делитель");
        int devider1 = in.nextInt();

        try{
            System.out.println(RemainderOfDivision(devisible1, devider1));
        } catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());
        }


//        18. Квадратный корень
//        Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.
        System.out.println("Введите чило для получения квадратного корня");
        int root1 = in.nextInt();
        try{
            System.out.println(GetSqrtRoot(root1));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        19. Конвертер температуры
//        Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт.
//        Если температура меньше абсолютного нуля, выбрасывайте исключение.
        System.out.println("Введите температуру в градусах Цельсия");
        int temp = in.nextInt();
        try{
            System.out.println(GetTemp(temp));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

//        20. Проверка строки на пустоту
//        Создайте функцию, которая проверяет, является ли строка пустой или null.
//        Если строка пустая или равна null, выбрасывайте исключение.
        System.out.println("Введите строку");
        in.nextLine();
        String str2 = in.nextLine();
        try{
            System.out.println(CheckNullString(str2));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    //Функция для задачи 1
    public static int FindMax(int a, int b) throws EqualsError{
        if(a>b) return a;
        else if(b>a) return b;
        else throw new EqualsError("Числа равны");

    }

    //Функция для задачи 2
    public static int Devider(int a, int b) throws ArithmeticException{
        if(b == 0) throw new ArithmeticException();
        return a/b;
    }

    //Функция для задачи 3
    public static int ConvertStr(String str) throws NumberFormatException{
        return parseInt(str);
    }

    //Функция для задачи 4
    public static int GetAge(int a) throws IllegalArgumentException{
        if(a < 0 || a>150) throw new IllegalArgumentException();
        else return a;
    }

    //Функция для задачи 5
    public static double GetRoot(int a, int b) throws IllegalArgumentException{
        if(a < 0) throw new IllegalArgumentException();
        else return Math.pow(a, 1/b);
    }

    //Функция для задачи 6
    public static double GetFac(int a) throws IllegalArgumentException{
        if(a < 0) throw new IllegalArgumentException();
        else return getFactorial(a);
    }

    public static int getFactorial(int f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }

    //Функция для задачи 7
    public static boolean HaveZeros(int[] a) throws IllegalArgumentException{
        if(Arrays.stream(a).anyMatch(i -> i == 0)) throw new IllegalArgumentException();
        else return true;
    }

    //Функция для задачи 8
    public static double GetPow(int a, int b) throws IllegalArgumentException{
        if(b < 0) throw new IllegalArgumentException();
        else return Math.pow(a,b);
    }

    //Функция для задачи 9
    public static String GetSub(String a, int b) throws IllegalArgumentException{
        if(b > a.length()) throw new IllegalArgumentException();
        else return a.substring(0,b);
    }

    //Функция для задачи 10
    public static boolean FindEl(int[] a, int b) throws IllegalArgumentException{
        if(Arrays.stream(a).anyMatch(i -> i == b)) return true;
        else throw new IllegalArgumentException();
    }

    //Функция для задачи 11
    public static String ConvertToBinary(int a) throws IllegalArgumentException{
        if (a < 0) throw new IllegalArgumentException();
        return Integer.toBinaryString(a);
    }

    //Функция для задачи 12
    public static boolean CheckDivisibility(int a, int b) throws ArithmeticException{
        if (b == 0) throw new ArithmeticException();
        return (a%b)==0;
    }

    //Функция для задачи 13
    public static int FindElIndex(int[] a, int b) throws IndexOutOfBoundsException{
        if(b > a.length) throw new IndexOutOfBoundsException();
        else return a[b];
    }

    //Функция для задачи 14
    public static String CheckPassStrongness(String b) throws WeakPasswordException{
        if(b.length() < 8) throw new WeakPasswordException("Слабый пароль");
        else return "Сильный пароль!";
    }

    //Функция для задачи 15
    public static String CheckDateConvert(String b) throws DateTimeParseException{
        //Pattern pattern = Pattern.compile("[0-3][0-9].[0-1][0-2].d{4}");
        //Matcher matcher = pattern.matcher(b);
        //Pattern.matches("[0-3][0-9].[0-1][0-2].d{4}", b);
        if(Pattern.matches("[0-3][0-9].[0-1][0-2].\\d{4}", b)) return b;
        else throw new DateTimeParseException("Дата не соответствует шаблону");
    }

    //Функция для задачи 16
    public static String StringConcat(String a, String b) throws NullPointerException{
        if(a == "" || b == "") throw new NullPointerException();
        else return a + b;
    }

    //Функция для задачи 17
    public static int RemainderOfDivision(int a, int b) throws ArithmeticException{
        if(b == 0) throw new ArithmeticException();
        else return a % b;
    }

    //Функция для задачи 18
    public static double GetSqrtRoot(int a) throws IllegalArgumentException{
        if(a < 0) throw new IllegalArgumentException();
        else return Math.sqrt(a);
    }

    //Функция для задачи 19
    public static double GetTemp(int a) throws IllegalArgumentException{
        if(a < -273.15) throw new IllegalArgumentException();
        else return 9 / 5 * a + 32;
    }

    //Функция для задачи 20
    public static String CheckNullString(String a) throws IllegalArgumentException{
        if(a.isEmpty() || a == null) throw new IllegalArgumentException();
        else return "Строка не пустая";
    }
}

//Класс ошибки для задачи 1
class EqualsError extends Exception {
    public EqualsError(String message) {
        super(message);
    }
}

//Класс ошибки для задачи 14
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

//Класс ошибки для задачи 15
class DateTimeParseException extends Exception {
    public DateTimeParseException(String message) {
        super(message);
    }
}

