
class thread_example1 implements Runnable {
    @Override
    public void run() {
    }
    public static void main(String[] args) {
	System.out.print("Here it come");
        Thread guruthread1 = new Thread();
Thread guruthread2 = new Thread("newOne");
        guruthread1.start();
		guruthread2.start();
	try{
        	guruthread2.sleep(3000);
}catch(Exception e)
	{
		System.out.print("here");	
}
        try {

		System.out.println("In Try");
		guruthread2.getName();
           	guruthread1.sleep(5000);
		guruthread1.getName();
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        guruthread1.setPriority(1);
        int gurupriority = guruthread1.getPriority();
        System.out.println(gurupriority);
        System.out.println("Thread Running");

  }
}