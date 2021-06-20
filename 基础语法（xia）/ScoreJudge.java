public class ScoreJudge{
    public static void main(String args[]){
        int score = 78;
        if(score >= 90){
            System.out.println("成绩优秀");
        }
        else if(score >= 80){
            System.out.println("成绩良好");
        }
        else if(score >= 60){
            System.out.println("成绩及格");
        }
        else{
            System.out.println("需要补考");
        }
    }
}