package exeat;
public class userRegistration
{
    String userid,firstname,surname,othername,address,phonenumber,username,password;

    String indexnumber,dateofbirth,programme,housenumber,recorded;
    int age;

    //Method to save user Account
    public void saveUserAccount(String uid,String fn,String sn,String ons,String addr, String phone, String uname,String pwd)
    {
        this.userid= uid;
        this.firstname = fn;
        this.surname = sn;
        this.othername = ons;
        this.address = addr;
        this.phonenumber = phone;
        this.username = uname;
        this.password = pwd;
    }

    //Method to Save Student Account

    public void saveStudentAccount(String inum,String fn,String sn,String ons,String dob,int age,String addr,String prg,String hn, String recby)
    {
        this.indexnumber = inum;
        this.firstname = fn;
        this.surname = sn;
        this.othername = ons;
        this.dateofbirth = dob;
        this.age = age;
        this.address = addr;
        this.programme = prg;
        this.housenumber = hn;
        this.recorded = recby;
    }
}