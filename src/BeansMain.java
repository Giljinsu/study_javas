import beans.Datainfos;
import beans.MemberBean;

public class BeansMain {
    public static void main(String[] args) {
        Datainfos datainfos = new Datainfos();
        MemberBean memberBean = datainfos.getDataWithMemberBean();
        System.out.println(memberBean.getFirstName()+" "+memberBean.getSecondName()+" "+memberBean.getHandleName());
    }
}
