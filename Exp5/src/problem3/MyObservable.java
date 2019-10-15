package problem3;

import java.util.Observable; import java.util.Observer;

public class MyObservable extends Observable 
{ 
	String info = "";
	public MyObservable (String info)
		{ this.info = info;
		
		// add observer 2
		this.addObserver(new Observer(){
			  
				@Override
				public void update(Observable o, Object arg) {
					System.out.println("Observer 1 updated for <My MyObservable>");// TODO Auto-generated method stub
					
				}
		}); // add observer 1
		
		this.addObserver(new Observer(){
			
				@Override
				public void update(Observable o, Object arg) {
					System.out.println("Observer 2 updated for <My MyObservable>");// TODO Auto-generated method stub
					
				}
		});
	}

	public static void main(String[] args) {
		MyObservable obs = new MyObservable ("My MyObservable");
		obs.setChanged();
		obs.notifyObservers();

	}
}