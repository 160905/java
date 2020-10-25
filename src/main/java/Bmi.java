/*BMI = 体重(kg)除以身高(m)的平方
正常：18.5-25
过重：25-28
肥胖：28-32
非常肥胖：高于32
过轻：低于18.5*/
public class Bmi {
    public static void main(String[] args) {
    String result = getBmi(75.0, 1.74);
        System.out.println(result);
    }

    public static String getBmi(Double bodyWeight, Double height) {
        String str = null;
        Double bmi = bodyWeight / Math.pow(height, 2);
        if(bmi <= 18.5) {
            str = "过轻:" + bmi;
        } else if(bmi <= 25 && bmi > 18.5) {
            str = "正常:" + bmi;
        } else if(bmi > 25 && bmi <= 28) {
            str = "过重:" + bmi;
        } else if(bmi > 28 && bmi <= 32) {
            str = "肥胖:" + bmi;
        } else {
            str = "非常肥胖";
        }

        return str;
    }
}
