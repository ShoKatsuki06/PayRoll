package sample_main;

public class salaryCalculation {

	String startime;
	String endtime;
	int resttime;
	int salary;
	int allS = 0;



 public int calculation(String startime,String endtime,int resttime,int salary){

	 String Start[] = startime.split(":");
     String End[] = endtime.split(":");

     int StartTime = Integer.parseInt(Start[0]);
     int StartMinutes = Integer.parseInt(Start[1]);
     int EndTime = Integer.parseInt(End[0]);
     int EndMinutes = Integer.parseInt(End[1]);

 if(EndTime*60 >= 1320) {
 float minutesSalary = (float)salary/60;
 int normaltime = 1320 - (StartTime*60+StartMinutes) - resttime;

 int Ntime = normaltime/60;
 int Nminutes = normaltime%60;


 int NTSalary = Ntime*salary;
 float NMSalary = (minutesSalary * (float)Nminutes);
 float NallSalary = (float)NTSalary + NMSalary;


 int MidNightTime = (EndTime*60 + EndMinutes) - 1320;
 int Mtime = MidNightTime/60;
 int Mminutes = MidNightTime%60;

 float MidmSalary = (float)(Mtime * salary * 1.25);
 float MidtSalary = (float)(Mminutes * minutesSalary * 1.25);
 int MidNightSalary = (int)(MidmSalary + MidtSalary + NallSalary);



      allS += MidNightSalary;

}   else {
	float minutesSalary = (float)salary/60;
    int workminutes = (EndTime*60+EndMinutes) - (StartTime*60+StartMinutes);

    int Wtime = workminutes/60;
    int Wminutes = workminutes%60;


    int TSalary = Wtime*salary;
    double MSalary =  (Wminutes*minutesSalary);

    int allSalary = (int)(TSalary + MSalary);

    System.out.println(TSalary);
    System.out.println(MSalary);


     allS += allSalary;

}

 return allS;
 }
 }



