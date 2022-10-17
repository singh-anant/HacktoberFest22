//28
class RunnableDemo implements Runnable{
private Thread t;
private String threadName;
RunnableDemo(String name){
threadName=name;
System.out.println("Creating "+ threadName);
}
public void run(){
System.out.println("Running "+ threadName);
try{
for(int i=1;i<=50;i++){
if(threadName.equals("EVEN")){
Thread.sleep(100);
if(i%2==0)
System.out.println(threadName+" - "+(i));
}
else{
Thread.sleep(100);
if(i%2!=0)
System.out.println(threadName+" - "+(i));
}
}
}catch(InterruptedException e){
System.out.println("Thread " + threadName + " interrupted");
}
System.out.println("Thread " + threadName + " existing");
}
public void start(){
if(t==null){
t=new Thread(this,threadName);
t.start();
}
}
}
class TestEvenOddThread{
public static void main(String args[]){
RunnableDemo r1 = new RunnableDemo("EVEN");
r1.start();
RunnableDemo r2 = new RunnableDemo("ODD");
r2.start();
}
}