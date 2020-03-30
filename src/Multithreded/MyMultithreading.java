package Multithreded;


class myThread extends Thread{
	
	
	
	
	
	public void run() {
	for (int i= 0;i<10;i++)
		{
			System.out.println("child Thread");
			Thread.yield();
		}
	}
	
}

public class MyMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		System.out.println(Thread.currentThread().getPriority());
		myThread t = new myThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		
		System.out.println("main method executed by thread"+ Thread.currentThread().getName());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		
		
		//Introduction to  multithreding concept
		//1.Ways to define the thread >>  by extending a ThreadClass or by implementing Runnable Interface
		//2.Getting and setting name of threads 
		//3.Thread priorities
		//4.Methods to prevent thread execution ..yield(), sleep(),join().
		//5.Synchronization
		//6.Inter-thread communication
		//7.deadlock
		//8.Daemon thread
		//9.Multithreading enhancements
		
		
		//Executing several tasks simultaneously called concept of multitasking.
		//there are two types of multitasking
		//1.ProcessBased multitasking and 2.thread based multitasking
		
		//Process based multitasking :Executing several tasks simultaneously where every task is 
		//separate independent program(process) is called process based multitasking..OS level multitasking
		//e.g while typing java program we can listen music from same system at the same time we can download a file 
		//net all these tasks will be executed simultaneously and independent of each other.
		
		//Thread based multitasking: Executing several tasks simultaneously where each task is a separate independent 
		//part of the same program is called as thread based multitasking.
		
		//objective of multitasking is to reduce response time of system to improve performance.
		
		//yield method : yield method causes to pause the current executing thread to give
		//the chance for waiting threads of same priority //thread goes in the ready/runnable state 
		//after calling yield method.
		
		//join method: If a thread wants to wait until completing some other thread, then we should go for 
		//join method // Threads goes in to waiting state after calling join method.
		
		//Thread can interrupt the sleeping thread or waiting thread by using interrupt method of thread class
		//public void interrupt()
		
		//Synchronized keyword: synchronized is a modifier applicable only for methods and blocks but
		//not for classes and variables.//If a multiple threads are trying to operate simultaneously 
		//on the same java object then there may be a chance of data inconsistency problem to overcome this
		//problem we should go for synchronized keyword.
		//If a method are blocked declared as synchronized then at a time only on ethread allow to execute
		//that method are blocked on the given object so that data inconsistency problem will be resolved 
		
		
            
	}

}
