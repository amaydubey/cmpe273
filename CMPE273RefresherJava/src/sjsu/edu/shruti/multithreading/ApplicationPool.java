package sjsu.edu.shruti.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable
{
    private String name;

    public String getName() {
		return name;
	}
	Processor(String name)
    {
        this.name="Processor "+name;
    }
    @Override
    public void run()
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        System.out.println(this.name + " Starting : " + time);
        try
        {
        	Thread.sleep(5000);
        }
       catch (InterruptedException ignored) 
        {
    	   System.out.println("Thread interrupted.");
        }
        date = new Date();
        time = simpleDateFormat.format(date);
        System.out.println(this.name + " Completed : " + time);
    }
}

public class ApplicationPool
{

    public static final int NO_OF_PROCESSORS = 5;
    public static final int TIMEOUT = 5;
    public static final int THREADS_IN_POOL = 3;

    public static void main(String arguments[]) throws InterruptedException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(THREADS_IN_POOL);
        for(int counter = 0;counter < NO_OF_PROCESSORS;counter ++)
        {
            executorService.submit(new Processor(String.valueOf(counter)));
        }
        System.out.println("All requests are Submitted...");
        executorService.shutdown();
        executorService.awaitTermination(TIMEOUT, TimeUnit.MINUTES);
    }
}
