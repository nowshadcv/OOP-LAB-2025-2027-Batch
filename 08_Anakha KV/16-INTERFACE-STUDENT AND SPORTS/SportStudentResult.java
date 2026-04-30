import java.util.Scanner;

interface student{
	void displayscore();
}
interface sports{
	void displaysportsscore();
}
class result implements student,sports{
	int academicScore;
    int sportsScore;
    
    result(int ac, int sp) {
        academicScore = ac;
        sportsScore = sp;
    }
	public void displayscore() {
		System.out.println("Academic score is:"+academicScore);
		}
	
	public void displaysportsscore() {
		System.out.println("Sports score is:"+sportsScore);
		}

	}
public class SportStudentResult {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student academic score: ");
        int ac = sc.nextInt();
        System.out.println("Enter the student sports score: ");
        int sp = sc.nextInt();
		result r=new result(ac, sp);
		r.displayscore();
		r.displaysportsscore();
		sc.close();
	}
}