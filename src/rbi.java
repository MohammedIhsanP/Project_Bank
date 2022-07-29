public class rbi {

    public void rate_of_interest(){
        System.out.println("7%");
    }

    public static void main(String[] args) {
        rbi rate_1=new rbi();
        rate_1.rate_of_interest();
        rbi rate_2=new sbi();
        rate_2.rate_of_interest();
        rbi rate_3=new icici();
        rate_3.rate_of_interest();
        rbi rate_4=new hdfc();
        rate_4.rate_of_interest();
        rbi rate_5=new axis();
        rate_5.rate_of_interest();
        rbi rate_6=new pnb();
        rate_6.rate_of_interest();
    }
}


