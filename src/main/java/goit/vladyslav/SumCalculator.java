package goit.vladyslav;

public class SumCalculator {

    public int sum (int n){
        if (n <= 0){
            throw new IllegalArgumentException("Число должно быть > 0.");
        }
        int res = 0;
        for (int i = 0; i <= n; i ++){
            res += i ;
            if (res < 0) {
                throw new IllegalArgumentException("Вы ввели слишком большое число");
            }
        }
        return  res;
    }
}