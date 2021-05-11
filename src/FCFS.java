public class FCFS
{
	static void tt(int n,int bt[],int at[])
	{
		int ct[]=new int[n] ;				//completion time
		int ctt[]= new int[n+1];
		ctt[0]=0;
		for(int i=0;i<n;i++)
		{
			ct[i]=bt[i]+ctt[i];
			ctt[i+1]=ct[i];
		}
		int tt[]=new int[n];				//turn around time = completion time - arrival time
		for(int i=0;i<n;i++)
		{
			tt[i]=ct[i]-at[i];
		}
		int wt[]=new int[n];				//waiting time = turn around time - burst time 
		for(int i=0;i<n;i++)
		{
			wt[i]=tt[i]-bt[i];
		}
		int total_tt=0,total_wt=0;	//total turn around time     //total waiting time
		System.out.printf("Processes Arrival time Burst time Waiting"
                +" time Turn around time\n");
		for(int i=0;i<n;i++)
		{
			total_tt=total_tt+tt[i];
			total_wt+=wt[i];
			System.out.printf(" %d ", (i + 1));
			 System.out.printf("   %d ", at[i]);
            System.out.printf("	 	 %d  ", bt[i]);
            System.out.printf("			%d", wt[i]);
            System.out.printf(" 			%d\n", tt[i]);
		}
		System.out.println("Total turn around time time "+total_tt);
		System.out.println("total waiting time "+total_wt);
		System.out.println("Average turn around time "+(total_tt)/n);
		System.out.println("Average waiting time "+(total_wt)/n);
	}
	
	
	public static void main(String[] agrs)
	{
		int n=3;
		int bt[]= {10,5,8};     //burst time
		int at[]= {0,1,2};      //arrival time
		tt(n,bt,at);
	}
} 
