package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 15;

        if(age <= 7){
            System.out.println("미취학");
        } else if(age <= 13){  // else if 만에 조건은 ( age > 7 && age <= 13 ) 이거랑 같다.
            System.out.println("초등학생");
        } else if (age <= 16){
            System.out.println("중학생");
        }else if(age <= 19){
            System.out.println("고등학생");
        }else{
            System.out.println("성인");
        }
    }
}
